package com.kyungbiseo.event.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.web.dto.response.EventDetailResponse;

@RestController
@RequestMapping("/events/{id}")
public class EventDetailController {

	@GetMapping
	public ResponseEntity<EventDetailResponse> getEventDetail(@PathVariable final Long id) {

		return ResponseEntity.ok(new EventDetailResponse(id));
	}
}
