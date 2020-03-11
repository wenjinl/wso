<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单管理系统登录</title>
    <link rel="icon" href="/wso/img/wso_mng.ico" type="images/x-ico" />
</head>
<body style="margin: 0px">
<iframe style="width:100%;height:100%;padding:0px;background-color:white;"
        src="<%=com.wso.sup.run.RunWsgerM.loginBoxUrl()%>?webCode=<%=com.wso.sup.run.RunWsgerM.webCode()%>&site=${site}"
        frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no"></iframe>
</body>
</html>
