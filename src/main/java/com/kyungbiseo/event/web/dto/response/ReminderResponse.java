package com.kyungbiseo.event.web.dto.response;

import java.time.LocalDate;
import java.util.List;

import com.kyungbiseo.event.domain.EventPriority;

public record ReminderResponse(LocalDate date,
							   List<ReminderEvent> events,
							   int count) {
	public ReminderResponse(LocalDate date) {
		this(date,
			List.of(
			new ReminderEvent(17L, "강인이 생일", "2024-03-27T00:00", EventPriority.CRUCIAL),
			new ReminderEvent(18L, "조카 돌잔치", "2024-03-28T00:00", EventPriority.IMPORTANT),
			new ReminderEvent(19L, "팀장 결혼식", "2024-03-29T00:00", EventPriority.NORMAL)
		),
			3);
	}


}
