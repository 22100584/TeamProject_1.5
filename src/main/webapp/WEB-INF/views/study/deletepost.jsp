<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@page import="com.example.study.StudyDAO, com.example.study.StudyVO"%>
<%
	String sid = request.getParameter("id");
	if (sid != "") {
		int id = Integer.parseInt(sid);

		StudyDAO studyDAO = new StudyDAO();
		StudyVO u = new StudyVO();
		u.setSeq(id);
		studyDAO.deleteStudy(id);
		response.sendRedirect("list");
	}
%>