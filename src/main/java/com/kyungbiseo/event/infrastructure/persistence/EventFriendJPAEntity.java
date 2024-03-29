package com.kyungbiseo.event.infrastructure.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EventFriendJPAEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventId;
	@Column(nullable = false, updatable = false)
	private Long friendId;
}
