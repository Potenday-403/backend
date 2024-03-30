package com.kyungbiseo.friend.domain;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Builder
public class Tribute {
    private Long id;
    private TributeType type;
    private String name;
    private Integer price;
    private Boolean isReceived;
    private Boolean isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private Long userId;
    private Long friendId;
}
