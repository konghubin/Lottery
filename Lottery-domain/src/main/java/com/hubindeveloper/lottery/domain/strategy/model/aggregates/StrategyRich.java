package com.hubindeveloper.lottery.domain.strategy.model.aggregates;

import com.hubindeveloper.lottery.infrastructure.po.Strategy;
import com.hubindeveloper.lottery.infrastructure.po.StrategyDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StrategyRich {
    // 策略ID
    private Long strategyId;
    // 策略配置
    private Strategy strategy;
    // 策略明细
    private List<StrategyDetail> strategyDetailList;
}
