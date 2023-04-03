package com.yly.service.model;

import com.yly.service.TestService;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/14 上午11:16
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class ValidateModel implements Serializable {

    @Min(value = 0, groups = TestService.Validate.class)
    @Max(value = 150, groups = TestService.Validate.class)
    private int age;
}
