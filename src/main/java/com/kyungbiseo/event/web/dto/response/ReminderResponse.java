package com.kyungbiseo.event.web.dto.response;

import java.time.LocalDate;
import java.util.List;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventPriority;

public record ReminderResponse(LocalDate date,
							   List<ReminderEvent> events,
							   int count) {
	public static ReminderResponse of(LocalDate date, List<Event> reminderEvents) {

		return new ReminderResponse(
			date,
			reminderEvents.stream()
				.map(ReminderEvent::from)
				.toList(),
			reminderEvents.size());
	}

}
