package exercicio;

public class Exercicio1304 {
	public static void main(String[] args) {
		
		int x = 10, y = 0, z = 0;
		
		try {
			z = x / y; // gera uma exceção
		} catch (Exception erro) {
			System.out.println(erro.getMessage()); // mostra mensagem de erro
			erro.printStackTrace(); // mostra as linhas onde ocorreram erros
		}
		
		
	}
}
