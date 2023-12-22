package com.hubindeveloper.lottery.test.domain;

import com.hubindeveloper.lottery.common.Constants;
import com.hubindeveloper.lottery.domain.support.ids.IIdGenerator;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * @description：Id生成算法测试
 * @author：Kong
 * @date：2023/12/22
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class IdGeneratorTest {

    @Resource
    private Map<Constants.Ids, IIdGenerator> idGeneratorMap;

    @Test
    public void test_ids() {
        log.info("雪花算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.SnowFlake).nextId());
        log.info("日期算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.ShortCode).nextId());
        log.info("随机算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.RandomNumeric).nextId());
    }

}
