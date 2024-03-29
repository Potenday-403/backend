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
		if (friendId == null) {
			return Event.notAssignedEventBuilder()
				.name(name)
				.type(type)
				.priority(priority)
				.scheduledAt(scheduledAt)
				.userId(userId)
				.build();
		}

		return Event.assignedEventBuilder()
			.name(name)
			.type(type)
			.priority(priority)
			.scheduledAt(scheduledAt)
			.userId(userId)
			.friendId(friendId)
			.build();
	}
}
