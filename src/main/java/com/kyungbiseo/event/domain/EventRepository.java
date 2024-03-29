package com.kyungbiseo.event.domain;

public interface EventRepository {
	void save(Event event);

	void update(Event event);

	void deleteBy(Long id);

	Event findBy(Long id);
}
