package com.kyungbiseo.event.application.dto;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventEditCommand(Long id,
							   String name,
							   EventType type,
							   EventPriority priority,
							   LocalDateTime scheduledAt,
							   Long userId,
							   Long friendId) {
}
