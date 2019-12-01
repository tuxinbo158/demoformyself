<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<link rel="stylesheet" type="text/css" href="css/home_page.css"/>
		<link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
		<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/home_page.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<!--header-->
		<div class="header">
			<div class="title">
				<p>青青大学，AI考勤管理系统</p>
			</div>
			<div class="search">
					<i class="fa fa-search" aria-hidden="true"></i>
					<input type="text" name=""  value="" placeholder="日期/学号/班级" id="search-content">
					<input type="button" id="cancel" value="取消" />
			</div>
		</div>
		<div class="left">
				<i class="fa fa-user-o" aria-hidden="true"></i>
			<!--</div>-->
			<div class="left-info">
				<p>管理员:<%=session.getAttribute("sjmc") %></p>
				<p>编号:<%=session.getAttribute("name") %></p>
			</div>
		
		</div>
		
		
		<div class="content">
			
			
			<div class="one">
				<p class="one-title">2018年九月二十五日</p>
				<ul class="allContent">
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>移动应用开发161</li>
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>市场营销161</li>
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>市场营销162</li>
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>数字媒体艺术161</li>
					<li onclick="Watch()" class="active" style="cursor: pointer;"><i id="right" class="fa fa-angle-right" aria-hidden="true" ></i><i id="down" class="fa fa-angle-down" aria-hidden="true" ></i>数字媒体艺术162</li>
						<ul class="ul-content">
						</ul>
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>移动应用开发</li>
				</ul>
			</div>
			
			<div class="two">
				<p class="two-title">2018年九月二十五日</p>
				<ul class="two-allContent">
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>移动应用开发161</li>
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>市场营销161</li>
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>市场营销162</li>
					<li><i class="fa fa-angle-right" aria-hidden="true"></i>数字媒体艺术161</li>
					<li>&nbsp;数字媒体艺术162</li>
					<li>&nbsp;</li>
				</ul>
			</div>
		</div>

	</body>
</html>
