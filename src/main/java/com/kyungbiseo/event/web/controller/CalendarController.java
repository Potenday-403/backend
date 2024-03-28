package com.kyungbiseo.event.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.web.dto.response.CalendarResponse;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

	@GetMapping
	public ResponseEntity<CalendarResponse> getCalendarAt(@RequestParam final int year,
															@RequestParam final int month) {

		return ResponseEntity.ok(new CalendarResponse(year, month));
	}
}
