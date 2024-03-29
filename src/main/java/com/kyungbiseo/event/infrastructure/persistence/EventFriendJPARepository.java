package com.kyungbiseo.event.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface EventFriendJPARepository extends CrudRepository<Long, EventFriendJPAEntity> {
}
