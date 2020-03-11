package com.wso.biz.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(value = "wsg",fallback = TestFallbak.class)
public interface Test1 {
    @RequestMapping("/wsg/test")
    public String getInfo();
}
