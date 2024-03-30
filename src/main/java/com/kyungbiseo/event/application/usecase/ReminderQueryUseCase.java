package com.kyungbiseo.event.application.usecase;

import java.time.LocalDate;
import java.util.List;

import com.kyungbiseo.event.domain.Event;

public interface ReminderQueryUseCase {
	List<Event> getReminderEventsAt(LocalDate date);
}
