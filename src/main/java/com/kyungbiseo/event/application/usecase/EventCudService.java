package com.kyungbiseo.event.application.usecase;

import org.springframework.stereotype.Service;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;
import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class EventCudService implements EventCudUseCase {
	private final EventRepository eventRepository;
	@Override
	public void addEvent(EventAddCommand command) {
		Event event = command.toEvent();
		eventRepository.save(event);
	}

	@Override
	public void editEvent(EventEditCommand command) {
		Event edited = eventRepository.findBy(command.id());
		edited.edit(command.name(), command.type(), command.priority(), command.scheduledAt());
		edited.assignTo(command.friendId());
		eventRepository.update(edited);
	}

	@Override
	public void deleteEventBy(Long id) {
		eventRepository.deleteBy(id);
	}
}
