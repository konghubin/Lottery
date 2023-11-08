package com.hubindeveloper.lottery.interfaces;

import com.hubindeveloper.lottery.common.Constants;
import com.hubindeveloper.lottery.common.Result;
import com.hubindeveloper.lottery.infrastructure.dao.IActivityDao;
import com.hubindeveloper.lottery.infrastructure.po.Activity;
import com.hubindeveloper.lottery.rpc.booth.IActivityBooth;
import com.hubindeveloper.lottery.rpc.booth.dto.ActivityDto;
import com.hubindeveloper.lottery.rpc.booth.req.ActivityReq;
import com.hubindeveloper.lottery.rpc.booth.res.ActivityRes;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

@DubboService
public class ActivityBooth implements IActivityBooth {
    @Resource
    private IActivityDao activityDao;

    private Logger logger = LoggerFactory.getLogger(ActivityBooth.class);

    @Override
    public ActivityRes queryActivityById(ActivityReq req){
        System.out.println(req.getActivityId());
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

    @Override
    public boolean RpcTest(){
        logger.info("测试结果：{}", "测试成功");
        return false;
    }
}
