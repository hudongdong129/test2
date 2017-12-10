$(function(){
	var i=0;
	$("#button1").click(function(){
		//获得站点的id
		var station_id = $('#code').val();
		$('form').append("<div id='dv1'><table id='d1'><tr><td>车桩供应商</td><td><input type='text' name='alp["+i+"].vender_id'/></td><td>车桩编号</td><td><input type='text' name='alp["+i+"].pile_code'/></td></tr>" +
				"<tr><td>所属车点</td><td><input type='text' name='alp["+i+"].station_id' value="+station_id+"></td><td>状态</td><td><input type='text' name='alp["+i+"].status'/></td></tr>"+
				"<tr><td>安装日期</td><td><input type='text' name='alp["+i+"].install_time'/></td><td>拆解日期</td><td><input type='text' name='alp["+i+"].disassembly_time'/></td></tr>"+
				"<tr><td>操作人</td><td><input type='text' name='alp["+i+"].user_id'/></td><td>操作时间</td><td><input type='text' name='alp["+i+"].operator_time'/></td></tr>"+
				"<tr><td>所存车辆</td><td><input type='text' name='alp["+i+"].bicycle_id'/></td><td>备注</td><td><input type='text' name='alp["+i+"].remark'/></td></tr>"+
				"<tr><td><input type='button' value='取消' id='b2' /></td></tr>"+
				"</table></div>");	
		i++;
	});
	$("[id=b2]",this).click(function(){
		alert(0);
		var a1 = $(this).parent("td").parent("tr").parent("table")
		alert(a1);
	});	
	
	//
	$('#address').change(function(){
		
		var reg=/^\W{1,4}市\W{1,4}区\W{1,20}$/;
		var address = $("#address").val();
		alert(reg.test(address));
		if(!reg.test(address)){
			alert("输入格式不对，请按照xx市xx区xxx进行填写");
		}
		
		
	});
	
});	


/*function deleteDiv(obj){
	var o = document.getElementById(obj.id);
	var z = o.parentElement.parentElement.parentElement;
	alert(z);
	
	var my = document.getElementById(z.id);
	alert(my);
	if(my!=null){
		my.parentNode.removeChild(my);
	}

}*/

	
	

	


