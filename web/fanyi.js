function fanyi(){
	var fromValue = document.getElementById("from").value;
	$.ajax({
		url:"http://localhost:8080/v1/fanyi?fromValue="+fromValue,
		type:'post',//HTTP请求类型
		timeout:10000,//超时时间设置为10秒；
		success:function(data){
			alert(data.trans_result[0].dst);
		}
	});

}