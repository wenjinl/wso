package com.wso.biz;

import com.wso.biz.getInfo.BizGetInfo;
import com.wso.dao.DaoLogin;
import com.wso.dm.DmBasKidNa;
import com.wso.dm.user.DmLoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
@Service
public class BizLogin {
    @Autowired
    BizGetInfo bizGetLoginInfo;
    @Autowired
    DaoLogin daoLogin;
    public Boolean getLoginUser(Integer logKid, HttpSession session){
        DmLoginUser user=bizGetLoginInfo.getUser(logKid);
        if (user==null){
            return false;
        }
        Integer userRole=0;
        if(user.getNrole()!=null){
            userRole=user.getNrole();
        }
        session.setAttribute("userRole",userRole );
        //bizIdNa.addAcc(vmLoginUser.getAccKid(),vmLoginUser.getUserName());
        session.setAttribute("LoginCode", user.getUserName());
        session.setAttribute("accKid", user.getAccKid());
        session.setAttribute("loginUser", user);
        addLoginUser(user.getAccKid(),user.getUserName());
        return true;
    }
    private void addLoginUser(Integer kid,String na){
        try {
            DmBasKidNa user=daoLogin.findLoginUser(kid);
            if(user==null){
                user=new DmBasKidNa();
                user.setKid(kid);user.setNa(na);
                daoLogin.addUser(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
