package com.wso.webFace.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mng/order")
public class FaceOrder {
    @RequestMapping("/viewOrderMng")
    public String viewOrderMng(Integer moduleId){
        return "page/order/orderMng";
    }
}
