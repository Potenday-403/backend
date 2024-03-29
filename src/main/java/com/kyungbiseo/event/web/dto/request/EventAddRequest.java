package com.kyungbiseo.event.web.dto.request;

import java.time.LocalDateTime;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventAddRequest(Long friendId,
							  String name,
							  EventType type,
							  LocalDateTime scheduledAt,
							  EventPriority priority) {
	public EventAddCommand toCommandWith(Long userID) {
		if (friendId == null) {
			return new EventAddCommand(name, type, priority, scheduledAt, userID, null);
		}

		return new EventAddCommand(name, type, priority, scheduledAt, userID, friendId);
	}
}
