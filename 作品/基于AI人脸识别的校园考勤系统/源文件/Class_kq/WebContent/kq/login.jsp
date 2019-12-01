<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
			body{
				margin: 0;
				padding: 0;
				background-size: cover;
				background-image: url(img/banner.jpg);
			}
			.wrap{
				width: 100%;
				min-height:680px;
				position: relative;				
			}
			.login_box{
				width:30%;
				height: 40%;
				background-color:#000000;
				background-color:rgba(0,0,0,0.2);
				border-radius: 5px;
				position: absolute;
				top: 0;
				right: 0;
				left: 0;
				bottom: 0;
				margin: auto;
				text-align: center;
				line-height: 25px;
			}
			.login_box div{
				margin-bottom: 25px;
			}
			#login{
				background-color:#ddd;
				width:80px;
				height:40px;
				font-size:15px;
				color:#fff;
				font-weight:bold;
				border-radius:5px;
				border: none;
			}
		</style>
	</head>
	<body>
		<div class="wrap">
			<div class="login_box">
				<h2>管理员登录</h2>	
				<div class="account">
					帐号： <input type="text" id="username" value="" placeholder="请输入帐号"/>
				</div>
				<div class="password">
					密码： <input type="password" id="password" name="" placeholder="请输入密码"/>
				</div>
				<input type="button" id="login" value="登录" />
			</div>
		</div>
		<script type="text/javascript">
			
			var login=document.getElementById("login");
			login.onclick=function (from) {
				if(username.value==""||password.value==""){
					alert("账号密码均不可为空！")
				}else{
					$.ajax({
						type : "post",
						url : "../login",
						/* url : "../login?username="+username+"&password="+password, */
						data:{
							"username" : $('#username').val(),
							"password" : $('#password').val(),
						}, 
						dataType : "json",
						async : false,
						success : function(res) {
							if(res==false){
								window.location.href="/Class_kq/kq/login.jsp";
							}else{
								window.location.href="/Class_kq/kq/home_page.jsp";
							}
						}
					});
				}
			}
		</script>
	</body>
</html>
