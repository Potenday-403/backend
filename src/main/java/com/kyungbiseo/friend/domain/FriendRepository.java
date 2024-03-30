package com.kyungbiseo.friend.domain;

import com.kyungbiseo.friend.infrastructure.persistence.FriendJpaEntity;

public interface FriendRepository {
    FriendJpaEntity findBy(Long id);
}
