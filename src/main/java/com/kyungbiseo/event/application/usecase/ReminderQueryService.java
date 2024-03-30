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
		LocalDate limitDate = date.plusDays(duration);

		return eventQueryRepository.findAllScheduledBetween(date, limitDate);
	}
}
