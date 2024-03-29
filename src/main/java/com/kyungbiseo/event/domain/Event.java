package com.kyungbiseo.event.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Event {
	private Long id;
	private String name;
	private EventType type;
	private EventPriority priority;
	private LocalDateTime scheduledAt;

	private final Long userId;
	private Long friendId;


	@Builder(builderMethodName = "notAssignedEventBuilder")
	private Event(Long id, String name, EventType type, EventPriority priority, LocalDateTime scheduledAt, Long userId) {

		validate(name);

		this.id = id;
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.scheduledAt = scheduledAt;
		this.userId = userId;
	}

	@Builder(builderMethodName = "assignedEventBuilder")
	private Event(
		Long id, String name, EventType type, EventPriority priority, LocalDateTime scheduledAt, Long userId, Long friendId) {

		validate(name);

		this.name = name;
		this.type = type;
		this.priority = priority;
		this.scheduledAt = scheduledAt;
		this.userId = userId;
		this.friendId = friendId;
	}

	public void edit(String name, EventType type, EventPriority priority, LocalDateTime scheduledAt) {
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.scheduledAt = scheduledAt;
	}

	public void assignTo(Long friendId) {
		this.friendId = friendId;
	}

	public boolean isAssigned() {
		return friendId != null;
	}

	private void validate(String name) {
		if (name == null || name.isBlank() || name.length() > 50) {
			// throw new InvalidEventNameException();
		}
	}
}
