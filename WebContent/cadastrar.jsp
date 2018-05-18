<jsp:include page="topo.jsp"></jsp:include>

<!--  El - Expression Laguage -->

<h3>Cadastrar Funcionário</h3><br>
${msg }

<form action="cadastrar.html" class="form-group">
	Informe o nome :<br> <input type="text" name="nome" id="nome"
		class="form-control" /> <br>
	<br> Informe E-mail :<br> <input type="text" name="email"
		id="email" class="form-control" /> <br>
	<br> Informe Cpf :<br> <input type="text" name="cpf"
		id="cpf" class="form-control" /> <br>
	<br> Salário :<br> <input type="text" name="salario"
		id="salario" class="form-control" /> <br>
	<br> Informe o Nascimento :<br> <input type="text"
		name="nascimento" id="nascimento" class="form-control" /> <br>
	<br> <input type="submit" value="Cadastrar Funcionário" id="btn"
		class="bnt btn-primary" /> <input type="reset" value="Limpar dados"
		id="btn" class="bnt btn-danger" />
</form>


<jsp:include page="rodape.jsp"></jsp:include>