package entidade;

public class PrincipalAluno {
	// uma classe de execução requer o método de execução
	public static void main(String[] args) {
		
		// Criar o objeto aluno
		Aluno x = new Aluno();
		
		x.nome = "Andre";
		x.idade = 15;
		x.nota1 = 10;
		x.nota2 = 5;
		
		System.out.println("Nome: " +x.nome);
		System.out.println("Media: "+x.calcularMedia());
		x.verificarSituacao(x.calcularMedia());
		
		Aluno x1 = new Aluno();
		x1.nome = "Rose";
		x1.nota1 = 8;
		x1.nota2 = 6;
		System.out.println("\nNome: "+x1.nome);
		System.out.println("Média: "+x1.calcularMedia());
		x1.verificarSituacao(x1.calcularMedia());
	}
}
