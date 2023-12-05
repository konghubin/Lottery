package com.hubindeveloper.lottery.infrastructure.dao;

import com.hubindeveloper.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

}

