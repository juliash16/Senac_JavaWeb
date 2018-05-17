package entidade;

public class Aluno {

	private Integer idAluno;
	private String nome;
	private String email;
	private String nascimento;
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	
	public Aluno() {
		
	}

	public Aluno(Integer idAluno, String nome, String email, String nascimento, String rua, String bairro,
			String cidade, String cep) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "ID do Aluno(a): "+idAluno+"-|-Nome: "+nome+"-|-Email: "+email+"-|-Data de Nascimento: "+nascimento+"-|-Rua: "+rua+"-|-Bairro: "+bairro+"-|-Cidade: "+cidade;
	}
	
	
}
