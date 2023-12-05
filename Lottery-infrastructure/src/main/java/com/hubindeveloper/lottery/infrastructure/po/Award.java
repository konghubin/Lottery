package com.hubindeveloper.lottery.infrastructure.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *@description：用于配置具体可以得到的奖品
 *@author：Kong
 *@date：2023/12/3
 */
@Setter
@Getter
public class Award {
    // 自增ID
    private Long id;

    // 奖品ID
    private String awardId;

    // 奖品类型（文字描述、兑换码、优惠券、实物奖品暂无）
    private Integer awardType;

    // 奖品数量
    private Integer awardCount;

    // 奖品名称
    private String awardName;

    // 奖品内容「文字描述、Key、码」
    private String awardContent;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;
}
