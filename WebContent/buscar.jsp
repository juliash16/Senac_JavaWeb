<jsp:include page="topo.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<h3 class="page-header">Buscar Funcionário</h3>

<div class="well">
${msg }
	<form action="buscar.html" method="post" class="form-group">
		Informe o nome:
		<input type="text" name="nome" class="form-control"/>
		<br/>
		<input type="submit" value="buscar" class="btn btn-primary"/>
	</form>
</div>

<c:if test="${fn.length(lista) > 0 }">
	<table class="table table-bordered">
		<tr>
			<th>Nome</th>
			<th>E-mail</th>
			<th>CPF</th>
			<th>Salário</th>
			<th>Nascimento</th>
			<th></th>
		</tr>
		
		<c:forEach items="${lista }" var="f">
			<tr>
				<td>${f.nome }</td>
				<td>${f.email }</td>
				<td>${f.cpf }</td>
				<td>${f.salario }</td>
				<td>${f.nascimento }</td>
				<td><a href="#" class="btn btn-warning">Editar</a>
				<a href="#" class="btn btn-danger">Excluir</a></td>
			</tr>
		</c:forEach>
		
	</table>
</c:if>
<jsp:include page="rodape.jsp"></jsp:include>