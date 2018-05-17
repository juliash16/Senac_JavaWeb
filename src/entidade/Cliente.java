package entidade;

public class Cliente {

	private Integer idCliente;
	private String nome;
	private String email;
	private String sexo;
	private String estadoCivil;
	
	// Construtor implícito
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	// Menu Source -> Generate Constructor using Fields
	public Cliente(Integer idCliente, String nome, String email, String sexo, String estadoCivil) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}
	
	// Menu Source -> Generate toString()
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo
				+ ", estadoCivil=" + estadoCivil + "]";
	}

	// Menu Source -> Generate getters and setters
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}

