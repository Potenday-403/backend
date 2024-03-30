package com.kyungbiseo.event.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Event {
	private final Long id;
	private String name;
	private EventType type;
	private EventPriority priority;
	private LocalDateTime scheduledAt;

	private final Long userId;
	private EventFriend friend;

	public Long friendId() {
		return friend.id();
	}

	public void edit(String name, EventType type, EventPriority priority, LocalDateTime scheduledAt) {
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.scheduledAt = scheduledAt;
	}

	public void assignTo(EventFriend eventFriend) {
		this.friend = eventFriend;
	}

	public void assignToFriendOf(Long friendId) {
		friend = EventFriend.of(friendId);
	}

	public void disCharge() {
		friend = EventFriend.ofEmpty();
	}

	public boolean isAssigned() {
		return !friend.isEmpty();
	}

	private void validate(String name) {
		if (name == null || name.isBlank() || name.length() > 50) {
			// throw new InvalidEventNameException();
		}
	}

	@Builder
	private Event(
		Long id, String name, EventType type, EventPriority priority, LocalDateTime scheduledAt, Long userId) {

		validate(name);

		this.id = id;
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.scheduledAt = scheduledAt;
		this.userId = userId;
		this.friend = EventFriend.ofEmpty();
	}
}
