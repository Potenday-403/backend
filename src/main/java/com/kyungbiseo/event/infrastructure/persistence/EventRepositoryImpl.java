package com.kyungbiseo.event.infrastructure.persistence;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventRepository;

import lombok.RequiredArgsConstructor;

/**
 * 추후 exception 처리 필요
 */
@Repository
@RequiredArgsConstructor
public class EventRepositoryImpl implements EventRepository {
	private final EventJpaRepository eventJpaRepository;
	private final EventFriendJpaRepository eventFriendJpaRepository;

	@Override
	public void save(Event event) {
			EventJpaEntity toBeSaved = EventJpaEntity.from(event);
			EventJpaEntity saved = eventJpaRepository.save(toBeSaved);


		if (event.isAssigned()) {
			EventFriendJpaEntity eventFriendJPAEntity = EventFriendJpaEntity.of(saved.getId(), event.getFriendId());
			eventFriendJpaRepository.save(eventFriendJPAEntity);
		}
	}

	@Override
	public void update(Event event) {
		EventJpaEntity toBeUpdated = findEventJpaEntityBy(event.getId());
		toBeUpdated.updateFrom(event);

		Optional<EventFriendJpaEntity> eventFriendJpaOptional = eventFriendJpaRepository.findById(event.getId());

		if (!event.isAssigned()) {
			eventFriendJpaOptional.ifPresent(eventFriendJpaRepository::delete);
			return;
		}

		eventFriendJpaOptional.ifPresentOrElse(
			eventFriendJpaEntity -> {
				if (!eventFriendJpaEntity.getFriendId().equals(event.getFriendId())) {
					eventFriendJpaRepository.delete(eventFriendJpaEntity);

					eventFriendJpaRepository.save(
						EventFriendJpaEntity.of(event.getId(), event.getFriendId()));
				}
			},
			() -> eventFriendJpaRepository.save(EventFriendJpaEntity.of(event.getId(), event.getFriendId()))
		);
	}

	@Override
	public void deleteBy(Long id) {
		EventJpaEntity eventJpaEntity = findEventJpaEntityBy(id);

		Optional<EventFriendJpaEntity> eventFriendJpaOptional =
			eventFriendJpaRepository.findById(eventJpaEntity.getId());
		eventFriendJpaOptional.ifPresent(eventFriendJpaRepository::delete);

		eventJpaRepository.delete(eventJpaEntity);
	}

	@Override
	public Event findBy(Long id) {
		return findEventJpaEntityBy(id)
			.toEvent();
	}

	private EventJpaEntity findEventJpaEntityBy(Long id) {
		return eventJpaRepository.findById(id)
												.orElseThrow(RuntimeException::new);
	}
}
