package com.hubindeveloper.lottery.infrastructure.dao;

import com.hubindeveloper.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface IActivityDao {
    void insert(Activity req);

    Activity queryActivityById(Long activityId);
}
