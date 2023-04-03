package com.yly.client.util;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/14 下午2:49
 * @since 1.0
 */
public interface Notify {
    public void onreturn(String result, String value);

    public void oninvoke(String value);

    public void onthrow(Throwable ex, String value);
}