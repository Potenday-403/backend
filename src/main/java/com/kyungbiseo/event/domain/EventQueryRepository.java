package com.kyungbiseo.event.domain;

import java.time.LocalDate;
import java.util.List;

public interface EventQueryRepository {
	Event findBy(Long id);
	List<Event> findAllScheduledOn(int year, int month);
	List<Event> findAllScheduledBetween(LocalDate startDate, LocalDate limitDate);
}
