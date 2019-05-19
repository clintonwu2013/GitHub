<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.*"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>網站後台頁面</title>
<style>
#show td{
	border: grey solid 1px;
	border-collapse:collapse;
	text-align:center;
}

#show {
	border: grey solid 1px;
	border-collapse:collapse;
	
}


form{
float:left;
}

#body{
width:1000px;
margin:auto;
margin-top:70px;
}
#left{
   width: 20%; 
  float:left;
/*   background-color: red; */

}
#right{

padding-left:25%;

}
#img{
 width:auto;
 height:150px;
 
}
#img2{
 width:auto;
 height:150px;
 
}

#content{
font-family: Microsoft JhengHei;
}
#content2{
font-family: Microsoft JhengHei;
}
#dialogform{
font-family: Microsoft JhengHei;
}

.place2 { background-color: #F8F8FF; }
.place2:hover, .place2.green2 { background-color: #FFEE99; }

.place { background-color: #FFEE99; }
.place:hover, .place.green { background-color: #F8F8FF; }
</style>

</head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.9.1.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet" href="http://jqueryui.com/resources/demos/style.css">

<script type="text/javascript">

$( document ).ready(function() {
	
// 	$("tr").on("click",function(){
// 		$(this).attr("background-color","red")
// 	})
	$(".place").click(function () {
   		$(this).toggleClass("green");
		});
		
	$(".place2").click(function () {
   		$(this).toggleClass("green2");
		});
	function taskDate(dateMilli) {
	    var d = (new Date(dateMilli) + '').split(' ');
	    d[2] = d[2] + ',';

	    return [d[0], d[1], d[2], d[3]].join(' ');
	}
	
	$(".buttonRight").on("click",function(){
		var updateActivityId = $(this).val();
		var content =  $(this).html();
// 		alert($(this).val())
// 		alert($(this).html())
		
		var Json = { 
			"aId": updateActivityId, 
			"permission": content
			};
		$.ajax({
			url: "/Final/updateActivity",
			type: "post",
			dataType: "json",
			data: Json,
			success: function(data){
					
					console.log(data);
					
					var begin = taskDate(new Date(data.beginTime));
					var end = taskDate(new Date(data.endTime));
					var attendLimitTime = taskDate(new Date(data.attendLimitTime));
					txt=
						"<b>發起人:</b>  " +data.email +"<br><br>"+
						"<b>活動編號:</b> "+ data.aid+"<br>"+
					    "<b>活動名稱:</b>  "+data.aname+"<br>"+
					    "<b>活動類型:</b> "+ data.atype+"<br>"+
					    "<b>活動時間:</b> "+begin+" ~ "+end+"<br>"+
					    "<b>活動地點:</b> "+data.address+"<br>"+
					    "<b>活動內容:</b> "+data.acontent+"<br><br>"+
					    		   
// 					    "<b>活動費用:</b> "+data.cost+"<br>"+
					    "<b>活動按讚數:</b> "+data.good+"<br>"+
					    "<b>活動參加人數:</b> "+data.accessPeople+"<br>"+
					    "<b>活動人數限制:</b> "+data.peopleUplimit+"<br>"+
					    "<b>活動報名截止:</b> "+attendLimitTime+"<br><br>"+
					    "<b>審核狀態:</b> "+data.permission+"<br>"+
// 					    '<button class="buttonRight" value="${data.aid}">通過</button>'+
// 					    '<button class="buttonRight" value="${data.aid}">不通過</button><br>'+
					    "<b>活動狀態:</b> "+data.status 
						
// 					    alert("test")
					    let aid = "#"+data.aid; 
					    $(aid).html(data.permission);
					        
					
					$( "#content" ).html(txt)

					 
					
			},
			error: function(){
				alert("ajax failed")
			}	
		})
		
		
	})
	
	
	
	$( ".buttonLeft" ).on( "click", function() {
    	var aId = $(this).html();
//     	var updateActivity = $(this).val();
    	
    	console.log( $(this).val())
 		console.log(aId);
    	
 		var path = "/Final/showImg/"+aId;
 		console.log(path)
 		$("#img").attr("src",path);
 		
 		
 		$.ajax({
			url: "/Final/activities/"+aId,
			type: "Get",
			success: function(data){
					
					console.log(data);
					var begin = taskDate(new Date(data.beginTime));
					var end = taskDate(new Date(data.endTime));
					var attendLimitTime = taskDate(new Date(data.attendLimitTime));
					txt=
						"<b>發起人:</b>  " +data.email +"<br><br>"+
						"<b>活動編號:</b> "+ data.aid+"<br>"+
					    "<b>活動名稱:</b>  "+data.aname+"<br>"+
					    "<b>活動類型:</b> "+ data.atype+"<br>"+
					    "<b>活動時間:</b> "+begin+" ~ "+end+"<br>"+
					    "<b>活動地點:</b> "+data.address+"<br>"+
					    "<b>活動內容:</b> "+data.acontent+"<br><br>"+
					    		   
// 					    "<b>活動費用:</b> "+data.cost+"<br>"+
					    "<b>活動按讚數:</b> "+data.good+"<br>"+
					    "<b>活動參加人數:</b> "+data.accessPeople+"<br>"+
					    "<b>活動人數限制:</b> "+data.peopleUplimit+"<br>"+
					    "<b>活動報名截止:</b> "+attendLimitTime+"<br><br>"+
					    "<b>審核狀態:</b> "+data.permission+"<br>"+
// 					    "<button class='buttonRight' value='${data.aid}'>通過</button>"+
// 					    '<button class="buttonRight" value="${data.aid}">不通過</button><br>'+
					    "<b>活動狀態:</b> "+data.status 
					
					    
					  
					
					$( "#content" ).html(txt)
					
			},
			error: function(){
				console.log("ajax failed")
			}	
		})
		
		
        $( "#dialog" ).dialog( "open" );
        
       
    });
	
	
	$( ".buttonLeft2" ).on( "click", function() {
    	var messageId = $(this).html();
 		alert(messageId);
//  		var path = "/Final/showMemberImg/"+messageId;
//  		alert(path)
 		$.ajax({
			url: "/Final/reports/"+messageId,
			type: "Get",
			success: function(data){
				console.log(data);
				var messageTime = taskDate(new Date(data.messageTime));
					txt = 
						"<b>被檢舉人帳號:</b>  "+data.email+ "<br>"+
						"<b>被檢舉人姓名:</b>  "+data.memberName+"<br><br>"+
						"<b>留言編號:</b>  "+data.messageId+"<br>"+
						"<b>留言時間:</b>  "+messageTime+"<br>"+
						"<b>被檢舉人留言:</b><br>  "+data.message+"<br>";
						
					console.log(data)	
					$( "#content2" ).html(txt)
					$( "#dialogActivityId" ).val(data.activityId);
					$( "#dialogActivityName" ).val(data.activityName);
// 					$( "#dialogEmail" ).val(data.email);
					
					$( "#dialogEmail" ).val(data.email);
					$( "#dialogName" ).val(data.memberName);
					$( "#dialogMessageNo" ).val(data.messageId);
					$( "#dialogMessageTime" ).val(data.messageTime);
					$( "#dialogMessageContent" ).val(data.message);
					

					var path = "/Final/"+data.email+"/showMemberImg";
					alert(path);
					$("#img2").attr("src",path);
					
					
			},
			error: function(){
				alert("ajax failed")
			}	
		})
 		
		
        $( "#dialog2" ).dialog( "open" );
        
       
    });
	
	
	$( ".dialogButton" ).on( "click", function() {
    	var violateType = $(this).html();
    	var memberEmail = $("#dialogEmail").val();
    	var memberName = $("#dialogName").val();
    	var messageNo = $("#dialogMessageNo").val();
    	var messageTime = $("#dialogMessageTime").val();
    	var messageContent = $("#dialogMessageContent").val();
    	var response = $("#dialogResponse").val();
    	var activityId = $("#dialogActivityId").val();
    	var activityName = $("#dialogActivityName").val();
    	//alert("aid="+activityId)
    	//alert("aname="+activityName)
//  		alert(violateType);
// 		alert(memberEmail);
// 		alert(memberName );
// 		alert(messageNo);
// 		alert(messageTime);
// 		alert(messageContent);
// 		alert(response);
		var Json = { 
			"activityId": activityId,
			"activityName": activityName,
			"violateType": violateType, 
			"memberEmail": memberEmail,
			"memberName": memberName,
			"messageNo": messageNo,
			"messageTime": messageTime,
			"messageContent": messageContent,
			"response": response
			};
		
		$.ajax({
			url: "/Final/reportsUpdate",
			type: "Post",
			dataType: "json",
			data: Json,
			success: function(data){
				alert("ok")	
					
			},
			error: function(){
				alert("ajax failed")
			}	
		})
		
 		$( "#dialog2" ).dialog( "open" );
        
       
    });
});



$( function() {
    $( "#dialog" ).dialog({
    	
    	maxWidth:6000,
        maxHeight: 5000,
        width: 430,
        height: 690,
        position: { my: "center", at: "left+290px top+300px ", of: window  } ,
      autoOpen: false,
      show: {
        effect: "blind",
        duration: 10
      },
      hide: {
        effect: "blind",
        duration: 10
      }
    });
    
$( "#dialog2" ).dialog({
    	
    	maxWidth:6000,
        maxHeight: 5000,
        width: 430,
        height: 600,
        position: { my: "center", at: "left+290px top+300px ", of: window  } ,
      autoOpen: false,
      show: {
        effect: "blind",
        duration: 10
      },
      hide: {
        effect: "blind",
        duration: 10
      }
    });
 
    
  } );


		
</script>
<body style="font-family: Microsoft JhengHei">

<div id="body">


<div id="left" >
<ul>
<li><a id="link1" href="<c:url value="/findMembers"></c:url>">管理網站會員</a>
<li><a id="link2" href="<c:url value="/findUnreviewed"></c:url>">管理未審核的活動</a>
<li><a id="link3" href="<c:url value="/findReports"></c:url>">管理檢舉</a>
</ul>

</div>





<div id="dialog" title="活動詳細資料" >
  <img id="img">
  <div id="content"></div>
</div>

<div id="dialog2" title="被檢舉人詳細資料" >
  <img id="img2">
  <div id="content2"></div>
  <br>
  <b>回覆被檢舉人:</b>
  <div id="dialogform">
  
		<textarea name="response" id="dialogResponse" rows="5" cols="30"></textarea>  
		<input type="hidden" name="activityId" id="dialogActivityId"  >
		<input type="hidden" name="activityName" id="dialogActivityName"  >
		<input type="hidden" name="email" id="dialogEmail"  >
		<input type="hidden" name="name" id="dialogName"  >
		<input type="hidden" name="messageNo" id="dialogMessageNo"  >
		<input type="hidden" name="messageTime" id="dialogMessageTime"  >
		<input type="hidden" name="messageContent" id="dialogMessageContent"  ></button>
		<button class="dialogButton">確認違規並送出</button>
		<button class="dialogButton">沒有違規</button>
		
		


					
			},
			error: function(){
				alert("ajax failed")
			}	
		})
		
		
	})
	
	
	
	$( ".buttonLeft" ).on( "click", function() {
    	var aId = $(this).html();
//     	var updateActivity = $(this).val();
    	
    	console.log( $(this).val())
 		console.log(aId);
    	
 		var path = "/Final/showImg/"+aId;
 		console.log(path)
 		$("#img").attr("src",path);
 		
 		
 		$.ajax({
			url: "/Final/activities/"+aId,
			type: "Get",
			success: function(data){
					
					console.log(data);
					var begin = taskDate(new Date(data.beginTime));
					var end = taskDate(new Date(data.endTime));
					var attendLimitTime = taskDate(new Date(data.attendLimitTime));
					txt=
						"<b>發起人:</b>  " +data.email +"<br><br>"+
						"<b>活動編號:</b> "+ data.aid+"<br>"+
					    "<b>活動名稱:</b>  "+data.aname+"<br>"+
					    "<b>活動類型:</b> "+ data.atype+"<br>"+
					    "<b>活動時間:</b> "+begin+" ~ "+end+"<br>"+
					    "<b>活動地點:</b> "+data.address+"<br>"+
					    "<b>活動內容:</b> "+data.acontent+"<br><br>"+
					    		   
// 					    "<b>活動費用:</b> "+data.cost+"<br>"+
					    "<b>活動按讚數:</b> "+data.good+"<br>"+
					    "<b>活動參加人數:</b> "+data.accessPeople+"<br>"+
					    "<b>活動人數限制:</b> "+data.peopleUplimit+"<br>"+
					    "<b>活動報名截止:</b> "+attendLimitTime+"<br><br>"+
					    "<b>審核狀態:</b> "+data.permission+"<br>"+
// 					    "<button class='buttonRight' value='${data.aid}'>通過</button>"+
// 					    '<button class="buttonRight" value="${data.aid}">不通過</button><br>'+
					    "<b>活動狀態:</b> "+data.status 
					
					    
					  
					
					$( "#content" ).html(txt)
					
			},
			error: function(){
				console.log("ajax failed")
			}	
		})
		
		
        $( "#dialog" ).dialog( "open" );
        
       
    });
	
	
	$( ".buttonLeft2" ).on( "click", function() {
    	var messageId = $(this).html();
 		alert(messageId);
    	
//  		var path = "/Final/showMemberImg/"+messageId;
//  		alert(path)
 		
 		
 		$.ajax({
			url: "/Final/reports/"+messageId,
			type: "Get",
			success: function(data){
				console.log(data);
				var messageTime = taskDate(new Date(data.messageTime));
					txt = 
						"<b>被檢舉人帳號:</b>  "+data.email+ "<br>"+
						"<b>被檢舉人姓名:</b>  "+data.memberName+"<br><br>"+
						"<b>留言編號:</b>  "+data.messageId+"<br>"+
						"<b>留言時間:</b>  "+messageTime+"<br>"+
						"<b>被檢舉人留言:</b><br>  "+data.message+"<br>";
					$( "#content2" ).html(txt)
					
					var path = "/Final/"+data.email+"/showMemberImg";
					alert(path);
					$("#img2").attr("src",path);
			},
			error: function(){
				alert("ajax failed")
			}	
		})
 		
		
        $( "#dialog2" ).dialog( "open" );
        
       
    });
});



