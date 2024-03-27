package com.kyungbiseo.user.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.user.api.dto.SignUpRequest;
import com.kyungbiseo.user.application.service.UserProfileService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/signup")
@RequiredArgsConstructor
public class SignUpController {

	private final UserProfileService userProfileService;

	@PostMapping
	public ResponseEntity<Void> signUp(@RequestBody final SignUpRequest request) {
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.build();
	}
}
