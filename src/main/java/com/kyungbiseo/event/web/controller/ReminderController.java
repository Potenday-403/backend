package com.kyungbiseo.event.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.web.dto.response.ReminderResponse;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

	@GetMapping
	public ResponseEntity<ReminderResponse> getReminder() {
		return ResponseEntity.ok(new ReminderResponse());
	}
}
