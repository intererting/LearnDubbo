package com.yly.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/12 下午4:06
 * @since 1.0
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
