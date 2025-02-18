<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="./template/boot_css.jsp"></c:import>:
</head>
<body>

<c:import url="./template/layout_header.jsp"></c:import>

<div class="container-fluid my- 5">
	<div class = "row col-md-8 offset-md-2">
		<div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/resources/images/c1.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/resources/images/c2.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/resources/images/c3.jpg." class="d-block w-100" alt="...">
    </div>
  </div>
</div>
	
	</div>
</div>
<div class="container">

</div>

<c:import url="./template/layout_footer.jsp"></c:import>:
<c:import url="./template/boot_js.jsp"></c:import>:
</body>
</html>