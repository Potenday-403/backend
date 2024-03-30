package com.kyungbiseo.event.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventQueryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CalendarQueryService implements CalendarQueryUseCase {
	private final EventQueryRepository eventQueryRepository;
	@Override
	public List<Event> getEventsOn(int year, int month) {
		return eventQueryRepository.findAllScheduledOn(year, month);
	}
}
