<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<!-- Top content -->
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>BBS</strong> registered
						</h1>
						<div class="description">
							<p>Please use your E-mail for registered!</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>Registered to our site</h3>
								<p>Use E-mail、Password and Birthday to registered:</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-lock"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form action="<%=basePath%>user/newUser" method="post"
								class="login-form" id="newUser">
								<div class="form-group">
									<label class="sr-only" for="form-username">Username</label> <input
										type="email" name="email" placeholder="E-mail..."
										class="form-username form-control" id="form-username"
										id="email" onchange="username(value)" value="${user.email}">
								</div>
								<script type="text/javascript">
									function username(email) {
										 $.ajax({ 
									            type: 'post', 
									            data:$('#newUser').serialize(),
											    url:'user/verifyEmail',  
									            dataType:"json",
									            async:true,
									            success: function () {
									            },
									            error:function()
									            {
									        		document.getElementById('span'+formId).parentNode.removeChild(document.getElementById('span'+formId)); //添加到form中显示
									                var span=document.createElement('span');
									                span.setAttribute('id', 'span'+formId); //定义类型是文本输
									        		document.getElementById(formId).appendChild(span); //添加到form中显示
									            },            
									        });
									}
								</script>
								<div class="form-group">
									<label class="sr-only" for="form-password">Password</label> <input
										type="password" name="password" placeholder="Password..."
										class="form-password form-control" id="form-password"
										value="${user.password}">
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">Sex</label> <select
										name="sex" class="form-password form-control"
										id="form-password">
										<option value="男">男</option>
										<option value="女">女</option>
									</select>
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">Birthday</label> <input
										type="date" name="birthday" placeholder="Birthday..."
										class="form-password form-control" id="form-password"
										value="${user.birthday}">
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">Code</label> <input
										type="text" name="code" placeholder="Code..."
										class="form-password form-control" id="form-password">
								</div>
								<div align="center">
									<input id="btnSendCode" type="button" onclick="sendMessage()"
										value="发送验证码" class="btn" />
								</div>
								<button type="submit" class="btn">Registered!</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>

</html>