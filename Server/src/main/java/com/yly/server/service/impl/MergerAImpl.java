package com.yly.server.service.impl;

import com.google.common.collect.Lists;
import com.yly.service.MergerService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/14 上午10:52
 * @since 1.0
 */
@DubboService(group = "one")
public class MergerAImpl implements MergerService {

    @Override
    public List<String> mergeResult() {
        return Lists.newArrayList("from one");
    }
}
