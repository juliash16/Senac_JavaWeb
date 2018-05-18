package entidade;

import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario {
	private Integer idFuncionario;
	private String nome;
	private String email;
	private String cpf;
	private Double salario;
	private Date nascimento;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer idFuncionario, String nome, String email,
			String cpf, Double salario, Date nascimento) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.salario = salario;
		this.nascimento = nascimento;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	//14/05/2018
	public static Date converterData(String data){
		String novaData[] = data.split("/");
		String dia = novaData[0];
		String mes = novaData[1];
		String ano = novaData[2];
		
		GregorianCalendar cal = new GregorianCalendar(new Integer(ano),
				                                      new Integer(mes)-1,
				                                      new Integer(dia));
		
		return cal.getTime();
	}
	
	
	
	
}


