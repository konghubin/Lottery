package com.hubindeveloper.lottery.infrastructure.po;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 *@description：抽奖策略的具体明细配置
 *@author：Kong
 *@date：2023/12/3
 */
@Getter
@Setter
public class StrategyDetail {
    // 自增ID
    private String id;

    // 策略ID
    private Long strategyId;

    // 奖品ID
    private String awardId;

    // 奖品数量
    private String awardCount;

    // 中奖概率
    private BigDecimal awardRate;

    // 创建时间
    private String createTime;

    // 修改时间
    private String updateTime;
}
