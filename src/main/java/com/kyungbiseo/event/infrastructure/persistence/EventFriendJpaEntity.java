package com.kyungbiseo.event.infrastructure.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class EventFriendJpaEntity {
	@Id
	private Long eventId;
	@Column(nullable = false, updatable = false)
	private Long friendId;

	public static EventFriendJpaEntity of(Long eventId, Long friendId) {
		return new EventFriendJpaEntity(eventId, friendId);
	}

	private EventFriendJpaEntity(Long eventId, Long friendId) {
		this.eventId = eventId;
		this.friendId = friendId;
	}
}
