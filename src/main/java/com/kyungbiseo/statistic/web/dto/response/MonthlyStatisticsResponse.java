package com.kyungbiseo.statistic.web.dto.response;

import java.util.Map;

import com.kyungbiseo.event.domain.EventType;

public record MonthlyStatisticsResponse(int year,
										int month,
										int total,
										Map<EventType, Integer> types) {

	public MonthlyStatisticsResponse(int year, int month) {
		this(year,
			month,
			1500000,
			Map.ofEntries(
				Map.entry(EventType.WEDDING, 100000),
				Map.entry(EventType.BIRTHDAY, 50000)
			)
		);
	}
}
