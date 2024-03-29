package com.kyungbiseo.event.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface EventJPARepository extends CrudRepository<Long, EventJPAEntity> {
}
