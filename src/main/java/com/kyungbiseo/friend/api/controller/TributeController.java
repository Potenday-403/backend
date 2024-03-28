package com.kyungbiseo.friend.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.friend.api.dto.TributeAddRequest;

@RestController
@RequestMapping("/tributes")
public class TributeController {

	@PostMapping
	public ResponseEntity<Void> addTribute(@RequestBody final TributeAddRequest request) {
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.build();
	}
}
