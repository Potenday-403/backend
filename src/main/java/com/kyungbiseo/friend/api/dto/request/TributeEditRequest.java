package com.kyungbiseo.friend.api.dto.request;

import com.kyungbiseo.friend.domain.TributeType;

import java.time.LocalDate;

public record TributeEditRequest(Long friendId,
                                TributeType eventType,
                                String giftName,
                                int price,
                                boolean isReceived,
                                LocalDate date, Long userId) {
}
