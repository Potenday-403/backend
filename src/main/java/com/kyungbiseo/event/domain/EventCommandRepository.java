package com.kyungbiseo.event.domain;

import java.util.List;

public interface EventCommandRepository {
	void save(Event event);

	void merge(Event event);

	void deleteAllBy(List<Long> ids);

	Event findBy(Long id);
}
