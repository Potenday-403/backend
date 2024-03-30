package com.kyungbiseo.event.infrastructure.persistence;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.kyungbiseo.event.domain.Event;
import com.kyungbiseo.event.domain.EventFriend;
import com.kyungbiseo.event.domain.EventPriority;
import com.kyungbiseo.event.domain.EventType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "event")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class EventJpaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 50)
	private String name;
	@Column(nullable = false, length = 50)
	@Enumerated(EnumType.STRING)
	private EventType type;
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private EventPriority priority;
	@Column(nullable = false)
	private LocalDateTime scheduledAt;
	@Column(nullable = false, updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;
	@Column(nullable = false, updatable = false)
	@LastModifiedDate
	private LocalDateTime modifiedAt;

	@Column(nullable = false, updatable = false)
	private Long userId;

	public static EventJpaEntity from(Event event) {
		return new EventJpaEntity(
			event.getName(), event.getType(), event.getPriority(), event.getScheduledAt(), event.getUserId());
	}

	public Event toEvent() {
		return Event.builder()
			.id(id)
			.name(name)
			.type(type)
			.priority(priority)
			.scheduledAt(scheduledAt)
			.userId(userId)
			.build();
	}

	public void updateFrom(Event event) {
		this.name = event.getName();
		this.type = event.getType();
		this.priority = event.getPriority();
		this.scheduledAt = event.getScheduledAt();
	}

	private EventJpaEntity(String name, EventType type, EventPriority priority, LocalDateTime scheduledAt, Long userId) {
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.scheduledAt = scheduledAt;
		this.userId = userId;
	}
}
