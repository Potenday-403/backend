package com.kyungbiseo.friend.api.dto;

import java.time.LocalDate;

import com.kyungbiseo.friend.domain.TributeType;

public record TributeAddRequest(Long friendId,
									TributeType type,
									String giftName,
									int price,
									boolean isReceived,
									LocalDate date) {
}
