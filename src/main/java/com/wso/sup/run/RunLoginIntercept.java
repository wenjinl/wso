package com.wso.sup.run;

import com.wso.dm.user.DmLoginUser;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class RunLoginIntercept implements HandlerInterceptor{
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		HttpSession session =request.getSession();
		DmLoginUser user=(DmLoginUser) session.getAttribute("loginUser");
		Boolean flag=true;
		if(user==null){
			StringBuffer curWebSite=request.getRequestURL();
			String urlPrefix="";
			int p1=curWebSite.indexOf("http://");
			if(p1>=0) p1=8; else p1=1;
			int p2=curWebSite.indexOf("/",p1);
			if(p2>0){
				urlPrefix=curWebSite.substring(0, p2);
			}else{
				urlPrefix=curWebSite.toString();
			}
			session.setAttribute("site", urlPrefix);
			request.getRequestDispatcher("/page/login0_wso.jsp").forward(request,response);
			flag=false;
		}
		return flag;
	}
	@Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}