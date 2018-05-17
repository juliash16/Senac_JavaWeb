<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Clientes</title>
</head>
<body>

	<h3>Cadastro de Clientes</h3>
	<hr>
	<a href="index.jsp">Inicial</a>
	&nbsp;&nbsp;
	<a href="cadastro.jsp">Cadastro</a>
	&nbsp;&nbsp;
	
	<a href="ControleCliente">Consulta</a>
	&nbsp;&nbsp;
	
	
	<form action="ControleCliente" method="post">
		Nome:<br/>
		<input type="text" name="nome" size="30"/>
		<br/><br/>
		Email:<br/>
		<input type="text" name="email" size="30"/>
		<br/><br/>
		Sexo:<br/>
		<input type="radio" name="sexo" value="feminino" checked/>Feminino
		<input type="radio" name="sexo" value="masculino"/>Masculino
		<br/><br/>
		Estado Civil:<br/>
		<select name="estadocivil">
			<option value="">Selecione</option>	
			<option value="solteiro">Solteiro</option>	
			<option value="casado">Casado</option>	
			<option value="divorciado">Divorciado</option>	
			<option value="viuvo">Viuvo</option>	
		</select>
		<br/><br/>
		<input type="submit" value="CADASTRAR">
		<input type="reset" value="Limpar os Campos">
	</form>
	
	
</body>
</html>