<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/selLike.js"></script>

</head>
<body>
	<form action="">
		车点编号：<input type="text" id="t1"/><br/>
		车点名称：<input type="text" id="t2"/><br/>
		地址：<input type="text" id="t3"/><br/>
		<input type="button" value="查询" id="b1"/>
	</form>
	
	<table id="tab1">
		<tr>
			<th width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">车点编号</span></div></th>
	        <th width="14%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">车点名称</span></div></th>
	        <th width="16%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">地点</span></div></th>
	        <th width="27%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">负责人</span></div></th>
	        <th width="14%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">操作</span></div></th>
		</tr>
	</table>
	<div>
		<table id="tab2">
			
		</table>
	</div>
	
</body>
</html>