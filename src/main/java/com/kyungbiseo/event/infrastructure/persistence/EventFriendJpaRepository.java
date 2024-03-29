package com.kyungbiseo.event.infrastructure.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface EventFriendJpaRepository extends CrudRepository<EventFriendJpaEntity, Long> {
}
