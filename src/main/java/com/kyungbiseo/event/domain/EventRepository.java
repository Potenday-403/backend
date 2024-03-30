package com.kyungbiseo.event.domain;

public interface EventRepository {
	void save(Event event);

	void merge(Event event);

	void deleteBy(Long id);

	Event findBy(Long id);
}
