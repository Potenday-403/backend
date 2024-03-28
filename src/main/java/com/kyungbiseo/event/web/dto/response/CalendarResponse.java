package com.kyungbiseo.event.web.dto.response;

import java.util.List;
import java.util.Map;

import com.kyungbiseo.event.domain.EventPriority;

public record CalendarResponse(int year,
							   int month,
							   Map<Integer, List<CalendarEvent>> days) {
	public CalendarResponse(int year, int month) {
		this(year,
			month,
			Map.ofEntries(
				Map.entry(
					27, List.of(new CalendarEvent(17L, "강인이 생일", EventPriority.CRUCIAL, "00:00"))),
				Map.entry(
					28, List.of(new CalendarEvent(18L, "조카 돌잔치", EventPriority.IMPORTANT, "00:00"))),
				Map.entry(
					29, List.of(new CalendarEvent(19L, "상사 결혼식", EventPriority.NORMAL, "00:00")))
			)
		);
	}
}
