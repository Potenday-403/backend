package com.kyungbiseo.friend.infrastructure.persistence;

import com.kyungbiseo.friend.domain.Friend;
import com.kyungbiseo.friend.domain.FriendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FriendRepositoryImpl implements FriendRepository {
    private final FriendJpaRepository friendJpaRepository;

    @Override
    public FriendJpaEntity findBy(Long id) {
        return friendJpaRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }
}
