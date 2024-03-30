package com.kyungbiseo.event.domain;

import java.time.LocalDate;
import java.util.List;

public interface EventQueryRepository {
	List<Event> findAllOn(LocalDate date);
	List<Event> findAllScheduledAtBetween(LocalDate startDate, LocalDate endDate);
}
