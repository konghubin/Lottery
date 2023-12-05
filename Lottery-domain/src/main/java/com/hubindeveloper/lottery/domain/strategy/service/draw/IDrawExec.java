package com.hubindeveloper.lottery.domain.strategy.service.draw;

import com.hubindeveloper.lottery.domain.strategy.model.req.DrawReq;
import com.hubindeveloper.lottery.domain.strategy.model.res.DrawResult;

/**
 *@description：抽奖执行接口
 *@author：Kong
 *@date：2023/12/3
 */
public interface IDrawExec {
    /**
     *
     * @param req 抽奖参数：用户ID、策略ID
     * @return 中奖结果
     */
    DrawResult doDrawExec(DrawReq req);
}
