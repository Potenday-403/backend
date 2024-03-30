package com.kyungbiseo.event.web.dto.response;

import java.time.LocalDateTime;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventDetailResponse(Long id,
								  String name,
								  EventType type,
								  LocalDateTime scheduledAt,
								  EventPriority priority,
								  String recommendedGreetings,
								  EventDetailFriend friend) {

	public static EventDetailResponse from(Event event) {

		return new EventDetailResponse(
			event.getId(), event.getName(), event.getType(), event.getScheduledAt(), event.getPriority(),
			"Default Greetings", null
		);
	}
}
