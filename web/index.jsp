<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>中英自动翻译</title>
    <script src="fanyi.js"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body style="background-color: antiquewhite;margin-top: 100px">
	<div style="margin-left: 100px;color: red;margin-bottom: 10px">自动检测翻译</div>
	<span style="margin-left: 100px">
		<textarea style="height: 200px; width: 300px;" id="from" onkeyup="fanyi()" placeholder="请输入...."></textarea>


		<span style="color: cornflowerblue">任意语言</span>
	</span>

	<span style="margin-left: 150px;">

		<textarea id="to" style="height: 200px; width: 300px;" id="to" ></textarea>
				<span style="color: rebeccapurple">英文</span>

		</span>
<br>
<br>
<button onclick="fanyi()" style="width: 80px;margin-left: 100px;">翻译</button>
</body>
</html>