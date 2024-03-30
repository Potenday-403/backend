package com.kyungbiseo.friend.application.service;

import com.kyungbiseo.event.application.dto.EventAddCommand;
import com.kyungbiseo.event.application.dto.EventEditCommand;
import com.kyungbiseo.friend.api.dto.request.TributeAddRequest;
import com.kyungbiseo.friend.api.dto.request.TributeEditRequest;

public interface TributeCudUseCase {
    /**
     * 선물 이력 추가
     * @param command 친구 아이디, 이벤트 종류, 선물 이름, 금액, 줬는지 받았는지 여부, 주고받은 날짜
     */
    void addTribute(TributeAddRequest request);

    /**
     * 선물 이력 수정
     * @param command 이벤트 종류, 선물 이름, 금액, 줬는지 받았는지 여부, 주고받은 날짜
     */
    void editTribute(TributeEditRequest request, Long tributeId);

    /**
     * 이벤트 삭제
     * @param id 삭제할 선물 식별자
     */
    void deleteTributeBy(Long id);
}
