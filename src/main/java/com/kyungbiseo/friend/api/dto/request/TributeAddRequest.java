package com.kyungbiseo.friend.api.dto.request;

import java.time.LocalDate;

import com.kyungbiseo.friend.domain.TributeType;

public record TributeAddRequest(Long friendId,
									TributeType eventType,
									String giftName,
									int price,
									boolean isReceived,
									LocalDate date, Long userId) {
}
