package com.wso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.wso.dao")
public class WsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsoApplication.class, args);
    }
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        /** 设置视图路径的前缀 */
        resolver.setPrefix("/");
        /** 设置视图路径的后缀 */
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
