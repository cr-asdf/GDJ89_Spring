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
<h1> User Join</h1>
	<form action="./join" method="post">
		  <div class="mb-3">
		    <label for="userName" class="form-label">회원ID</label>
		    <input type="text" name="userName" placeholder="회원명 입력" class="form-control" id="userName">
		  </div>

		  <div class="mb-3">
		    <label for="" class="form-label">비밀번호</label>
		    <input type="text" name="password" placeholder="" class="form-control" id="password">
		  </div>	

		  <div class="mb-3">
		    <label for="name" class="form-label">이름</label>
		    <input type="text" name="name" class="form-control" id="name">
		  </div>	
		  
		  <div class="mb-3">
		    <label for="phone" class="form-label">전화번호</label>
		    <input type="text" name="phone" class="form-control" id="phone">
			</div>

		  <div class="mb-3">
		    <label for="email" class="form-label">이메일</label>
		    <input type="text" name="email" class="form-control" id="email">
		  </div>	
		  

		  <button type="submit" class="btn btn-primary">회원가입</button>
		</form>	
	</div>
</div>

<c:import url="/WEB-INF/views/template/layout_footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/boot_js.jsp"></c:import>
</body>
</html>


