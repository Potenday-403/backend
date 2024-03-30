package com.kyungbiseo.event.domain;

import com.kyungbiseo.friend.domain.Relationship;

import lombok.Getter;

@Getter
public class EventFriend {
	private Long id;
	private String name;
	private Relationship relationship;
	private EventFriendTribute lastTribute;

	public static EventFriend of(Long id) {
		return new EventFriend(id);
	}

	public static EventFriend ofEmpty() {
		return new EventFriend();
	}

	public Long id() {
		return id;
	}

	public boolean isEmpty() {
		return id == null;
	}

	private EventFriend(Long id) {
		this.id = id;
	}

	private EventFriend() {
	}
}
