package com.kyungbiseo.friend.infrastructure.persistence;

import com.kyungbiseo.friend.domain.Tribute;
import com.kyungbiseo.friend.domain.TributeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TributeRepositoryImpl implements TributeRepository {
    private final TributeJpaRepository tributeJpaRepository;

    @Override
    public void save(Tribute tribute) {
        TributeJpaEntity toBeSaved = TributeJpaEntity.from(tribute);

        tributeJpaRepository.save(toBeSaved);
    }


    @Override
    public void deleteBy(Long id) {
        TributeJpaEntity tributeJpaEntity = tributeJpaRepository.findById(id)
                .orElseThrow(RuntimeException::new);
        tributeJpaEntity.delete();
        tributeJpaRepository.save(tributeJpaEntity);
    }

    @Override
    public Tribute findBy(Long id) {
        TributeJpaEntity tributeJpaEntity = tributeJpaRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return Tribute.builder()
                .id(tributeJpaEntity.getId())
                .type(tributeJpaEntity.getType())
                .name(tributeJpaEntity.getName())
                .price(tributeJpaEntity.getPrice())
                .isReceived(tributeJpaEntity.getIsReceived())
                .isDeleted(tributeJpaEntity.getIsDeleted())
                .createdAt(tributeJpaEntity.getCreatedAt())
                .modifiedAt(tributeJpaEntity.getModifiedAt())
                .userId(tributeJpaEntity.getUserId())
                .friendId(tributeJpaEntity.getFriendId())
                .build();
    }
}
