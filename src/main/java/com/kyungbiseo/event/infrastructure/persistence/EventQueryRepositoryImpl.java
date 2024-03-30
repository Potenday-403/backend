package com.kyungbiseo.event.infrastructure.persistence;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventQueryRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class EventQueryRepositoryImpl implements EventQueryRepository {
	private final JPAQueryFactory queryFactory;

	@Override
	public List<Event> findAllOn(LocalDate date) {
		return null;
	}

	@Override
	public List<Event> findAllScheduledAtBetween(LocalDate startDate, LocalDate endDate) {


		return null;
	}
}
