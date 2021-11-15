package com.yly.server.config;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/12 下午4:31
 * @since 1.0
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.yly.server.service")
@PropertySource("classpath:dubbo-provider.properties")
public class ProviderConfiguration {
//    @Bean
//    public ProviderConfig providerConfig() {
//        ProviderConfig providerConfig = new ProviderConfig();
//优先级比客户端高
//        providerConfig.setTimeout(1000);
//        return providerConfig;
//    }

//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(-1);
//        protocolConfig.setTransporter("netty4");
//        protocolConfig.setThreadpool("fixed");
//        // 设置线程分发策略
//        protocolConfig.setDispatcher("all2");
//        protocolConfig.setThreads(200);
//        return protocolConfig;
//    }
}
