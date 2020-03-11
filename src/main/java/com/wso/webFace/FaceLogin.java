package com.wso.webFace;

import com.wso.biz.BizLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class FaceLogin {
    @Autowired
    BizLogin bizLogin;
    @RequestMapping("/loginFn")
    public String loginFn(Integer logKid, HttpSession session){
        Boolean b=bizLogin.getLoginUser(logKid,session);
       return "redirect:/mng";
    }
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
       session.removeAttribute("loginUser");
       session.removeAttribute("accKid");
       session.removeAttribute("LoginCode");
       session.removeAttribute("userRole");
       return "redirect:/mng";
    }

}
