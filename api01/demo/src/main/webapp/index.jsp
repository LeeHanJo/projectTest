<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>정보 입력</title>
</head>
<body>

<form action="/todo/list" method="get">
    이름 : <input type="text" name="name" size="15"><br>
    아이디 : <input type="text" name="id" size="15"><br>
    비밀번호 : <input type="password" name="password"><br>
    나이 : <input type="text" name="age"><br>

    성별 : <input type="radio" name="gender" value="true">남자
    <input type="radio" name="gender" value="false">여자<br>
    취미 : <input type="checkbox" name="hobbies" value="술먹기">술먹기
    <input type="checkbox" name="hobbies" value="잠자기">잠자기
    <input type="checkbox" name="hobbies" value="공부하기">공부하기<br>


    가고 싶은 여행지는?
    <select name="travel">
        <option>괌</option>
        <option>다낭</option>
        <option>나트랑</option>
        <option>코나키나발루</option>
        <option>대만</option>
    </select><br><br>

    <textarea rows="10" cols="50" name="content"></textarea><br>

    <input type="submit" value="회원가입">
    <input type="reset" value="다시쓰기">
</form>

</body>
</html>