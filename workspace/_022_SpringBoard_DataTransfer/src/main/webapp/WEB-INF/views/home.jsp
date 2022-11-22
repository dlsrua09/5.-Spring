<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>
<%-- pageEncoding="UTF-8"은 글자를 읽게해줌 --%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<!-- method="get"은 입력값이 다 보임, post는 입력값이 안보임, 그래서 대부분 post -->
<form action="insertName.do" method="post">
 <!-- name값은 key값 -->
	<input name="firstName">
	<input name="lastName">
	<input name="job">
	<input name="age">
	<button>db저장</button>
</form>

<p>${hello } </p>
<c:forEach var="num" items="${list }" varStatus="status">
	<p>${num}, ${status.index }, ${status.count } </p>
</c:forEach>
<a href="getNameList.do">이름목록으로 이동</a>
</body>
</html>
