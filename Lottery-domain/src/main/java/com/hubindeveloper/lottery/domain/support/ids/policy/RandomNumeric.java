package com.hubindeveloper.lottery.domain.support.ids.policy;

import com.hubindeveloper.lottery.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * @description：工具类生成Id算法
 * @author：Kong
 * @date：2023/12/22
 */
@Component
public class RandomNumeric implements IIdGenerator {
    @Override
    public long nextId(){
        return Long.parseLong(RandomStringUtils.randomNumeric(11));

    }
}
