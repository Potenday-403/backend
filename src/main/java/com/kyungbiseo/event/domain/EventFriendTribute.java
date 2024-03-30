package com.kyungbiseo.event.domain;

import java.time.LocalDate;

import com.kyungbiseo.friend.domain.TributeType;

import lombok.Getter;

@Getter
public class EventFriendTribute {
	private String name;
	private TributeType type;
	private int price;
	private boolean isReceived;
	private LocalDate date;
}
