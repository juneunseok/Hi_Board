<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/popper.min.js"></script>
<link rel="stylesheet" href="/css/hclass.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript" src="/js/jquery.min.js"></script>
<style>

</style>
<script type="text/javascript">
	$(function(){
		$('#reset').click(function(){
			$('#id').val('');
			$('#pw').val('');
		});
		$('#submit').click(function(){
			var sid = $('#id').val();
			if(!sid || sid.indexOf(' ') != -1){
				alert('잘못된 아이디입니다.');
				$('#id').val('');
				return;
			}
			var spw = $('#pw').val();
			if(!spw || spw.indexOf(' ') != -1){
				alert('비밀번호형식이 잘못되었습니다.');
				$('#pw').val('');
				return;
			}
			
			$('#frm').attr('action', '../member/Login.class');
			$('#frm').submit();
		});
	});
</script>
</head>
<body>
	<div class="row">
		<!-- <div class="col-md-3 text-white"></div> -->
		<div class="col-sm-12 col-md-6 mr-auto ml-auto">
			<div class="card shadow col-sm-12 col-md-12 bg-warning text-white tp20">
				<div class="card-text">
					<h2 class="text-center font-weight-bold">Main Page</h2>
				</div>
			</div>
			<form method="POST" id="frm" class="container col-sm-12 col-md-12 card shadow mt-3">
				<div class="input-group mt-4">
					<div class="input-group-prepend">
		 				<span class="input-group-text"><i class="fa fa-user"></i></span>
					</div>
					<input id="id" type="text" class="form-control" name="id" placeholder="아이디를 입력하세요!">
				</div>
				<div class="input-group mt-3 mb-4">
					<div class="input-group-prepend card-text">
						<span class="input-group-text"><i class="fa fa-lock"></i></span>
					</div>
					<input id="pw" type="password" class="form-control" name="pw" placeholder="Password">
				</div>
				
			</form>
	 		<div class="card-text shadow btn-group col-sm-12 col-md-12 mt-3 lrzero">
	 			<div class="col-sm-12 col-md-6 btn btn-primary" id="reset">Reset</div>	
	 			<div class="col-sm-12 col-md-6 btn btn-danger" id="submit">Login</div>	
	 		</div>
		</div>
	</div>
</body>
</html>