$( function() {
    $( "#dialog" ).dialog({
    	
    	maxWidth:6000,
        maxHeight: 5000,
        width: 430,
        height: 690,
        position: { my: "center", at: "left+290px top+300px ", of: window  } ,
      autoOpen: false,
      show: {
        effect: "blind",
        duration: 10
      },
      hide: {
        effect: "blind",
        duration: 10
      }
    });
    
$( "#dialog2" ).dialog({
    	
    	maxWidth:6000,
        maxHeight: 5000,
        width: 430,
        height: 600,
        position: { my: "center", at: "left+290px top+300px ", of: window  } ,
      autoOpen: false,
      show: {
        effect: "blind",
        duration: 10
      },
      hide: {
        effect: "blind",
        duration: 10
      }
    });
 
    
  } );


		
</script>
<body style="font-family: Microsoft JhengHei">

<div id="body">


<div id="left" >
<ul>
<li><a id="link1" href="<c:url value="/findMembers"></c:url>">管理網站會員</a>
<li><a id="link2" href="<c:url value="/findUnreviewed"></c:url>">管理未審核的活動</a>
<li><a id="link3" href="<c:url value="/findReports"></c:url>">管理檢舉</a>
</ul>

</div>





<div id="dialog" title="活動詳細資料" >
  <img id="img">
  <div id="content"></div>
