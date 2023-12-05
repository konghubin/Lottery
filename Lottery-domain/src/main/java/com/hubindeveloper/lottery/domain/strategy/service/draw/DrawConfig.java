package com.hubindeveloper.lottery.domain.strategy.service.draw;

import com.hubindeveloper.lottery.common.Constants;
import com.hubindeveloper.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *@description：抽奖统一配置信息类
 *@author：Kong
 *@date：2023/12/3
 */
public class DrawConfig {
    @Resource
    private IDrawAlgorithm entiretyRateRandomDrawAlgorithm;

    @Resource
    private IDrawAlgorithm singleRateRandomDrawAlgorithm;

    protected static Map<Integer, IDrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        drawAlgorithmGroup.put(Constants.StrategyMode.ENTIRETY.getCode(), entiretyRateRandomDrawAlgorithm);
        drawAlgorithmGroup.put(Constants.StrategyMode.SINGLE.getCode(), singleRateRandomDrawAlgorithm);
    }

}
