package com.kyungbiseo.event.application.usecase;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventQueryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReminderQueryService implements ReminderQueryUseCase {
	private final EventQueryRepository eventQueryRepository;

	@Override
	public List<Event> getReminderEventsAt(LocalDate date) {
		int duration = 10;
		LocalDate endDate = date.plusDays(duration - 1);

		return eventQueryRepository.findAllScheduledAtBetween(date, endDate);
	}
}
