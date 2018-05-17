<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
<link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container">
	<h2>Cadastro de Aluno</h2>
	<br/>
	<a href="index.jsp">Inicial</a>&nbsp;|&nbsp;
	<a href="cadastro.jsp">Cadastro</a>&nbsp;|&nbsp;
	<a href="ControleAluno">Consulta</a>&nbsp;|&nbsp;
	<br>
	<!-- Expression Language EL  -->
	${msg}
	<form action="ControleAluno" method="post" class="form-group">
		Nome:<br/>
		<input type="text" name="nome" class="form-control"/><br/><br/>
		E-mail:<br/>
		<input type="text" name="email" class="form-control"/><br/><br/>
		Data de Nascimento:<br/>
		<input type="text" name="nascimento" class="form-control"/><br/><br/>
		
		<h2>Informe o endereco do aluno</h2>
		Rua:<br/>
		<input type="text" name="rua" class="form-control"/><br/><br/>
		Bairro:<br/>
		<input type="text" name="bairro" class="form-control"/><br/><br/>
		Cidade:<br/>
		<input type="text" name="cidade" class="form-control"/><br/><br/>
		<input type="submit" value="Cadastrar" class="btn btn-primary"/>
		<input type="reset" value="Limpar os Campos" class="btn btn-danger"/>
		
	</form>
</div>

</body>
</html>