<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="/wso/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/wso/easyui/themes/icon.css">
<script type="text/javascript" src="/wso/easyui/jquery.min.js"></script>
<script type="text/javascript" src="/wso/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/wso/easyui/easyui-lang-zh_CN.js"></script>
<style type="text/css">
    a {
        color:#0088DB;
        text-decoration:none;
        cursor:pointer
    }
    a:hover {
        color:#2A5E8E
    }
</style>