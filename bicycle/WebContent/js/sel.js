$(function(){
	
	//alert(${message});
	if('${message}'=="注销成功"){
		alert("注销成功");
	}else if('${message}'=="车桩有车无法删除"){
		alert("车桩有车无法删除");
	}
	
	$("[id=d1]",this).dblclick(function(){
		
		var val = $(this).closest('tr').find('td:eq(1)').text();
		
		location="checkId.do?station_id="+val;
	});
	
	$("[id=d2]",this).click(function(){
		var vl = $(this).closest('tr').find('td:eq(1)').text();
		alert(vl);
		location="selectStation.do?station_id="+vl;
			
	});
	
	//跳转页面
	$("#b1").click(function(){
		
		var a1 = $("#text1").val();
		location="checkStation.do?nowPage="+a1;
		
	});
	
	
});

function start(){
	var a = $("#a1").text();
	if('${message}'=="注销成功"){
		alert("注销成功");
	}else if('${message}'=="车桩有车无法删除"){
		alert("车桩有车无法删除");
	}
}