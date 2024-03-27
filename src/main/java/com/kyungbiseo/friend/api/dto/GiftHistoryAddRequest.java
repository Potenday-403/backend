package com.kyungbiseo.friend.api.dto;

import java.time.LocalDate;

import com.kyungbiseo.event.domain.EventType;

public record GiftHistoryAddRequest(Long friendId,
									EventType eventType,
									String giftName,
									int price,
									boolean isReceived,
									LocalDate date) {
}
