package com.kyungbiseo.event.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.api.dto.EventAddRequest;
import com.kyungbiseo.event.application.service.EventCommandService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

	private final EventCommandService eventCommandService;

	@PostMapping
	public ResponseEntity<Void> addEvent(@RequestBody final EventAddRequest request) {
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.build();
	}
}
