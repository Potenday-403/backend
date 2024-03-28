package com.kyungbiseo.statistic.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kyungbiseo.statistic.web.dto.response.MonthlyStatisticsResponse;

@RestController
@RequestMapping("/statistics/me")
public class MonthlyStatisticsController {

	@GetMapping
	public ResponseEntity<MonthlyStatisticsResponse> getMonthlyStatisticsAt(@RequestParam final int year,
																			@RequestParam final int month) {

		return ResponseEntity.ok(new MonthlyStatisticsResponse(year, month));
	}
}
