package com.kyungbiseo.statistic.api.dto.request;

import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;
import com.kyungbiseo.friend.domain.Relationship;

public record CategoryStatisticsRequest(Relationship relationship,
										EventType eventType,
										EventPriority eventPriority) {
}
