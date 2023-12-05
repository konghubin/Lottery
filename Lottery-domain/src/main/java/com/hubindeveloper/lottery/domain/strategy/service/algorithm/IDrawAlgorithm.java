package com.hubindeveloper.lottery.domain.strategy.service.algorithm;

import com.hubindeveloper.lottery.domain.strategy.model.vo.AwardRateInfo;

import java.util.List;

/**
 *@description：抽奖算法接口
 *@author：Kong
 *@date：2023/12/5
 */
public interface IDrawAlgorithm {
    // 程序启动时初始化概率元祖，在初始化完成后使用过程中不允许修改元祖数据.
    void initRateTuple(Long strategyId, List<AwardRateInfo> awardRateInfoList);

    // 判断是否已经，做了数据初始化.
    boolean isExistRateTuple(Long strategyId);

    // 生成随机数，索引到对应的奖品信息返回结果.
    String randomDraw(Long strategyId, List<String> excludeAwardIds);
}
