package com.kyungbiseo.event.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;
import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventCommandRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class EventCommandService implements EventCommandUseCase {
	private final EventCommandRepository eventCommandRepository;
	@Override
	public void addEvent(EventAddCommand command) {
		Event event = command.toEvent();
		eventCommandRepository.save(event);
	}

	@Override
	public void editEvent(EventEditCommand command) {
		Event toBeEdited = eventCommandRepository.findBy(command.id());
		toBeEdited.edit(command.name(), command.type(), command.priority(), command.scheduledAt());

		if (command.hasFriendId()) {
			toBeEdited.assignToFriendOf(
				command.friendId());
		}
		else {
			toBeEdited.disCharge();
		}

		eventCommandRepository.merge(toBeEdited);
	}

	@Override
	public void deleteEventsBy(List<Long> ids) {
		eventCommandRepository.deleteAllBy(ids);
	}
}
