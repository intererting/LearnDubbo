package com.yly.client.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/14 下午2:50
 * @since 1.0
 */
@Slf4j
public class NotifyImpl implements Notify {
    @Override
    public void onreturn(String result, String value) {
        log.info(value + " onreturn:" + result);
    }

    @Override
    public void oninvoke(String value) {
        log.info(value + " " + "oninvoke");
    }

    @Override
    public void onthrow(Throwable ex, String value) {
        log.info(value + " onthrow:" + ex.getMessage());
    }
}
