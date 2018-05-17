package colecao;

public class Vetores {

	public static void main(String[] args) {
	// Vetor de inteiro de 5 posições
	
	int vetor [] = new int[5];
	
	// as posições do vetor possuem um indice iniciado em 0
	
	vetor[0] = 3;
	vetor[1] = 30;
	vetor[2] = 3000;
	vetor[3] = 35;
	vetor[4] = 33;
	
	// a ultima posição do vetor é definids pelo seu tamanho -1
	
	System.out.println("\n------Posições do Vetor-------");
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Posição : "+i+" - Valor : "+vetor[i]);
	}
	}
}
