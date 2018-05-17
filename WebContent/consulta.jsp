<%@ page import ="entidade.Aluno" %>
<%@ page import ="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Consulta de Alunos</h3>
	<hr>
	<a href="index.jsp">Inicial</a>
	&nbsp;|&nbsp;
	<a href="cadastro.jsp">Cadastro</a>
	&nbsp;|&nbsp;
	
	<a href="ControleAluno">Consulta</a>
	&nbsp;&nbsp;
</body>

<%							 
	List<Aluno> listaAluno = (List<Aluno>)request.getAttribute("alunos");
	for(Aluno a : listaAluno) {
%>

	<ul>
		<li><%= a.toString() %></li>
	</ul>

<% } %>


</html>