package com.kyungbiseo.event.web.dto.response;

import com.kyungbiseo.event.domain.EventType;
import com.kyungbiseo.friend.domain.Relationship;

public record EventDetailFriend(Long id,
								String name,
								Relationship relationship,
								EventDetailLastTransaction lastTransaction) {
	public EventDetailFriend() {
		this(17L,
			"이강인",
			Relationship.CLOSE_FRIEND,
			new EventDetailLastTransaction("2024-03-19", EventType.BIRTHDAY, "로보카 폴리", 17600)
		);
	}
}
