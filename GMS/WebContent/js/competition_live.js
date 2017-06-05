$(function(){
	var compRequest=function(curl){
		$.ajax({
			url:curl,
			type:"POST",
			data:{
				ci:$("#ci").val()
			},
			success:function(data){
				if(data==="1"){
					location.reload();
				}
				else if(data=="0"){
					$(".operation-tips").html("出错啦！");
				}
				else{
					$(".operation-tips").html("没有操作权限！");
				}
				$(".show-tips-btn").click();
			}
		});
	};
	$(".start-btn").click(function(){
		compRequest("startCompetition.action");
	});
	$(".end-btn").click(function(){
		compRequest("endCompetition.action");
	});
	var scoreRequest=function(surl,id){
		$.ajax({
			url:surl,
			type:"POST",
			data:{
				competitionResultId:id
			},
			success:function(data){
				if(data==="1"){
					location.reload();
				}
				else if(data=="0"){
					$(".operation-tips").html("出错啦！");
				}
				else{
					$(".operation-tips").html("没有操作权限！");
				}
				$(".show-tips-btn").click();
			}
		});
	};
	$(".left-add").click(function(){
		scoreRequest("addOneScore.action",$("#left-comp").val());
	});
	$(".left-sub").click(function(){
		scoreRequest("subOneScore.action",$("#left-comp").val());
	});
	$(".right-add").click(function(){
		scoreRequest("addOneScore.action",$("#right-comp").val());
	});
	$(".right-sub").click(function(){
		scoreRequest("subOneScore.action",$("#right-comp").val());
	});
	var updateScores=function(id,obj){
		$.ajax({
			url:"getScores.action",
			type:"POST",
			data:{
				competitionResultId:id
			},
			success:function(data){
				if(data!="0"){
					obj.html(data);
				}
			}
		});
	}
	setInterval(function(){
		updateScores($("#left-comp").val(),$(".left-scores"));
		updateScores($("#right-comp").val(),$(".right-scores"));
	},10000);
	$(".show-comments-btn").click();
});
