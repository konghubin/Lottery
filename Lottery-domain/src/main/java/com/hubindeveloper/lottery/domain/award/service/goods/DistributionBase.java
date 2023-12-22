package com.hubindeveloper.lottery.domain.award.service.goods;

import com.hubindeveloper.lottery.domain.award.repository.IAwardRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

/**
 * @description：配送货物基础共用类
 * @author：Kong
 * @date：2023/12/6
 */
@Slf4j
public class DistributionBase {
    @Resource
    private IAwardRepository awardRepository;

    protected void updateUserAwardState(String uId, String orderId, String awardId, Integer awardState, String awardStateInfo) {
        // TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态
        log.info("TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态 uId：{}", uId);
    }

}
