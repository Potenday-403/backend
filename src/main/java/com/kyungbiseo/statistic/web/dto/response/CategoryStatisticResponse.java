package com.kyungbiseo.statistic.web.dto.response;

import java.util.Map;

public record CategoryStatisticResponse(Map<String, String> categories,
										Map<String, Integer> amounts,
										int headcount) {
	public CategoryStatisticResponse() {
		this(Map.ofEntries(
				Map.entry("ageGroup", "TWENTIES_LATE"),
				Map.entry("gender", "MALE"),
				Map.entry("occupation", "STUDENT"),
				Map.entry("relationship", "CLOSE_FRIEND"),
				Map.entry("eventType", "BIRTHDAY"),
				Map.entry("eventPriority", "HIGH")
			),
			Map.ofEntries(
				Map.entry("max", 300000),
				Map.entry("min", 50000),
				Map.entry("avg",70000),
				Map.entry("med",120000)
			),
			32
		);
	}
}
