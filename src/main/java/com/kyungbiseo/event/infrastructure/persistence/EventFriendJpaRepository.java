package com.kyungbiseo.event.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventFriendJpaRepository extends JpaRepository<EventFriendJpaEntity, Long> {
}
