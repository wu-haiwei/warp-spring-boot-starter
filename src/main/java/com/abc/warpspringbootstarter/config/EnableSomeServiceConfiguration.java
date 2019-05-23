package com.abc.warpspringbootstarter.config;

import com.abc.warpspringbootstarter.bean.SomeServiceProperties;
import com.abc.warpspringbootstarter.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SomeService.class)
@EnableConfigurationProperties(SomeServiceProperties.class)
public class EnableSomeServiceConfiguration {

    @Autowired
    private SomeServiceProperties properties;

    @ConditionalOnProperty(name = "some.service.enable", havingValue = "true", matchIfMissing = true)
    public SomeService someService() {
        SomeService someService = new SomeService(properties.getOperator());
        return someService;
    }

    @ConditionalOnMissingBean
    public SomeService someService2() {
        SomeService someService = new SomeService("+");
        return someService;
    }
}
