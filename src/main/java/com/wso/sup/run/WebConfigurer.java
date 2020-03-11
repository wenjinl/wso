package com.wso.sup.run;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@EnableWebMvc
@Configuration
public class WebConfigurer implements WebMvcConfigurer  {
    @Autowired
    private RunLoginIntercept loginInterceptor;
	 // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }
    //解决跨域问题
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//设置允许跨域的路径
                .allowedOrigins("*")//设置允许跨域请求的域名
                .allowCredentials(true)//是否允许证书 不再默认开启
                .allowedMethods("GET","POST","DELETE","PUT")
                .maxAge(3600);
    }
    // 这个方法用来注册拦截器，自己写好的拦截器需要通过这里添加注册才能生效
   @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	// registry.addInterceptor(runRecordIntercept).addPathPatterns("/gate/setRecord");//记录浏览
    	registry.addInterceptor(loginInterceptor).addPathPatterns("/mng/**");
    }

}
