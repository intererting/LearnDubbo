package com.yly.server.service.impl;

import com.yly.service.MockService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/19 下午2:42
 * @since 1.0
 */
@DubboService
public class MockServiceImpl implements MockService {
    @Override
    public String mockTest() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "mock success";
//        throw new RuntimeException();

    }
}
