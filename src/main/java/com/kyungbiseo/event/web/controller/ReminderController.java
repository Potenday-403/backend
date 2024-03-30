package com.kyungbiseo.event.web.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.application.usecase.ReminderQueryUseCase;
import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.web.dto.response.ReminderResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reminder")
@RequiredArgsConstructor
public class ReminderController {
	private final ReminderQueryUseCase reminderQueryUseCase;

	@GetMapping
	public ResponseEntity<ReminderResponse> getReminderAt(@RequestParam final LocalDate date) {
		List<Event> reminderEvents = reminderQueryUseCase.getReminderEventsAt(date);

		return ResponseEntity.ok(new ReminderResponse(date));
	}
}
