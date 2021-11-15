package com.yly.server.service.impl;

import com.yly.service.StubService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/14 下午3:08
 * @since 1.0
 */
@DubboService
public class StubServiceImpl implements StubService {
    @Override
    public String testStub() {
        return "stub success";
    }
}
