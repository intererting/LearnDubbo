package com.yly.client.config;

import com.yly.client.util.Notify;
import com.yly.client.util.NotifyImpl;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/7/12 下午5:35
 * @since 1.0
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.yly.client.service")
@PropertySource("classpath:dubbo-consumer.properties")
public class ConsumerConfiguration {

//    @Bean
//    public ProviderConfig providerConfig() {
//        ProviderConfig providerConfig = new ProviderConfig();
//        //优先级最低
////        providerConfig.setTimeout(4000);
//        return providerConfig;
//    }

    @Bean(name = "notify")
    public Notify provideNotify() {
        return new NotifyImpl();
    }
}