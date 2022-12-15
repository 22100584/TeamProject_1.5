<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
    <table id ="edit">
        <tr><td>중요도:</td><td>
            <select id="importance" name="importance">
            <option value="1">상</option>
            <option value="2">중</option>
            <option value="3">하</option>
        </select>
        </td></tr>
        <tr><td>분반:</td><td>
            <input type="radio" id='01' name="cl" value="1분반">
            <label for="01">1분반</label><br>
            <input type="radio" id='02' name="cl" value="2분반">
            <label for="02">2분반</label><br>
        </td></tr>
        <tr><td>강의명:</td><td><input type="text" name="lecture"/></td></tr>
        <tr><td>교수님 성함:</td><td><input type="text" name="p_name"/></td></tr>
        <tr><td>학번:</td><td><input type="text" name="sid"/></td></tr>
        <tr><td>질문내용:</td><td><textarea cols="50" rows="5" name="question"></textarea></td></tr>
        <tr><td>해결여부:</td><td>
            <input type="checkbox" id="done" name="done" value="done">
            <label for="done">완료</label><br>
            <input type="checkbox" id="Nope" name="done" value="Nope">
            <label for="Nope">미완료</label><br>

        </td></tr>
    </table>
    <button type = "button" onclick="location.href='list'">목록보기</button>
    <button type = "submit">등록하기</button>
</form>

</body>
</html>