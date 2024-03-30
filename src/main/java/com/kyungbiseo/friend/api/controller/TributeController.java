package com.kyungbiseo.friend.api.controller;

import com.kyungbiseo.friend.api.dto.request.TributeEditRequest;
import com.kyungbiseo.friend.application.service.TributeCudUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kyungbiseo.friend.api.dto.request.TributeAddRequest;

@RestController
@RequestMapping("/tributes")
@RequiredArgsConstructor
public class TributeController {
	private final TributeCudUseCase tributeCudUseCase;

	@PostMapping
	public ResponseEntity<Void> addTribute(@RequestBody final TributeAddRequest request) {
		tributeCudUseCase.addTribute(request);

		return ResponseEntity
				.status(HttpStatus.CREATED)
				.build();
	}

	@PutMapping("/{tributeId}")
	public ResponseEntity<Void> editTribute(@RequestBody final TributeEditRequest request, @PathVariable final Long tributeId) {
		tributeCudUseCase.editTribute(request, tributeId);

		return ResponseEntity
				.status(HttpStatus.OK)
				.build();
	}

	@DeleteMapping("/{tributeId}")
	public ResponseEntity<Void> deleteTribute(@PathVariable final Long tributeId) {
		tributeCudUseCase.deleteTributeBy(tributeId);

		return ResponseEntity
				.status(HttpStatus.OK)
				.build();
	}
}
