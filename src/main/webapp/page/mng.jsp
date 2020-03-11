<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="sharePage.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订单管理系统</title>
    <link rel="icon" href="/wso/img/wso_mng.ico" type="images/x-ico" />
    <script type="text/javascript">
        var serverUrl="${serverUrl}";
        var accKid=${accKid};
        var webCode="${webCode}";
    </script>
    <script type="text/javascript" src="/wso/reseach/mng.js"></script>
    <script type="text/javascript">
        function goWsg(){
            var url= window.location.href;
            var p1=url.indexOf("http://");
            if(p1>=0) p1=8; else p1=1;
            var p2=url.indexOf("/",p1);
            var nextU=url.substring(0, p2);
            var site=nextU+'/wso';
            var url1=serverUrl+'/wsg/gate/out/reqIntoGate?webCode='+webCode+'&accKid='+accKid+'&site='+site;
            addTab('系统管理',3,url1);
        }
    </script>
</head>
<body class="easyui-layout">
    <div id="message" class="abc"
         style="position: absolute; border: 1px gray solid; display: inline-block; z-index: 9999; width: 430px; height: 170px; border-radius: 5px; left: 20px; background-color: #F0F0F0; top: 40px; display: none; padding: 10px">
        <a id="btn" href="/wso/loginOut" class="easyui-linkbutton"
           data-options="iconCls:'icon-back'">退出</a>
        <iframe scrolling="auto" frameborder="0"
                src="${serverUrl}/wsg/viewPersonalInfo?accKid=${accKid}"
                style="width: 100%; height: 80%; background-color: #F0F0F0;">
        </iframe>
    </div>
    <div data-options="region:'west',split:true,border:false,collapsible:false"
         style="width:250px;">
        <div id="man">
            <a title="${loginUser.userName }" href="javascript:void(0)"
               plain="true" class="easyui-linkbutton"
               data-options="iconCls:'icon-man'">${loginUser.userName }</a>
        </div>
        <div id="aa" class="easyui-accordion">
            <c:forEach items="${topList}" var="accordion" varStatus="var">
                <div id="acc${accordion.kid }" title="${accordion.na }"
                     style="padding: 10px;">
                    <jsp:include page="${path}/page/mngPart/moduleBox.jsp">
                        <jsp:param value="${accordion.kid }" name="kid" />
                    </jsp:include>
                </div>
            </c:forEach>
        </div>
    </div>
    <div data-options="region:'center'" style="background:#eee;">
        <div id="tt" class="easyui-tabs" style="width:100%;height:100%;">
        </div>
    </div>
</body>
</html>
