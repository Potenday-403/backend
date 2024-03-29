package com.kyungbiseo.event.application.dto;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventAddCommand(String name,
							  EventType type,
							  EventPriority priority,
							  LocalDateTime scheduledAt,
							  Long userId,
							  Long friendId) {

	public Event toEvent() {
		Event event = Event.builder()
			.name(name)
			.type(type)
			.priority(priority)
			.scheduledAt(scheduledAt)
			.userId(userId)
			.build();

		if (friendId != null) {
			event.assignTo(friendId);
		}

		return event;
	}
}
