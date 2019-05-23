# warp-spring-boot-starter

自定义springboo starter 步骤

1. 定义业务类 SomeService

2. 定义配置参数类 SomeServiceProperties
	使用注解 @ConfigurationProperties("some.service") 来绑定配置参数前缀
	
3. 定义自动配置类 EnableSomeServiceConfiguration
	使用注解 @Configuration 表明是一个Spring容器配置类
	使用注解 @ConditionalOnClass(SomeService.class) 表明该配置类生效的条件
	使用注解 @EnableConfigurationProperties(SomeServiceProperties.class) 导入之前定义的配置参数类
	
4. 在resource/META-INF 下面新建文件 spring.factories
	添加自动配置类配置:
		org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.abc.warpspringbootstarter.config.EnableSomeServiceConfiguration