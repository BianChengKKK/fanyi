<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>中英自动翻译</title>
    <script src="fanyi.js"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<span style="margin-left: 100px;">
				<textarea style="height: 200px; width: 300px;" id="from" >

				</textarea>


			<span>英语</span>
		</span>
<span style="margin-left: 100px;">自动翻译</span>
<span style="margin-left: 100px;">

				<textarea id="to" style="height: 200px; width: 300px;" id="to">

				</textarea>
				<span>中文</span>

		</span>

		<button onclick="fanyi()">翻译</button>
</body>
</html>