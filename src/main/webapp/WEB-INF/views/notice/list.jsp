<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
		<!-- contents 내용 작성 -->
		<h1>Notice List Page</h1>
		<form action="/notice/list" method="post"></form>
	
		<table class="table table-striped">
			<thead>
				<tr>
					<th>NO</th>
					<th>TITLE</th>
					<th>WRITER</th>
						<th>DATE</th>
							<th>HIT</th>
								
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="v">
				<tr>
					<td>${v.boardNum}</td>
					<td><a href="./detail?boardNum=${v.boardNum}">${v.boardName}</a></td>
					<td>${v.userName}</td>
					<td>${v.boardDate}</td>
					<td>${v.boardHit}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="./add" class="btn btn-outline-success">글 작성</a>
	</div>
</div>

<c:import url="/WEB-INF/views/template/layout_footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/boot_js.jsp"></c:import>
</body>
</html>