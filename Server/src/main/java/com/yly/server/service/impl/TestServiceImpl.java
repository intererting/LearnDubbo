package com.yly.server.service.impl;

import com.google.common.collect.Lists;
import com.yly.server.service.LocalService;
import com.yly.service.TestService;
import com.yly.service.model.ValidateModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.rpc.RpcContextAttachment;

import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/12 下午4:28
 * @since 1.0
 */
@DubboService(group = "initial", version = "2.0.0", validation = "true")
@Slf4j
public class TestServiceImpl implements TestService {

    @DubboReference(interfaceClass = LocalService.class)
    private LocalService localService;

    @Override
    public String test(String value) {
//        try {
//            Thread.sleep(40000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        localService.testLocal();
        return value + " success";
    }

    @Override
    public String validate(ValidateModel model) {
        return model.toString();
    }
}
