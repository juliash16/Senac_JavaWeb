package entidade;

import javax.swing.SingleSelectionModel;

public class Principal {
	public static void main(String[] args) {
		
		// crio objeto de instancia aluno
		Aluno a = new Aluno();
		
		/* Entrada de dados no objeto aluno*/
		a.nome = "ana";
		a.idade = 15;
		a.endereco = "rua a";
		a.cpf = 123456789;
		
		Aluno b = new Aluno();
		
		b.nome = "pedro";
		b.idade = 20;
		b.endereco = "rua f";
		b.cpf = 222222222;
		
		// Sa�da de dados
		System.out.println("Nome: "+a.nome);
		System.out.println("Idade: "+a.idade);
		System.out.println("CPF: "+a.cpf);
		System.out.println("Endere�o: "+a.endereco);
		
		System.out.println("\nNome: "+b.nome);
		System.out.println("Idade: "+b.idade);
		System.out.println("CPF: "+b.cpf);
		System.out.println("Endere�o: "+b.endereco);
	}
}
