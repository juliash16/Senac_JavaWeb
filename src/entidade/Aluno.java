package entidade;

import javax.swing.SingleSelectionModel;

public class Aluno {

	// Atributos da classe aluno
	String nome;
	int idade;
	double nota1;
	double nota2;
	
	// As funcionalidades de uma classe são definidas atraves de métodos
	
	public double calcularMedia() {
		double media = 0;
		media = (this.nota1 + this.nota2)/2;
		return media;
	}
	
	public void verificarSituacao(double media) {
		if (media >= 7) {
			System.out.println(nome+ " - Aluno(a) Aprovado");
		} else if(media > 6){
			System.out.println(nome+ " - Aluno(a) em Recuperação");
		} else {
			System.out.println(nome+ " - Aluno(a) Reprovado");
		}
	}
}
