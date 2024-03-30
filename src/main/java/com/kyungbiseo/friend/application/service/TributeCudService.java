package com.kyungbiseo.friend.application.service;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;
import com.kyungbiseo.friend.api.dto.request.TributeAddRequest;
import com.kyungbiseo.friend.api.dto.request.TributeEditRequest;
import com.kyungbiseo.friend.domain.Friend;
import com.kyungbiseo.friend.domain.FriendRepository;
import com.kyungbiseo.friend.domain.Tribute;
import com.kyungbiseo.friend.domain.TributeRepository;
import com.kyungbiseo.friend.infrastructure.persistence.FriendJpaEntity;
import com.kyungbiseo.friend.infrastructure.persistence.TributeJpaEntity;
import com.kyungbiseo.user.domain.UserOAuth;
import com.kyungbiseo.user.infrastructure.persistence.UserOAuthJpaEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class TributeCudService implements TributeCudUseCase {
    private final TributeRepository tributeRepository;

    @Override
    public void addTribute(TributeAddRequest request) {
        tributeRepository.save(Tribute.builder()
                .type(request.eventType())
                .name(request.giftName())
                .price(request.price())
                .isReceived(request.isReceived())
                .friendId(request.friendId())
                .userId(request.userId())
                .build()
        );
    }

    @Override
    public void editTribute(TributeEditRequest request, Long tributeId) {
        tributeRepository.save(Tribute.builder()
                .id(tributeId)
                .type(request.eventType())
                .name(request.giftName())
                .price(request.price())
                .isReceived(request.isReceived())
                .friendId(request.friendId())
                .userId(request.userId())
                .build()
        );
    }

    @Override
    public void deleteTributeBy(Long id) {
        tributeRepository.deleteBy(id);
    }
}
