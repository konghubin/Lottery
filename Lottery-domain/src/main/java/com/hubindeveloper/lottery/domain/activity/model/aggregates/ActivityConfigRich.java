package com.hubindeveloper.lottery.domain.activity.model.aggregates;

import com.hubindeveloper.lottery.domain.activity.model.vo.ActivityVO;
import com.hubindeveloper.lottery.domain.activity.model.vo.AwardVO;
import com.hubindeveloper.lottery.domain.activity.model.vo.StrategyVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @description：活动配置聚合信息
 * @author：Kong
 * @date：2023/12/6
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ActivityConfigRich {
    /** 活动配置 */
    private ActivityVO activity;

    /** 策略配置(含策略明细) */
    private StrategyVO strategy;

    /** 奖品配置 */
    private List<AwardVO> awardList;

}
