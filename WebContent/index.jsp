<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>P�gina Inicial</title>
</head>
<body>

	<!-- jsp s�o paginas
	servlet camada de controle
 	JBDC � o banco de dados -->
	<h3>Aplica��o em JSP e Servlet com JBDC</h3>
	<hr>
	<a href="cadastro.jsp">Cadastro de Cliente</a>
	<br/>
	<a href="ControleCliente">Consulta Cliente</a>
	<br/>
	
	<%
	// request.getAtribute() - retorna um object
	
	String mensagem = (String) request.getAttribute("mensagem");
	if(mensagem != null){
		out.println(mensagem);
	}
	
	
	%>
	
</body>
</html>