package colecao;

public class Vetores {

	public static void main(String[] args) {
	// Vetor de inteiro de 5 posi��es
	
	int vetor [] = new int[5];
	
	// as posi��es do vetor possuem um indice iniciado em 0
	
	vetor[0] = 3;
	vetor[1] = 30;
	vetor[2] = 3000;
	vetor[3] = 35;
	vetor[4] = 33;
	
	// a ultima posi��o do vetor � definids pelo seu tamanho -1
	
	System.out.println("\n------Posi��es do Vetor-------");
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Posi��o : "+i+" - Valor : "+vetor[i]);
	}
	}
}
