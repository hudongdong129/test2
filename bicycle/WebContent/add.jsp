<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/add.js"  charset="UTF-8"></script>
</head>
<body>
	<form action="addStation.do">
		<table>
			<tr>
				<td>车点编号</td>
				<td><input type="text" name="station_code" id="code"/></td>
				<td>车点名称</td>
				<td><input type="text" name="station_name"/></td>
				<td>车点经度</td>
				<td><input type="text" name="longitude"/></td>
				<td>车点维度</td>
				<td><input type="text" name="latitude"/></td>
			</tr>
			<tr>
				<td>车点车桩数量</td>
				<td><input type="text" name="bicycle_pile_num"/></td>
				<td>地址</td>
				<td><input type="text" name="address" id="address"/></td>
				<td>负责人</td>
				<td><input type="text" name="person_in_charge"/></td>
				<td>新建日期</td>
				<td><input type="text" name="build_time"/></td>
			</tr>
			<tr>
				<td>运行日期</td>
				<td><input type="text" name="run_time"/></td>
				<td>操作人</td>
				<td><input type="text" name="user_id"/></td>
				<td>创建时间</td>
				<td><input type="text" name="create_time"/></td>
				<td>备注</td>
				<td><input type="text" name="remark"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="确认"/><input type="button" value="添加车桩信息" id="button1"/></td>	
			</tr>
		</table>
		
	</form>
</body>
</html>