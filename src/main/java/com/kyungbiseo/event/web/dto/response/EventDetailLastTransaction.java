package com.kyungbiseo.event.web.dto.response;

import com.kyungbiseo.event.domain.EventType;

public record EventDetailLastTransaction(String date,
										 EventType eventType,
										 String giftName,
										 int price) {
}
