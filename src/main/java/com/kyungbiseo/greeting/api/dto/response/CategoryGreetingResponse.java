package com.kyungbiseo.greeting.api.dto.response;

import java.util.List;
import java.util.Map;

public record CategoryGreetingResponse(Map<String, String> categories,
									   List<String> greetings) {
	public CategoryGreetingResponse() {
		this(Map.ofEntries(
				Map.entry("ageGroup", "TWENTIES_LATE"),
				Map.entry("gender", "MALE"),
				Map.entry("occupation", "STUDENT"),
				Map.entry("relationship", "CLOSE_FRIEND"),
				Map.entry("eventType", "BIRTHDAY"),
				Map.entry("eventPriority", "HIGH")
			),
			List.of(
				"미역국 먹어라",
				"행복해라",
				"세금 두배로 내라"
			)
		);
	}
}
