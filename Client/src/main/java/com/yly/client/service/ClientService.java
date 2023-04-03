package com.yly.client.service;

import com.yly.client.util.Notify;
import com.yly.service.MergerService;
import com.yly.service.MockService;
import com.yly.service.StubService;
import com.yly.service.TestService;
import com.yly.service.model.ValidateModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/13 下午4:09
 * @since 1.0
 */
@Service
@Slf4j
public class ClientService {
    /**
     * group指定分组,在服务端找到该分组然后执行
     * retries在这里设置是可以的
     * timeout服务端优先级更高，方法级别最高
     * cache = "lru"
     */
    @DubboReference(interfaceClass = TestService.class, group = "initial", version = "2.0.0", methods = {
            @Method(name = "test", retries = 3, timeout = 10000, onreturn = "notify.onreturn", oninvoke = "notify.oninvoke", onthrow = "notify.onthrow")
    }, cluster = ClusterRules.FAIL_OVER, loadbalance = LoadbalanceRules.LEAST_ACTIVE, url = "dubbo://localhost:20881"
    )
    private TestService testService;

    /**
     * 将one,two两个分组的请求合并[from one, from two]
     */
    @DubboReference(interfaceClass = MergerService.class, group = "one,two", merger = "true")
    private MergerService mergerService;

    @DubboReference(interfaceClass = StubService.class, stub = "com.yly.client.service.StubServiceStub")
    private StubService stubService;

    @DubboReference(interfaceClass = MockService.class, mock = "com.yly.client.service.MockServiceMock")
    private MockService mockService;

    public String testDubboServer(String value) {
        try {
            String result = testService.test(value);
            return result;
        } catch (Exception e) {
            return "faild with " + e.getMessage();
        }
    }

    public String testDubboMerger() {
        return mergerService.mergeResult().toString();
    }

    public String testValidate(ValidateModel model) {
        try {
            return testService.validate(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    public String testStub() {
        return stubService.testStub();
    }

    public String testMock() {
        return mockService.mockTest();
    }
}
