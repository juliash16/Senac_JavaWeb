package exercicio;

public class Exercicio1303 {
	public static void main(String[] args) {
		try {
			System.out.println("Como Aprender");
			throw new Exception("MinhaExcecao"); // gera exceção
		} catch (Exception MinhaExcecao) {
			System.out.println("A linguagem Java ?");
		}
	}
}
