package com.wso.sup.run;

public class RunWsgerM {
    public  static String loginBoxUrl(){
        String url=serverUrl()+"/wsg/proxyLogin";
        return url;
    }

    public static  String webCode(){
        String webCode="3be383ae271537b84ff0584246981ab4";
        return webCode;
    }

    public static String serverUrl(){
        //String url="http://192.168.13.120:8080";
        String url="http://192.168.13.118:8080";
        return url;
    }
}
