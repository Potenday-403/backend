package com.kyungbiseo.friend.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.friend.api.dto.GiftHistoryAddRequest;

@RestController
@RequestMapping("/tributes")
public class GiftController {

	@PostMapping
	public ResponseEntity<Void> addGiftHistory(@RequestBody final GiftHistoryAddRequest request) {
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.build();
	}
}
