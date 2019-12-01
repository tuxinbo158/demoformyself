function a(){
	var getUlInfo=new Array(),ULInfo={};
	$(".ul-content").css({
		"display":"none"
	})
	$(".fa-angle-down").css({
		"display":"none"
	})
	$.ajax({
		type : "post",
		url : "../kq",
		/* url : "../login?username="+username+"&password="+password, */
		dataType : "json",
		async : false,
		success : function(res) {
			console.log(res);
			alert(res)
			for(var i=0;i<res.length;i++){
				ULInfo.left=res.ge(i).get("sj")+"&nbsp;&nbsp;"+res.ge(i).get("bh")+"&nbsp;&nbsp;"+res.ge(i).get("username")+"&nbsp;&nbsp;"+res.ge(i).get("kc");
				ULInfo.btn1=res.ge(i).get("sfqd")==1?"签到":"未签到";
				ULInfo.btn2=res.ge(i).get("sfqj")==1?"请假":"未请假";
				getUlInfo.push(ULInfo);
			}
		}
	});
	var i=0
	getUlInfo.forEach(function(item){
		i++;
		$(".ul-content").append(
		"<li style='font-size:12px;background-color:#ddd'>"+item.left+"<span  style='float:right;cursor: pointer;color:green;' onclick='yes(event)'>"+item.btn2+"</span><span id='"+i+"' style='float:right;margin-right:20px;cursor: pointer;color:red;' onclick='no(event)'>"+item.btn1+"</span></li>"
	)
	})
}


$(document).ready(function(){
	init()
});


function init(){
	getUlInfo()
}
function getUlInfo(){
	$(".ul-content").css({
		"display":"none"
	})
	$(".fa-angle-down").css({
		"display":"none"
	})
	var getUlInfo=[
	{
		"left":"上午&nbsp;&nbsp;20160608121&nbsp;&nbsp;张二大1&nbsp;&nbsp;Photoshop实训",
		"btn1":"未签到",
		"btn2":"已请假"
	},
	{
		"left":"上午&nbsp;&nbsp;20160608121&nbsp;&nbsp;张二大2&nbsp;&nbsp;Photoshop实训",
		"btn1":"未签到",
		"btn2":"已请假"
	},
	{
		"left":"上午&nbsp;&nbsp;20160608121&nbsp;&nbsp;张二大3&nbsp;&nbsp;Photoshop实训",
		"btn1":"未签到",
		"btn2":"已请假"
	},
	{
		"left":"上午&nbsp;&nbsp;20160608121&nbsp;&nbsp;张二大4&nbsp;&nbsp;Photoshop实训",
		"btn1":"未签到",
		"btn2":"已请假"
	},
	{
		"left":"上午&nbsp;&nbsp;20160608121&nbsp;&nbsp;张二大5&nbsp;&nbsp;Photoshop实训",
		"btn1":"未签到",
		"btn2":"已请假"
	},
	{
		"left":"上午&nbsp;&nbsp;20160608121&nbsp;&nbsp;张二大6&nbsp;&nbsp;Photoshop实训",
		"btn1":"未签到",
		"btn2":"已请假"
	}
	]
	var i=0
	getUlInfo.forEach(function(item){
		i++;
		$(".ul-content").append(
		"<li style='font-size:12px;background-color:#ddd'>"+item.left+"<span  style='float:right;cursor: pointer;color:green;' onclick='yes(event)'>"+item.btn2+"</span><span id='"+i+"' style='float:right;margin-right:20px;cursor: pointer;color:red;' onclick='no(event)'>"+item.btn1+"</span></li>"
	)
	})
	
	
}

function Watch(){
	var flag=$(".ul-content").css("display")
	if(flag=="none"){
		$(".ul-content").css({
		"display":"block"
		})
		$("#down").css({
		"display":"inline-block"
		})
		$(".fa").css({
			"display":"inline-block"
		})
		$("#right").css({
			"display":"none"
		})
	}
	if(flag=="block"){
		$(".ul-content").css({
		"display":"none"
		})
		$("#down").css({
			"display":"none"
		})
		$("#right").css({
			"display":"inline-block"
		})
	}
}

function no(event){
	$(event.target).css({
		"background-color":"black",
		"color":"white",
	})
}

function yes(event){
	
	$(event.target).parent().css({
		
		"display":"none"
	})
}



