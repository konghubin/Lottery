package com.hubindeveloper.lottery.domain.strategy.model.req;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class DrawReq {
    // 用户Id
    private String uId;

    // 策略Id
    private Long strategyId;
}
