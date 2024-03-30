package com.kyungbiseo.friend.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface FriendJpaRepository extends CrudRepository<FriendJpaEntity, Long> {
}
