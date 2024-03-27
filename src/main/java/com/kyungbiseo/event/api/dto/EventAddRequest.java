package com.kyungbiseo.event.api.dto;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventAddRequest(Long friendId,
							  String name,
							  EventType type,
							  LocalDateTime scheduledAt,
							  EventPriority priority) {
}
