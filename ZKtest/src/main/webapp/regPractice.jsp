<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<body>
<input id="identityNo" type="text">
<button id="btn">regular exp</button>
<button id="btn2">手動檢查</button>
</body>

<script type="text/javascript">
$("#btn").click(function(){
	var idNo = $("#identityNo").val();
	const re = /^([A-Z]|[a-z]){1}[1-2]{1}[0-9]{8}$/;
	re.test(idNo);
	if(re.test(idNo)){
		alert('ok')
	}else{
		alert('no!!')
	}
	
})

$("#btn2").click(function(){
	var idNo = $("#identityNo").val();
	
	
	if(!checkId(idNo)){
		alert('身分證格式錯誤');
	}else{
		alert('ok');
	}
	
	
})
function checkId(idNo){
	
	if(idNo.substring(0,1)>'Z' || idNo.substring(0,1)<'A'){
		return false;
	}else if(idNo.substring(1,2)!='1'&& idNo.substring(1,2)!='2'){
		return false;
	}else if(idNo.trim().length!=10){
		return false;
	}
	for(let i=2; i<idNo.length; i++){
		if(idNo.substring(i,i+1)>'9'|| idNo.substring(i,i+1)<'0'){
			return false;			
		}
	}
	return true;
	
}
</script>
</html>