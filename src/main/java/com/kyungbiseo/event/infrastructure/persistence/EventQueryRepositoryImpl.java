package com.kyungbiseo.event.infrastructure.persistence;

import static com.kyungbiseo.event.infrastructure.persistence.QEventJpaEntity.*;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventQueryRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EventQueryRepositoryImpl implements EventQueryRepository {
	private final JPAQueryFactory queryFactory;

	@Override
	public List<Event> findAllScheduledOn(int year, int month) {
		return null;
	}

	@Override
	public List<Event> findAllScheduledBetween(LocalDate startDate, LocalDate limitDate) {

		return queryFactory
			.select(eventJpaEntity)
			.from(eventJpaEntity)
			.where(
				eventJpaEntity.scheduledAt
					.between(startDate.atStartOfDay(), limitDate.atStartOfDay()))
			.fetch()
			.stream()
			.map(EventJpaEntity::toEvent)
			.toList();
	}
}
