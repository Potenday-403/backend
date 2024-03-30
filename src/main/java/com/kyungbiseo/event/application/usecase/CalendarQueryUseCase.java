package com.kyungbiseo.event.application.usecase;

import java.util.List;

import com.kyungbiseo.event.domain.Event;

public interface CalendarQueryUseCase {
	List<Event> getEventsOn(int year, int month);
}
