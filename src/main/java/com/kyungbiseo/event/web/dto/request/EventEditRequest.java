package com.kyungbiseo.event.web.dto.request;

import java.time.LocalDateTime;

import com.kyungbiseo.event.application.dto.EventEditCommand;
import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventEditRequest(Long friendId,
							   String name,
							   EventType type,
							   LocalDateTime scheduledAt,
							   EventPriority priority) {

	public EventEditCommand toCommandWith(Long id, Long userId) {
		if (friendId == null) {
			return new EventEditCommand(id, name, type, priority, scheduledAt, userId, null);
		}

		return new EventEditCommand(id, name, type, priority, scheduledAt, userId, friendId);
	}
}
