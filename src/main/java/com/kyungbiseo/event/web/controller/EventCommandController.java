package com.kyungbiseo.event.web.controller;

import java.util.List;

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
import com.kyungbiseo.event.application.usecase.EventCommandUseCase;
import com.kyungbiseo.event.web.dto.request.EventAddRequest;
import com.kyungbiseo.event.web.dto.request.EventEditRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventCommandController {
	private final EventCommandUseCase eventCommandUseCase;

	@PostMapping
	public ResponseEntity<Void> addEvent(@RequestBody final EventAddRequest request) {
		EventAddCommand command = request.toCommandWith(1L);
		eventCommandUseCase.addEvent(command);

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

		eventCommandUseCase.editEvent(command);

		return ResponseEntity
			.ok()
			.build();
	}

	@DeleteMapping
	public ResponseEntity<Void> deleteEvent(@RequestBody final List<Long> ids) {
		eventCommandUseCase.deleteEventsBy(ids);

		return ResponseEntity
			.noContent()
			.build();
	}

}
