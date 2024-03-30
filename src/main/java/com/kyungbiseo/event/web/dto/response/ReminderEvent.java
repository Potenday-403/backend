package com.kyungbiseo.event.web.dto.response;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventPriority;

public record ReminderEvent(Long id,
							String name,
							LocalDateTime scheduledAt,
							EventPriority priority) {

	public static ReminderEvent from(Event event) {
		return new ReminderEvent(event.getId(), event.getName(), event.getScheduledAt(), event.getPriority());
	}
}
