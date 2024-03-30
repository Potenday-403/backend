package com.kyungbiseo.event.web.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventPriority;

record CalendarEvent(Long id,
							String name,
							EventPriority priority,
							@JsonIgnore int day,
							String time) {

	static CalendarEvent from(Event event) {

		return new CalendarEvent(
			event.getId(), event.getName(), event.getPriority(),
			event.getScheduledAt().getDayOfMonth()  ,event.getScheduledAt().toLocalTime().toString());
	}
}
