package com.yly.service;

import com.yly.service.model.ValidateModel;

import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/12 下午4:27
 * @since 1.0
 */
public interface TestService {
    String test(String value);

    @interface Validate {}

    String validate(ValidateModel model);
}
