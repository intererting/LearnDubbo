package com.yly.client.service;

import com.yly.service.MockService;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/19 下午2:43
 * @since 1.0
 */
public class MockServiceMock implements MockService {
    @Override
    public String mockTest() {
        return "容错数据";
    }
}
