function fanyi(){
	var fromValue = document.getElementById("from").value;
	$.ajax({
		url:"http://localhost:8080/v1/fanyi?fromValue="+fromValue,
		type:'post',//HTTP请求类型
		timeout:10000,//超时时间设置为10秒；
		dataType: "json",
		success:function(data){
            document.getElementById("to").innerHTML = data.trans_result[0].dst;
		}
	});

}