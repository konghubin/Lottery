package com.hubindeveloper.lottery.infrastructure.dao;

import com.hubindeveloper.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);

}

