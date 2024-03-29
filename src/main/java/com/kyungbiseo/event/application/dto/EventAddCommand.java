package com.kyungbiseo.event.application.dto;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventAddCommand(Long userId,
							  Long friendId,
							  String name,
							  EventType type,
							  LocalDateTime scheduledAt,
							  EventPriority priority) {
}
