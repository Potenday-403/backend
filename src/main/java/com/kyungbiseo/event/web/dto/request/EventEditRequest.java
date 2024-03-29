package com.kyungbiseo.event.web.dto.request;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventEditRequest(Long friendId,
							   String name,
							   EventType type,
							   LocalDateTime scheduledAt,
							   EventPriority priority) {
}
