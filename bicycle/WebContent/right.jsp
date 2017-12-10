<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript" src="script/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/sel.js"></script>
</head>
<body onload="start()">
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="24" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="6%" height="19" valign="bottom"><div align="center"><img src="images/tb.gif" width="14" height="14" /></div></td>
                <td width="94%" valign="bottom"><span class="STYLE1"> 车辆站点基本信息列表</span></td>
              </tr>
            </table></td>
            <td><div align="right"><span class="STYLE1">
              <input type="checkbox" name="checkbox11" id="checkbox11" />
              全选      &nbsp;&nbsp;<img src="images/add.gif" width="10" height="10" /> <a href="add.jsp">添加</a>   &nbsp; <img src="images/del.gif" width="10" height="10" /> 删除    &nbsp;&nbsp;<img src="images/edit.gif" width="10" height="10" /> <a href="selectLike.jsp">查询</a></span><span class="STYLE1"> &nbsp;</span></div></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td>
    <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
      <tr>
        <td width="4%" height="20" bgcolor="d3eaef" class="STYLE10">
        <div align="center">
          <input type="checkbox" name="checkbox" id="checkbox" />
        </div></td>
        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" style="display: none;"><div align="center"><span class="STYLE10"></span></div></td>
        <td width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">车点编号</span></div></td>
        <td width="14%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">车点名称</span></div></td>
        <td width="16%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">地点</span></div></td>
        <td width="27%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">负责人</span></div></td>
        <td width="14%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">操作</span></div></td>
      </tr>
      
      
      	<c:forEach items="${al}" var="ls" varStatus="i">
	      <tr>
	        <td height="20" bgcolor="#FFFFFF">
	        	<div align="center"><input type="checkbox" name="checkbox2" id="checkbox2" /></div>
	        </td>
	        <td height="20" bgcolor="#FFFFFF" class="STYLE6" style="display: none;"><div align="center"><span class="STYLE19">${ls.station_id }</span></div></td>
	        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center" id="d1">${ls.station_code }</div></td>
	        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">${ls.station_name }</div></td>
	        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">${ls.address }</div></td>
	        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">${ls.user_id }</div></td>
	        <td height="20" bgcolor="#FFFFFF"><div align="center" class="STYLE21"><a href="javascript:void(0)" id="d2">注销</a></div></td>
	      </tr>
      </c:forEach>
    </table></td>
  </tr>
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="33%"><div align="left"><span class="STYLE22">&nbsp;&nbsp;&nbsp;&nbsp;共有<strong> </strong> 条记录，当前第<strong> ${page.nowPage }</strong> 页，共 <strong>${page.totalPage }</strong> 页</span></div></td>
        <td width="67%"><table width="312" border="0" align="right" cellpadding="0" cellspacing="0">
          <tr>
            <td width="49"><div align="center"><a href="checkStation.do?nowPage=1">首页</a></div></td>
            <c:choose >
            	<c:when test="${page.nowPage==1}">
            		 <td width="49"><div align="center"><a href="checkStation.do?nowPage=${nowPage+1}">下一页</a></div></td>
            	</c:when>
            	<c:when test="${page.nowPage == page.totalPage}">
            		<td width="49"><div align="center"><a href="checkStation.do?nowPage=${nowPage-1 }">上一页</a></div></td>
            	</c:when>
            	<c:otherwise>
            		<td width="49"><div align="center"><a href="checkStation.do?nowPage=${nowPage-1 }">上一页</a></div></td>
            		 <td width="49"><div align="center"><a href="checkStation.do?nowPage=${nowPage+1}">下一页</a></div></td>
            	</c:otherwise>
            </c:choose>
            
            <td width="49"><div align="center"><img src="images/main_60.gif" width="40" height="15" /></div></td>
            <td width="37" class="STYLE22"><div align="center">转到</div></td>
            <td width="22"><div align="center">
              <input type="text"  id="text1"  style="width:20px; height:12px; font-size:12px; border:solid 1px #7aaebd;"/>
            </div></td>
            <td width="22" class="STYLE22"><div align="center">页</div></td>
            <td width="35"><input type="button" value="转" id="b1"/></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>

	<a style="display: none;" id="a1">${message}</a>

</body>
</html>