</div>

<div id="dialog2" title="被檢舉人詳細資料" >
  <img id="img2">
  <div id="content2"></div>
  <br>
  <div id="dialogform">
  <b>回覆被檢舉人:</b>
  
  
  <form action="">
		<textarea rows="5" cols="30"></textarea>  
		<button>確認違規並送出</button> 
		<button>沒有違規</button>
  </form>

					 
					
			},
			error: function(){
				alert("ajax failed")
			}	
		})
		
		
	})
	
	
	
	$( ".buttonLeft" ).on( "click", function() {
    	var aId = $(this).html();
//     	var updateActivity = $(this).val();
    	
    	console.log( $(this).val())
 		console.log(aId);
    	
 		var path = "/Final/showImg/"+aId;
 		console.log(path)
 		$("#img").attr("src",path);
 		
 		
 		$.ajax({
			url: "/Final/activities/"+aId,
			type: "Get",
			success: function(data){
					
					console.log(data);
					var begin = taskDate(new Date(data.beginTime));
					var end = taskDate(new Date(data.endTime));
					var attendLimitTime = taskDate(new Date(data.attendLimitTime));
					txt=
						"<b>發起人:</b>  " +data.email +"<br><br>"+
						"<b>活動編號:</b> "+ data.aid+"<br>"+
					    "<b>活動名稱:</b>  "+data.aname+"<br>"+
					    "<b>活動類型:</b> "+ data.atype+"<br>"+
					    "<b>活動時間:</b> "+begin+" ~ "+end+"<br>"+
					    "<b>活動地點:</b> "+data.address+"<br>"+
					    "<b>活動內容:</b> "+data.acontent+"<br><br>"+
					    		   
// 					    "<b>活動費用:</b> "+data.cost+"<br>"+
					    "<b>活動按讚數:</b> "+data.good+"<br>"+
					    "<b>活動參加人數:</b> "+data.accessPeople+"<br>"+
					    "<b>活動人數限制:</b> "+data.peopleUplimit+"<br>"+
					    "<b>活動報名截止:</b> "+attendLimitTime+"<br><br>"+
					    "<b>審核狀態:</b> "+data.permission+"<br>"+
// 					    "<button class='buttonRight' value='${data.aid}'>通過</button>"+
// 					    '<button class="buttonRight" value="${data.aid}">不通過</button><br>'+
					    "<b>活動狀態:</b> "+data.status 
					
					    
					  
					
					$( "#content" ).html(txt)
					
			},
			error: function(){
				console.log("ajax failed")
			}	
		})
		
		
        $( "#dialog" ).dialog( "open" );
        
       
    });
	
	
	$( ".buttonLeft2" ).on( "click", function() {
    	var messageId = $(this).html();
 		alert(messageId);
//  		var path = "/Final/showMemberImg/"+messageId;
//  		alert(path)
 		$.ajax({
			url: "/Final/reports/"+messageId,
			type: "Get",
			success: function(data){
				console.log(data);
				var messageTime = taskDate(new Date(data.messageTime));
					txt = 
						"<b>被檢舉人帳號:</b>  "+data.email+ "<br>"+
						"<b>被檢舉人姓名:</b>  "+data.memberName+"<br><br>"+
						"<b>留言編號:</b>  "+data.messageId+"<br>"+
						"<b>留言時間:</b>  "+messageTime+"<br>"+
						"<b>被檢舉人留言:</b><br>  "+data.message+"<br>";
						
					console.log(data)	
					$( "#content2" ).html(txt)
					$( "#dialogActivityId" ).val(data.activityId);
					$( "#dialogActivityName" ).val(data.activityName);
// 					$( "#dialogEmail" ).val(data.email);
					
					$( "#dialogEmail" ).val(data.email);
					$( "#dialogName" ).val(data.memberName);
					$( "#dialogMessageNo" ).val(data.messageId);
					$( "#dialogMessageTime" ).val(data.messageTime);
					$( "#dialogMessageContent" ).val(data.message);
					

					var path = "/Final/"+data.email+"/showMemberImg";
					alert(path);
					$("#img2").attr("src",path);
					
					
			},
			error: function(){
				alert("ajax failed")
			}	
		})
 		
		
        $( "#dialog2" ).dialog( "open" );
        
       
    });
	
	
	$( ".dialogButton" ).on( "click", function() {
    	var violateType = $(this).html();
    	var memberEmail = $("#dialogEmail").val();
    	var memberName = $("#dialogName").val();
    	var messageNo = $("#dialogMessageNo").val();
    	var messageTime = $("#dialogMessageTime").val();
    	var messageContent = $("#dialogMessageContent").val();
    	var response = $("#dialogResponse").val();
    	var activityId = $("#dialogActivityId").val();
    	var activityName = $("#dialogActivityName").val();
    	//alert("aid="+activityId)
    	//alert("aname="+activityName)
//  		alert(violateType);
// 		alert(memberEmail);
// 		alert(memberName );
// 		alert(messageNo);
// 		alert(messageTime);
// 		alert(messageContent);
// 		alert(response);
		var Json = { 
			"activityId": activityId,
			"activityName": activityName,
			"violateType": violateType, 
			"memberEmail": memberEmail,
			"memberName": memberName,
			"messageNo": messageNo,
			"messageTime": messageTime,
			"messageContent": messageContent,
			"response": response
			};
		
		$.ajax({
			url: "/Final/reportsUpdate",
			type: "Post",
			dataType: "json",
			data: Json,
			success: function(data){
				alert("ok")	
					
			},
			error: function(){
				alert("ajax failed")
			}	
		})
		
 		$( "#dialog2" ).dialog( "open" );
        
       
    });
});



