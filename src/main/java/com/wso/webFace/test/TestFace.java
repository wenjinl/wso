package com.wso.webFace.test;

import com.wso.biz.BizLogin;
import com.wso.biz.test.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFace {
    @Autowired
    Test1 test1;
    @RequestMapping("/testFeign")
    public String testFeign(){
        String s=test1.getInfo();
        return s;
    }
    @RequestMapping("/test1")
    public String test1(){
        String s=test1.getInfo();
        return s;
    }
}
