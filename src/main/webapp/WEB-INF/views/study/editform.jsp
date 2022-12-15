<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@page import="com.example.study.StudyDAO, com.example.study.StudyVO"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<form:form modelAttribute = "studyVO" method="POST" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr><td>중요도:</td><td>
			<select id="importance" name="importance">
				<option value="상">상</option>
				<option value="중">중</option>
				<option value="하">하</option>
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
			<input type="checkbox" id="done" name="done" value="Done">
			<label for="Done">완료</label><br>
			<input type="checkbox" id="Nope" name="done" value="Nope">
			<label for="Nope">미완료</label><br>
		</td></tr>
	</table>
	<input type="submit" value="수정하기"/>
	<input type="button" value="취소하기" onclick="history.back()"/>

</form:form>

</body>
</html>