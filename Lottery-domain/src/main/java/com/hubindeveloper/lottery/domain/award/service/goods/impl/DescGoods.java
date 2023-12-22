package com.hubindeveloper.lottery.domain.award.service.goods.impl;

import com.hubindeveloper.lottery.common.Constants;
import com.hubindeveloper.lottery.domain.award.model.req.GoodsReq;
import com.hubindeveloper.lottery.domain.award.model.res.DistributionRes;
import com.hubindeveloper.lottery.domain.award.service.goods.DistributionBase;
import com.hubindeveloper.lottery.domain.award.service.goods.IDistributionGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description：描述类商品，以文字形式展示给用户
 * @author：Kong
 * @date：2023/12/6
 */
@Slf4j
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {
    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        log.info("模拟调用描述类商品发放接口 uId：{} awardContent：{}", req.getUId(), req.getAwardContent());

        super.updateUserAwardState(req.getUId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getUId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.DESC.getCode();
    }

}
