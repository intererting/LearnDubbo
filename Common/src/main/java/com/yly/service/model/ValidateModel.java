package com.yly.service.model;

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

    @Min(0)
    @Max(150)
    private int age;
}
