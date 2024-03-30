package com.kyungbiseo.event.web.dto.response;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.kyungbiseo.event.domain.Event;

public record CalendarResponse(int year,
							   int month,
							   Map<Integer, List<CalendarEvent>> days) {
	public static CalendarResponse of(int year, int month, List<Event> events) {

		return new CalendarResponse(
			year,
			month,
			events.stream()
				.map(CalendarEvent::from)
				.collect(Collectors.groupingBy(CalendarEvent::day))
		);
	}
}
