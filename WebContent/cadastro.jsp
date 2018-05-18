	
<jsp:include page="topo.jsp"></jsp:include>
	
	<div class="col-xs-12">
		<h3 class="page-header">Cadastro de Funcionários</h3>
	</div>
	${msg }
	<form action="cadastrar.html" class="form-group">
		Informe o nome: <br/>
		<input type="text" name="nome" id="nome" class="form-control"/>
		<br/><br/>
		Informe o E-mail: <br/>
		<input type="text" name="email" id="email" class="form-control"/>
		<br/><br/>
		Informe o CPF: <br/>
		<input type="text" name="cpf" id="cpf" class="form-control"/>
		<br/><br/>
		Salário: <br/>
		<input type="text" name="salario" id="salario" class="form-control"/>
		<br/><br/>
		Informe a Data de Nascimetno: <br/>
		<input type="text" name="nascimento" id="nascimento" class="form-control"/>
		<br/><br/>
		
		<input type="submit" value="Cadastrar Funcionario" id="btn" class="btn btn-primary"/>
		<input type="reset" value="Limpar Dados" id="btn" class="btn btn-danger"/>
	</form>

<jsp:include page="rodape.jsp"></jsp:include>	
