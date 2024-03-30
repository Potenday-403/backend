package com.kyungbiseo.event.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.application.usecase.EventDetailQueryUseCase;
import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.web.dto.response.EventDetailResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/events/{id}")
@RequiredArgsConstructor
public class EventDetailController {
	private final EventDetailQueryUseCase eventDetailQueryUseCase;

	@GetMapping
	public ResponseEntity<EventDetailResponse> getEventDetail(@PathVariable final Long id) {
		Event event = eventDetailQueryUseCase.getEventBy(id);

		return ResponseEntity.ok(
			EventDetailResponse.from(eventDetailQueryUseCase.getEventBy(id)));
	}
}
