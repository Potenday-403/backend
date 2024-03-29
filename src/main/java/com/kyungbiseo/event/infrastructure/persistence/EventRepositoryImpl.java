package com.kyungbiseo.event.infrastructure.persistence;

import org.springframework.stereotype.Repository;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Repository
@Transactional
@RequiredArgsConstructor
public class EventRepositoryImpl implements EventRepository {
	private final EventJPARepository eventJPARepository;
	private final EventFriendJPARepository eventFriendJPARepository;

	@Override
	public void save(Event event) {

	}
}
