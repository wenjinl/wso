package com.wso.biz;

import com.wso.biz.getInfo.BizGetInfo;
import com.wso.dm.DmBasKidNa;
import com.wso.sup.run.RunWsgerM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BizMng {
    @Resource
    BizGetInfo bizGetInfo;
    public List<DmBasKidNa> findTopTree(Integer accKid){
        List<DmBasKidNa> list=bizGetInfo.getTreeTop(RunWsgerM.webCode(),accKid);
        return list;
    }
}
