package com.kyungbiseo.friend.infrastructure.persistence;

import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;
import com.kyungbiseo.friend.domain.Tribute;
import com.kyungbiseo.friend.domain.TributeType;
import com.kyungbiseo.user.infrastructure.persistence.UserOAuthJpaEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TributeJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private TributeType type;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private Integer price;

    @Column
    @NotNull
    private Boolean isReceived;

    @Column(columnDefinition = "tinyint(1)")
    @NotNull
    private Boolean isDeleted;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @Column
    private Long userId;

    @Column
    private Long friendId;

    public static TributeJpaEntity from(Tribute tribute) {
        return new TributeJpaEntity(
                tribute.getType(), tribute.getName(), tribute.getPrice(), tribute.getIsReceived(), tribute.getIsDeleted(), tribute.getUserId(), tribute.getFriendId());
    }

    public void delete() {
        this.isDeleted = true;
    }

    private TributeJpaEntity(TributeType type, String name, Integer price, Boolean isReceived, Boolean isDeleted, Long userId, Long friendId) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.isReceived = isReceived;
        this.isDeleted = isDeleted;
        this.userId = userId;
        this.friendId = friendId;
    }
}
