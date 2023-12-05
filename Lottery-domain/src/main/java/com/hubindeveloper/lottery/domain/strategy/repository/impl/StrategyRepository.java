package com.hubindeveloper.lottery.domain.strategy.repository.impl;


import com.hubindeveloper.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.hubindeveloper.lottery.domain.strategy.repository.IStrategyRepository;
import com.hubindeveloper.lottery.infrastructure.dao.IAwardDao;
import com.hubindeveloper.lottery.infrastructure.dao.IStrategyDao;
import com.hubindeveloper.lottery.infrastructure.dao.IStrategyDetailDao;
import com.hubindeveloper.lottery.infrastructure.po.Award;
import com.hubindeveloper.lottery.infrastructure.po.Strategy;
import com.hubindeveloper.lottery.infrastructure.po.StrategyDetail;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StrategyRepository implements IStrategyRepository {
    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return strategyDetailDao.queryNoStockStrategyAwardList(strategyId);
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        StrategyDetail req = new StrategyDetail();
        req.setStrategyId(strategyId);
        req.setAwardId(awardId);
        int count = strategyDetailDao.deductStock(req);
        return count == 1;
    }

}
