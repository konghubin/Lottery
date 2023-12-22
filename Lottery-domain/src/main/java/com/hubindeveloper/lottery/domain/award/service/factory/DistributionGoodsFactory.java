package com.hubindeveloper.lottery.domain.award.service.factory;

import com.hubindeveloper.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Service;

/**
 * @description：配送商品简单工厂，提供获取配送服务
 * @author：Kong
 * @date：2023/12/6
 */
@Service
public class DistributionGoodsFactory extends GoodsConfig{
    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }

}
