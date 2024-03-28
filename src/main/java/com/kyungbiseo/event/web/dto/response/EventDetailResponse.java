package com.kyungbiseo.event.web.dto.response;

import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

public record EventDetailResponse(Long id,
								  String name,
								  EventType type,
								  String scheduledAt,
								  EventPriority priority,
								  String recommendedGreetings,
								  int expectedAmount,
								  EventDetailFriend friend) {

	public EventDetailResponse(Long id) {
		this(
			31L,
			"강인이 생일",
			EventType.BIRTHDAY,
			"2024-03-09T00:00",
			EventPriority.CRUCIAL,
			"미역국 먹어라",
			100000,
			new EventDetailFriend()
		);
	}
}
