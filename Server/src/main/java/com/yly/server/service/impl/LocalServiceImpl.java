package com.yly.server.service.impl;

import com.yly.server.service.LocalService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.Constants;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/14 下午2:33
 * @since 1.0
 */
@DubboService(scope = Constants.SCOPE_LOCAL)
@Slf4j
public class LocalServiceImpl implements LocalService {
    @Override
    public void testLocal() {
        log.info("test local service success");
    }
}
