<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateAll.do">
		<table>
			<c:forEach items="${lsp}" var="sp" begin="0" end="0">
			<tr>
				<td style="display: none"><input type="text" value="${sp.station_id }" name="station_id"/></td>
				<td>车点编号</td>
				<td><input type="text" value="${sp.station_code }" name="station_code"/></td>
				<td>车点名称</td>
				<td><input type="text" value="${sp.station_name }" name="station_name"/></td>
				<td>车点经度</td>
				<td><input type="text" value="${sp.longitude }" name="longitude"/></td>
				<td>车点维度</td>
				<td><input type="text" value="${sp.latitude }" name="latitude"/></td>
			</tr>
			<tr>
				<td>车点车桩数量</td>
				<td><input type="text" value="${sp.bicycle_pile_num }" name="bicycle_pile_num"/></td>
				<td>地址</td>
				<td><input type="text" value="${sp.address }" name="address"/></td>
				<td>负责人</td>
				<td><input type="text" value="${sp.person_in_charge }" name="person_in_charge"/></td>
				<td>新建日期</td>
				<td><input type="text" value="${sp.build_time }" name="build_time"/></td>
			</tr>
			<tr>
				<td>运行日期</td>
				<td><input type="text" value="${sp.run_time }" name="run_time"/></td>
				<td>操作人</td>
				<td><input type="text" value="${sp.person_in_charge}" name="user_id"/></td>
				<td>创建时间</td>
				<td><input type="text" value="${sp.build_time }" name="create_time"/></td>
				<td>备注</td>
				<td><input type="text" value="${sp.remark }" name="remark"/></td>
			</tr>
			</c:forEach>
			<c:forEach items="${lsp}" var="sp" varStatus="st">
			<tr>
				<td style="display: none"><input type="text" value="${sp.pile_id}" name="alp[${st.index }].pile_id"/></td>
				<td colspan="2">车桩供应商</td>
				<td colspan="2"><input type='text' value="${sp.vender_id}" name='alp[${st.index }].vender_id'/></td>
				<td colspan="2">车桩编号</td>
				<td colspan="2"><input type='text' value="${sp.pile_code }" name='alp[${st.index }].pile_code'/></td>
			</tr>
			<tr>
				<td colspan="2">所属车点</td>
				<td colspan="2"><input type='text' value="${sp.station_id2 }" name='alp[${st.index }].station_id'/></td>
				<td colspan="2">状态</td>
				<td colspan="2"><input type='text' value="${sp.status }" name='alp[${st.index }].status'/></td>
			</tr>
			<tr>
				<td colspan="2">安装日期</td>
				<td colspan="2"><input type='text' value="${sp.install_time }"name='alp[${st.index }].install_time'/></td>
				<td colspan="2">拆解日期</td>
				<td colspan="2"><input type='text' value="${sp.disassembly_time }" name='alp[${st.index }].disassembly_time'/></td>
			</tr>
			<tr>
				<td colspan="2">操作人</td>
				<td colspan="2"><input type='text' value="${sp.user_id2 }" name='alp[${st.index }].user_id'/></td>
				<td colspan="2">操作时间</td>
				<td colspan="2"><input type='text' value="${sp.operator_time }" name='alp[${st.index }].operator_time'/></td>
			</tr>
			<tr>
				<td colspan="2">所存车辆</td>
				<td colspan="2"><input type='text' value="${sp.bicycle_id }" name='alp[${st.index }].bicycle_id'/></td>
				<td colspan="2">备注</td>
				<td colspan="2"><input type='text' value="${sp.remark2 }" name='alp[${st.index }].remark'/></td>
			</tr>
			</c:forEach>
			<tr>
				<td><input type="submit" value="确定"/></td>
			</tr>
		</table>
	</form>
	
</body>
</html>