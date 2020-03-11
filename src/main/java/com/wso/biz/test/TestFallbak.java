package com.wso.biz.test;

import org.springframework.stereotype.Component;

@Component
public class TestFallbak implements Test1{
    @Override
    public String getInfo() {
        return "wsg无法访问";
    }
}
