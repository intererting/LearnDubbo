package com.yly.client.controller;

import com.yly.client.service.ClientService;
import com.yly.service.model.ValidateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/12 下午4:53
 * @since 1.0
 */
@RestController
public class TestController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/test")
    public String test() {
        return clientService.testDubboServer("haha");
    }

    @GetMapping("/testMerger")
    public String testMerger() {
        return clientService.testDubboMerger();
    }

    @GetMapping("/testValidate")
    public String testValidate() {
        return clientService.testValidate(new ValidateModel(1000));
    }

    @GetMapping("/testStub")
    public String testStub() {
        return clientService.testStub();
    }

    @GetMapping("/testMock")
    public String testMock() {
        return clientService.testMock();
    }
}
