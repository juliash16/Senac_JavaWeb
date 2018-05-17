<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Alunos</title>
</head>
<body>

	<h3>Cadastro de Alunos</h3>
	<hr>
	<a href="index.jsp">Inicial</a>
	&nbsp;&nbsp;
	<a href="cadastro.jsp">Cadastro</a>
	&nbsp;&nbsp;
	
	<a href="ControleAluno">Consulta</a>
	&nbsp;&nbsp;
	
	
	<form action="ControleAluno" method="post">
		Nome:<br/>
		<input type="text" name="nome" size="30"/>
		<br/><br/>
		Email:<br/>
		<input type="text" name="email" size="30"/>
		<br/><br/>
		Data de Nascimento:<br/>
		<input type="text" name="nascimento" size="30"/>
		<br/><br/>
		Rua:<br/>
		<input type="text" name="rua" size="30"/>
		<br/><br/>
		Bairro:<br/>
		<input type="text" name="bairro" size="30"/>
		<br/><br/>
		Cidade:<br/>
		<input type="text" name="cidade" size="30"/>
		<br/><br/>
		CEP:<br/>
		<input type="text" name="cep" size="30"/>
		<br/><br/>
		<input type="submit" value="CADASTRAR">
		<input type="reset" value="Limpar os Campos">
	</form>
	
	
</body>
</html>