$( function() {
    $( "#dialog" ).dialog({
    	
    	maxWidth:6000,
        maxHeight: 5000,
        width: 430,
        height: 690,
        position: { my: "center", at: "left+290px top+300px ", of: window  } ,
      autoOpen: false,
      show: {
        effect: "blind",
        duration: 10
      },
      hide: {
        effect: "blind",
        duration: 10
      }
    });
    
$( "#dialog2" ).dialog({
    	
    	maxWidth:6000,
        maxHeight: 5000,
        width: 430,
        height: 600,
        position: { my: "center", at: "left+290px top+300px ", of: window  } ,
      autoOpen: false,
      show: {
        effect: "blind",
        duration: 10
      },
      hide: {
        effect: "blind",
        duration: 10
      }
    });
 
    
  } );


		
</script>
<body style="font-family: Microsoft JhengHei">

<div id="body">


<div id="left" >
<ul>
<li><a id="link1" href="<c:url value="/findMembers"></c:url>">管理網站會員</a>
<li><a id="link2" href="<c:url value="/findUnreviewed"></c:url>">管理未審核的活動</a>
<li><a id="link3" href="<c:url value="/findReports"></c:url>">管理檢舉</a>
</ul>

</div>





<div id="dialog" title="活動詳細資料" >
  <img id="img">
  <div id="content"></div>
