package com.kyungbiseo.statistic.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.statistic.web.dto.request.CategoryStatisticsRequest;
import com.kyungbiseo.statistic.web.dto.response.CategoryStatisticResponse;

@RestController
@RequestMapping("/statistics/category")
public class CategoryStatisticController {

	@PutMapping
	public ResponseEntity<CategoryStatisticResponse> getCategoryStatistics(
		@RequestBody final CategoryStatisticsRequest request) {

		return ResponseEntity.ok(new CategoryStatisticResponse());
	}
}
