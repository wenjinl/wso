package com.wso.webFace;

import com.wso.biz.BizMng;
import com.wso.sup.run.RunWsgerM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class FaceMng {
    @Autowired
    BizMng bizMng;
    @RequestMapping("/mng")
    public String mng(Model model, HttpSession session){
        Integer accKid = (Integer) session.getAttribute("accKid");
        model.addAttribute("topList",bizMng.findTopTree(accKid));
        model.addAttribute("webCode", RunWsgerM.webCode());
        model.addAttribute("serverUrl", RunWsgerM.serverUrl());
        return "page/mng";
    }
}