</div>

<div id="dialog2" title="被檢舉人詳細資料" >
  <img id="img2">
  <div id="content2"></div>
  <br>
  <b>回覆被檢舉人:</b>
  <div id="dialogform">
  
		<textarea name="response" id="dialogResponse" rows="5" cols="30"></textarea>  
		<input type="hidden" name="activityId" id="dialogActivityId"  >
		<input type="hidden" name="activityName" id="dialogActivityName"  >
		<input type="hidden" name="email" id="dialogEmail"  >
		<input type="hidden" name="name" id="dialogName"  >
		<input type="hidden" name="messageNo" id="dialogMessageNo"  >
		<input type="hidden" name="messageTime" id="dialogMessageTime"  >
		<input type="hidden" name="messageContent" id="dialogMessageContent"  ></button>
		<button class="dialogButton">確認違規並送出</button>
		<button class="dialogButton">沒有違規</button>
		
		


  </div>
  
</div>

<div id="right">


<!-- 檢舉內容 -->
<c:if test="${not empty reports }">
<table id="show">

<tr>
<td>被檢舉的留言編號</td>
<td>被檢舉人</td>
<td>檢舉人</td>
<td>檢舉類型</td>
<td>檢舉內容</td>
<td>檢舉時間</td>
<td>處理狀態</td>
<!-- <td>審核</td> -->
</tr>

