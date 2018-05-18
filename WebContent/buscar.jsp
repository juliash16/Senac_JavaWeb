<jsp:include page="topo.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<h3 class="page-header">BUSCAR FUNCIONÁRIOS</h3>
<div class="well">
	<form action="buscar.html" method="post" class="form-group">
		Informe o nome:
		<input type="text" name="nome" class="form-control"/>
		<br>
		<input type="submit" value="BUSCAR" class="btn btn-info"/>
	
	
	</form>
	${msg }

</div>

<c:if test="${fn:length(lista) > 0 }">
			<table class="table table-bordered">
				<tr>
					<th>NOME</th>
					<th>EMAIL</th>
					<th>CPF</th>
					<th>SALÁRIO</th>
					<th>NASCIMENTO</th>
					<th></th>
					
				</tr>
				
				<c:forEach items="${lista }" var="f">
					<tr>
						<td>${f.nome }</td>
						<td>${f.email }</td>
						<td>${f.cpf }</td>
						<td><fmt:formatNumber value="${f.salario }" type="currency"/></td>
						<td><fmt:formatDate value ="${f.nascimento }" pattern="dd/MM/yyyy"/></td>
						<td><a href="editar.html?id=${f.idFuncionario }" onclick="return confirm('Deseja editar esse Funcionário?')" class="btn btn-warning">Editar</a>
						<a href="excluir.html?id=${f.idFuncionario }" onclick="return confirm('Deseja excluir esse Funcionário?')" class="btn btn-danger">Excluir</a></td>
					</tr>
				</c:forEach>
			
			
			</table>
</c:if>



<jsp:include page="rodape.jsp"></jsp:include>

