package com.kyungbiseo.event.infrastructure.persistence;

import com.kyungbiseo.event.domain.EventFriend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "eventFriend")
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

	public boolean isIdenticalWith(EventFriend eventFriend) {
		return friendId.equals(eventFriend.id());
	}

	private EventFriendJpaEntity(Long eventId, Long friendId) {
		this.eventId = eventId;
		this.friendId = friendId;
	}
}
