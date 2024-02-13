<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-01-16
  Time: 오후 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <title>Todo List</title>
</head>
<body>

<h2>회원가입 결과</h2>

<p>이름: ${param.name}</p>
<p>아이디: ${param.id}</p>
<p>비밀번호: ${param.password}</p>
<p>나이: ${param.age}</p>
<p>성별: ${param.gender == 'true' ? '남자' : '여자'}</p>
<p>취미: <c:forEach var="hobby" items="${paramValues.hobbies}">
    ${hobby}&nbsp;
</c:forEach></p>
<p>가고 싶은 여행지: ${param.travel}</p>
<p>내용: ${param.content}</p>

</body>
</html>
