package com.kyungbiseo.event.web.dto.response;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.EventPriority;

public record ReminderEvent(Long id,
							String name,
							String scheduledAt,
							EventPriority priority) {
}
