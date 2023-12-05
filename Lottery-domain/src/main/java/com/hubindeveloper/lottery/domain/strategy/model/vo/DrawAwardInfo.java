package com.hubindeveloper.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @description：中奖奖品信息
 * @author：Kong
 * @date：2023/12/3
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrawAwardInfo {
    /**
     * 奖品ID
     */
    private String rewardId;

    /**
     * 奖品名称
     */
    private String awardName;

}
