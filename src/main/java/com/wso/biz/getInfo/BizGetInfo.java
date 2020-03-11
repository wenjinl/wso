package com.wso.biz.getInfo;

import com.wso.dm.DmBasKidNa;
import com.wso.dm.user.DmLoginUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "wsg",fallback = BizGetInfoImpl.class)
public interface BizGetInfo {
    @RequestMapping("/wsg/getUser")
    public DmLoginUser getUser(@RequestParam("logKid")Integer logKid);
    @RequestMapping("/wsg/gate/out/getTreeTop")
    public List<DmBasKidNa> getTreeTop(@RequestParam("webCode")String webCode, @RequestParam("accKid")Integer accKid);
}
