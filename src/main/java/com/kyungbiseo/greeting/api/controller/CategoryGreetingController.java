package com.kyungbiseo.greeting.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.greeting.api.dto.request.CategoryGreetingRequest;
import com.kyungbiseo.greeting.api.dto.response.CategoryGreetingResponse;

@RestController
@RequestMapping("/greetings/category")
public class CategoryGreetingController {

	@PutMapping
	public ResponseEntity<CategoryGreetingResponse> getCategoryGreetings(
		@RequestBody final CategoryGreetingRequest request) {

		return ResponseEntity.ok(new CategoryGreetingResponse());
	}
}
