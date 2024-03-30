package com.kyungbiseo.event.application.usecase;

import org.springframework.stereotype.Service;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventQueryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventDetailQueryService implements EventDetailQueryUseCase {
	private final EventQueryRepository eventQueryRepository;

	@Override
	public Event getEventBy(Long id) {
		return eventQueryRepository.findBy(id);
	}
}
