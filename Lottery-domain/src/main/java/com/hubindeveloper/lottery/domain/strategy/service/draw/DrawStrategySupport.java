package com.hubindeveloper.lottery.domain.strategy.service.draw;

import com.hubindeveloper.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.hubindeveloper.lottery.domain.strategy.repository.IStrategyRepository;
import com.hubindeveloper.lottery.infrastructure.po.Award;
import jakarta.annotation.Resource;

/**
 * @description：抽奖策略数据支撑，一些通用的数据服务。
 * @author：Kong
 * @date：2023/12/3
 */
public class DrawStrategySupport extends DrawConfig{
    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     * @param strategyId 策略ID
     * @return 策略配置信息
     */
    protected StrategyRich queryStrategyRich(Long strategyId){
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     * @param awardId 奖品ID
     * @return 中奖详情
     */
    protected Award queryAwardInfoByAwardId(String awardId){
        return strategyRepository.queryAwardInfo(awardId);
    }
}