<c:forEach var="report" items="${reports }">
<tr class="place" OnClick="this.style.background='#F8F8FF'">
<td>
<button class="buttonLeft2">${report.activityMessage.messageId}</button>
</td>
<td>${report.memberByReportedEmail.email}</td>
<td>${report.memberByReportEmail.email}</td>

<td>${report.type}</td>
<td>${report.content }</td>
<td>${report.reportTime}</td>
<td id="${report.reportId }">${report.status}</td>
<!-- <td> -->
<%-- <button class="buttonRight2" value="${report.reportId}">違規</button> --%>
<%-- <button class="buttonRight2" value="${report.reportId}">沒有違規</button> --%>
<!-- </td> -->
</tr>
</c:forEach>
</table>
</c:if>


<!-- 待審核活動 -->
<c:if test="${not empty unreviewedActivities }">
<table id="show">
<tr>
<td>活動編號</td>
<td>活動名稱</td>
<td>活動類型</td>
<td>主辦人</td>
<td>活動狀態</td>
<td>活動審核狀態</td>
<td>審核</td>

<!-- <td>檢視詳細內容</td> -->
<!-- <td>照片</td> -->
</tr>
<c:forEach var="unreviewedActivity" items="${unreviewedActivities }">
<tr class="place" OnClick="this.style.background='#F8F8FF'" >
<td>

