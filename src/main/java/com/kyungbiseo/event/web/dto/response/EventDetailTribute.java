package com.kyungbiseo.event.web.dto.response;

import com.kyungbiseo.event.domain.EventType;

public record EventDetailTribute(String date,
								 EventType eventType,
								 String giftName,
								 int price) {
}
