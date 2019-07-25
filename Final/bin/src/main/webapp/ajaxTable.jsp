<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title</title>
<!-- Jquery In Here -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script> 
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<form enctype="multipart/form-data" id="resume_frm"
		style="width: 400px;">
		<div class="form-group has-success">
			<label class="control-label" for="inputSuccess">姓名:</label> <input
				type="text" class="form-control" id="inputSuccess" name="name">
		</div>
		<div class="form-group has-success">
			<label class="control-label" for="inputSuccess">聯絡方式:</label> <input
				type="text" class="form-control" id="inputSuccess" name="phone">
		</div>
		<span class="btn btn-success fileinput-button"
			style="margin-bottom: 20px;"> <i
			class="glyphicon glyphicon-plus"></i> <span>上傳簡歷:</span> <input
			id="fileupload" type="file" name="file" multiple>
		</span>
		<button type="button" class="btn btn-primary btn-lg btn-block">提交</button>
	</form>
	
	<div style="display:none" id="info">
		
	</div>

<!-- <div>Users:</div> -->
<!--   <ul> -->
<!--     <li>John</li> -->
<!--     <li>Pete</li> -->
<!--   </ul> -->
  
</body>
</html>
<script type="text/javascript">

// 	window.onload=function(){
// 		alert(document.body.children[0]);
// 		alert(document.body.children[1].firstChildNode);
// 		alert( document.body.parentNode === document.documentElement ); // true

// 		  // after <head> goes <body>
// 		  alert( document.head.nextSibling );
// 	for (let node of document.body.children) {
// 		  alert(node); // shows all nodes from the collection
// 		}
// 	}
	$(function() {
		$(".btn-block").click(function() {
			$("#resume_frm").ajaxSubmit({
				type : "post",
				url : "/Final/recruit/addRecruitInformation",
				dataType : "json",
				success : function(data) {
					//墨綠深藍風
// 					layer.alert('提交成功,請耐心等候,我們會在一個工作日內回覆您!');//end layer
					alert('提交成功,請耐心等候,我們會在一個工作日內回覆您!');
					$("#resume_frm").remove();
					for(let i=0; i<data.length; i++){
						$('#info').html('名子:'+data[i].name+'<br>聯絡方式:'+data[i].phone+'<br>');
					}
					
					$('#info').show();
				}//end success
			});//end ajaxSubmit
		});//end click
	});
</script>
