<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String kidStr = request.getParameter("kid");
%>
<ul id="moduleTree<%=kidStr%>">
</ul>
<script type="text/javascript">
	$(function(){
		loadMainTree(<%=kidStr%>);
	})
</script>