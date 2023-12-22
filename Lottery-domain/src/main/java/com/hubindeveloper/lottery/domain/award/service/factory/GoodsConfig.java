package com.hubindeveloper.lottery.domain.award.service.factory;

import com.hubindeveloper.lottery.common.Constants;
import com.hubindeveloper.lottery.domain.award.service.goods.IDistributionGoods;
import com.hubindeveloper.lottery.domain.award.service.goods.impl.CouponGoods;
import com.hubindeveloper.lottery.domain.award.service.goods.impl.DescGoods;
import com.hubindeveloper.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.hubindeveloper.lottery.domain.award.service.goods.impl.RedeemCodeGoods;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description：各类发奖奖品配置类
 * @author：Kong
 * @date：2023/12/6
 */
public class GoodsConfig {
    /** 奖品发放策略组 */
    protected static Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private DescGoods descGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
    }

}
