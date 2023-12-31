package com.hubindeveloper.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @description：中奖奖品信息
 * @author：Kong
 * @date：2023/12/3
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrawAwardInfo {
    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）
     */
    private Integer awardType;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品内容「描述、奖品码、sku」
     */
    private String awardContent;

}
