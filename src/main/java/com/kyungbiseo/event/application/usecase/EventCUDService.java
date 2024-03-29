package com.kyungbiseo.event.application.usecase;

import org.springframework.stereotype.Service;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;

@Service
public class EventCUDService implements EventCUDUseCase {
	@Override
	public void addEvent(EventAddCommand command) {

	}

	@Override
	public void editEvent(EventEditCommand command) {

	}

	@Override
	public void deleteEventBy(Long id) {

	}
}
