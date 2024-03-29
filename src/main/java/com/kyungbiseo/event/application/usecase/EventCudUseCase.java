package com.kyungbiseo.event.application.usecase;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;

public interface EventCudUseCase {

	/**
	 * 이벤트 등록
	 * @param command 등록할 이벤트 이름, 타입, 예정일시, 중요도, 해당 유저식별자, 해당 친구식별자
	 */
	void addEvent(EventAddCommand command);

	/**
	 * 이벤트 수정
	 * @param command 등록할 이벤트 이름, 타입, 예정일시, 중요도, 해당 친구식별자
	 */
	void editEvent(EventEditCommand command);

	/**
	 * 이벤트 삭제
	 * @param id 삭제할 이벤트식별자
	 */
	void deleteEventBy(Long id);
}
