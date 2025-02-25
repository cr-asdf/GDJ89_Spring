<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/template/boot_css.jsp"></c:import>
</head>
<body>
<c:import url="/WEB-INF/views/template/layout_header.jsp"></c:import>

<div class="continer-fluid my-5">
	<div class="row col-md-8 offset-md-2">
<h1> login</h1>
	<form action="./login" method="post">
		  <div class="mb-3">
		    <label for="userName" class="form-label">회원ID</label>
		    <input type="text" name="userName" placeholder="회원명 입력" class="form-control" id="userName">
		  </div>

		  <div class="mb-3">
		    <label for="" class="form-label">비밀번호</label>
		    <input type="text" name="password" placeholder="" class="비밀번호 입력" id="password">
		  </div>	

		 
			 <button type="submit" class="btn btn-primary">로그인</button>
			 
			 	</form>	
	</div>
</div>

<c:import url="/WEB-INF/views/template/layout_footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/boot_js.jsp"></c:import>
</div>
</header>