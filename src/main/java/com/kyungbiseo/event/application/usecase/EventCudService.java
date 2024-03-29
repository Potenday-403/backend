package com.kyungbiseo.event.application.usecase;

import org.springframework.stereotype.Service;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;
import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventRepository;

import lombok.RequiredArgsConstructor;

@Service
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

	}

	@Override
	public void deleteEventBy(Long id) {

	}
}
