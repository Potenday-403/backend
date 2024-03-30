package com.kyungbiseo.event.application.usecase;

import com.kyungbiseo.event.domain.Event;

public interface EventDetailQueryUseCase {
	Event getEventBy(Long id);
}
