package com.hubindeveloper.lottery.domain.activity.repository.Impl;

import com.hubindeveloper.lottery.common.Constants;
import com.hubindeveloper.lottery.domain.activity.model.vo.ActivityVO;
import com.hubindeveloper.lottery.domain.activity.model.vo.AwardVO;
import com.hubindeveloper.lottery.domain.activity.model.vo.StrategyDetailVO;
import com.hubindeveloper.lottery.domain.activity.model.vo.StrategyVO;
import com.hubindeveloper.lottery.domain.activity.repository.IActivityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description：
 * @author：Kong
 * @date：2023/12/10
 */
@Slf4j
@Service
public class ActivityRepository implements IActivityRepository {
    @Override
    public void addActivity(ActivityVO activity) {
        log.info("创建活动成功！");
    }

    @Override
    public void addAward(List<AwardVO> awardList) {

    }

    @Override
    public void addStrategy(StrategyVO strategy) {

    }

    @Override
    public void addStrategyDetailList(List<StrategyDetailVO> strategyDetailList) {

    }

    @Override
    public boolean alterStatus(Long activityId, Enum<Constants.ActivityState> beforeState, Enum<Constants.ActivityState> afterState) {
        return false;
    }
}
