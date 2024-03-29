package com.kyungbiseo.event.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;
import com.kyungbiseo.event.application.usecase.EventCudUseCase;
import com.kyungbiseo.event.web.dto.request.EventAddRequest;
import com.kyungbiseo.event.web.dto.request.EventEditRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventCudController {
	private final EventCudUseCase eventCudUseCase;

	@PostMapping
	public ResponseEntity<Void> addEvent(@RequestBody final EventAddRequest request) {
		EventAddCommand command = new EventAddCommand(
			request.name(), request.type(), request.priority(), request.scheduledAt(), 1L, request.friendId());
		eventCudUseCase.addEvent(command);

		return ResponseEntity
			.status(HttpStatus.CREATED)
			.build();
	}

	@PatchMapping("/{id}")
	public ResponseEntity<Void> editEvent(@PathVariable final Long id,
											@RequestBody final EventEditRequest request) {
		EventEditCommand command = new EventEditCommand(
			id,
			request.name(),
			request.type(),
			request.priority(),
			request.scheduledAt(),
			1L,
			request.friendId());

		eventCudUseCase.editEvent(command);

		return ResponseEntity
			.ok()
			.build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEvent(@PathVariable final Long id) {
		eventCudUseCase.deleteEventBy(id);

		return ResponseEntity
			.noContent()
			.build();
	}
}
