package com.kyungbiseo.event.infrastructure.persistence;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class EventJPAEntity {
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
	@Column(nullable = false, updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;
	@Column(nullable = false, updatable = false)
	@LastModifiedDate
	private LocalDateTime modifiedAt;

	@Column(nullable = false, updatable = false)
	private Long userId;
}
