package com.kyungbiseo.event.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.application.usecase.CalendarQueryUseCase;
import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.web.dto.response.CalendarResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/calendar")
@RequiredArgsConstructor
public class CalendarController {
	private final CalendarQueryUseCase calendarQueryUseCase;

	@GetMapping
	public ResponseEntity<CalendarResponse> getCalendarAt(@RequestParam final int year,
															@RequestParam final int month) {

		List<Event> events = calendarQueryUseCase.getEventsOn(year, month);

		return ResponseEntity.ok(
			CalendarResponse.of(year, month, events));
	}
}
