package com.kyungbiseo.event.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface EventFriendJpaRepository extends CrudRepository<EventFriendJpaEntity, Long> {
}
