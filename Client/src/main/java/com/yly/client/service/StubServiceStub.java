package com.yly.client.service;

import com.yly.service.StubService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/14 下午3:14
 * @since 1.0
 */
@Slf4j
public class StubServiceStub implements StubService {
    private StubService stubService;

    public StubServiceStub(StubService stubService) {
        this.stubService = stubService;
    }

    @Override
    public String testStub() {
        log.info("before remote action");
        String result = stubService.testStub();
        log.info("after remote action");
        return result;
    }
}
