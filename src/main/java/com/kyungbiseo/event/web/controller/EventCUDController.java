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

import com.kyungbiseo.event.web.dto.request.EventAddRequest;
import com.kyungbiseo.event.web.dto.request.EventEditRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventCUDController {

	@PostMapping
	public ResponseEntity<Void> addEvent(@RequestBody final EventAddRequest request) {
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.build();
	}

	@PatchMapping("/{id}")
	public ResponseEntity<Void> editEvent(@PathVariable final Long id,
											@RequestBody final EventEditRequest request) {
		return ResponseEntity
			.ok()
			.build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEvent(@PathVariable final  Long id) {

		return ResponseEntity
			.noContent()
			.build();
	}
}
