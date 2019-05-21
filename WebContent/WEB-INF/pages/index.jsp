<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Title</title>
</head>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.1.min.js"></script>

<script language="JavaScript">
$(function(){
	$("#search").click(function(){
		$.ajax({
			type : "post",
			url : "user/findAllById.do",
			data : $("#uId"),
			dataType : "json",
			success : function(result){
			var html = "";
			html += "<td>" + result.data.id + "</td><td>"
					+ result.data.username + "</td><td>"
					+ result.data.email + "</td><td>"
					+ result.data.mobile + "</td>";
			$("#userAll").html(html);
		},error : function(){//null值不会被success回调函数捕获，因此可以通过error来实现该功能
			alert("请输入正确的编号！");}
		})
	})
})
</script>
<body>
	<center>
		<div style="margin-top: 25px">
			请输入所要查询的编号:
			<input type="text" id="uId" name="uId" />
			<input id="search" style="margin-left: 10px" type="button" value="搜索"><br/>
		</div>
		<div style="margin-top: 50px">
			<table border="1">
				<tr>
					<td>用户编号</td>
					<td>用户名称</td>
					<td>E-mail</td>
					<td>电话号码</td>
				</tr>
				<tr id="userAll"></tr>
			</table>
		</div>
	</center>
</body>
</html>