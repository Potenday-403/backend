package com.kyungbiseo.event.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface EventJpaRepository extends CrudRepository<EventJpaEntity, Long> {
}
