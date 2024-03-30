package com.kyungbiseo.event.web.dto.response;

import com.kyungbiseo.event.domain.EventPriority;

record CalendarEvent(Long id,
							String name,
							EventPriority priority,
							String time) {
}
