package exercicio;

public class Exercicio1305 {
	public static void main(String[] args) {
		int a = 10, b = 15; 
		double c = -5.9, d = -4.5;
		
		System.out.println("O maior entre 10 e 15 é: "+Math.max(a, b));
		System.out.println("O maior entre -5.9 e -4.5 é: "+Math.max(c, d));
		System.out.println("O maior entre "+a+" e "+c+" é: "+Math.max(a, c));
		
		System.out.println("\n\nO menor entre 10 e 15 é: "+Math.min(a, b));
		System.out.println("O menor entre -5.9 e -4.5 é: "+Math.min(c, d));
		System.out.println("O menor entre "+a+" e "+c+" é: "+Math.min(a, c));
		
		double e = 25, f = 2;
		
		System.out.println("\n\nA raiz quadrada de "+e+" = " +Math.sqrt(e));
		
		System.out.println("Potência "+Math.pow(e, f));
		
	}
}
