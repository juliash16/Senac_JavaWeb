package exercicio;

public class Exercicio1306 {
	public static void main(String[] args) {
		String palavra = "       Senac - Botafogo!!         ";
		
		System.out.println("Minúscula : "+palavra.toLowerCase());
		System.out.println("Minúscula : "+palavra.toUpperCase());
		System.out.println("Com espaço : "+"*"+palavra+"*");
		System.out.println("Sem espaço : "+"*"+palavra.trim()+"*");
		
		System.out.println("--------------------");
		
		String frase = "O macaco gosta de banana";
		
		System.out.println(frase.replace(" ", "_"));
		System.out.println(frase.replace("a", "u"));
		
		System.out.println("--------------------");
		
		System.out.println("Tamanho da frase + " +frase.length());
		
	}
}
