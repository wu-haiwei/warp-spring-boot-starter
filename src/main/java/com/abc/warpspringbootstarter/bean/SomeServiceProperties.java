package com.abc.warpspringbootstarter.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("some.service")
public class SomeServiceProperties {

    private String operator;
}
