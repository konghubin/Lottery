package com.hubindeveloper.lottery.domain.activity.model.req;

import com.hubindeveloper.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description：活动配置请求对象
 * @author：Kong
 * @date：2023/12/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityConfigReq {
    /** 活动ID */
    private Long activityId;

    /** 活动配置信息 */
    private ActivityConfigRich activityConfigRich;

}
