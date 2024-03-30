package com.kyungbiseo.event.domain;

public interface EventCommandRepository {
	void save(Event event);

	void merge(Event event);

	void deleteBy(Long id);

	Event findBy(Long id);
}
