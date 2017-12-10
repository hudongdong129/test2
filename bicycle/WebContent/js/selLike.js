$(function(){
	
	$("#b1").click(function(){
		var t1 = $("#t1").val();
		var t2 = $("#t2").val();
		var t3 = $("#t3").val();
		
		$.ajax({
			type:"post",
			url:"checkLike.do",
			data:{"station_code":t1,"station_name":t2,"address":t3},
			dataType:"text",
			
			success:function(data){
				alert(data);
				var d = eval("("+data+")");
				alert(d);
				var html="";
				$("#tab1 tr").not(':eq(0)').empty();
				for(var i=0;i<d.length;i++){
					html+="<tr><td style='display:none;'>"+d[i]["station_id"]+"</td><td>"+d[i]["station_code"]+"</td><td>"+d[i]["station_name"]+
						"</td><td>"+d[i]["address"]+"</td><td>"+d[i]["person_in_charge"]+
						"</td><td ><span onclick='getSee(this)'>查看</span></td></tr>"
				}
				$("#tab1").append(html);
			},
			error:function(){
				alert("error");
				}			
		});		
	});
});

function getSee(obj){
	var a1 = obj.parentNode.parentNode.cells[0].innerHTML;
	alert(a1);
	

		$.ajax({
			type:"post",
			url:"checkId2.do",
			data:{"station_id":a1},
			dataType:"text",
		
		success:function(data){
			var d = eval("("+data+")");
			alert(d);
			var html="";
			$("#tab2").remove();
			for(var i=0;i<d.length;i++){
				html+="<tr><td>车桩供应商</td><td><input type='text' value="+d[i]["vender_id"]+"></td><td>车桩编号</td><td><input type='text' value="+d[i]["pile_code"]+"></td></tr>"+
					"<tr><td>所属车点</td><td><input type='text' value="+d[i]["station_id"]+"></td><td>状态</td><td><input type='text' value="+d[i]["status"]+"></td></tr>"+
					"<tr><td>安装日期</td><td><input type='text' value="+d[i]["install_time"]+"></td><td>拆解日期</td><td><input type='text' value="+d[i]["disassembly_time"]+"></td></tr>"+
					"<tr><td>操作人</td><td><input type='text' value="+d[i]["user_id"]+"></td><td>操作时间</td><td><input type='text' value="+d[i]["operator_time"]+"></td></tr>"
			}
			$("#tab1").append(html);
		/*	<td colspan="2">车桩供应商</td>
			<td colspan="2"><input type='text' value="${sp.vender_id}" name='alp[${st.index }].vender_id'/></td>
			<td colspan="2">车桩编号</td>
			<td colspan="2"><input type='text' value="${sp.pile_code }" name='alp[${st.index }].pile_code'/></td>*/
			
		},
		error:function(){
			alert("error");
		}
	});
	
		
}