<button class="buttonLeft">${unreviewedActivity.aid }</button>
</td>
<td>${unreviewedActivity.aname}</td>
<td>${unreviewedActivity.atype}</td>
<td>${unreviewedActivity.member.email}</td>


<td><div >${unreviewedActivity.status}</div></td>
<%-- <td>${unreviewedActivity.permission}</td> --%>
<td id="${unreviewedActivity.aid }">
${unreviewedActivity.permission}
<%-- <button class="buttonRight" value="${unreviewedActivity.aid}">待審核</button> --%>
</td>
<td>
<button class="buttonRight" value="${unreviewedActivity.aid}">通過</button>
<button class="buttonRight" value="${unreviewedActivity.aid}">不通過</button>
</td>

</tr>
</c:forEach>
</table>
</c:if>








<!-- 全部會員資料 -->
<c:if test="${not empty members }">

<table id="show">
<tr>
<!-- <td>會員編號</td> -->
<td>姓名</td>
<td>帳號</td>
<td>認證狀態</td>
<td>權限</td>
<td>違規次數</td>
<td>停權時間</td>
<!-- <td>照片</td> -->
</tr>
<c:forEach var="member"   items="${members}"  >

<tr class="place2" OnClick="this.style.background='#FFEE99'">
<%-- <td>${member.mno}</td> --%>
<td>${member.mname}</td>
<td>${member.email}</td>
<td>${member.identify}</td>

<td>
<c:if test="${member.permission=='普通會員'}">
<form  action="<c:url value="/updatePermission"></c:url>" method="post">
<input type="hidden" name="email" value="${member.email}">
<input type="hidden" name="permission" value="普通會員">
<input type="submit" style="color:red" value="普通會員">
</form>

<form  action="<c:url value="/updatePermission"></c:url>" method="post">
<input type="hidden" name="email" value="${member.email}">
<input type="hidden" name="permission" value="管理員">
<input type="submit" style="color:white" value="管理員">
</form>
</c:if>



<c:if test="${member.permission=='管理員'}">
<form action="<c:url value="/updatePermission"></c:url>" method="post">
<input type="hidden" name="email" value="${member.email}">
<input type="hidden" name="permission" value="普通會員">
<input OnClick="this.style.background='#FFEE99'" type="submit" style="color:white" value="普通會員">
</form>

<form  action="<c:url value="/updatePermission"></c:url>" method="post">
<input type="hidden" name="email" value="${member.email}">
<input type="hidden" name="permission" value="管理員">
<input OnClick="this.style.background='#FFEE99'" type="submit" style="color:red" value="管理員">
</form>
</c:if>
</td>

<td>${member.vcount}</td>
<td>${member.vtime}</td>
<%-- <td>${member.photo}</td> --%>

</tr>
</c:forEach>

</table>

</c:if>

</div>



</div>
</body>
</html>