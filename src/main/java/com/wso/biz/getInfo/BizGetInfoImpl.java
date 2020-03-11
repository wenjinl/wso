package com.wso.biz.getInfo;

import com.wso.dm.DmBasKidNa;
import com.wso.dm.user.DmLoginUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BizGetInfoImpl implements BizGetInfo {
    @Override
    public DmLoginUser getUser(Integer logKid) {
        System.out.println("获取用户信息错误！！！");
        return new DmLoginUser();
    }

    @Override
    public List<DmBasKidNa> getTreeTop(String webCode, Integer accKid) {
        System.out.println("获取模块信息错误！！！");
        return new ArrayList<>();
    }
}
