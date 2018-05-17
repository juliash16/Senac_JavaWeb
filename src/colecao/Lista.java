package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		
		li.add(3);
		li.add(30);
		li.add(35);
		li.add(40000);
		li.add(700);
		li.add(3500);
		
		System.out.println("Valores da lista"+li);
		
		li.set(2, 50); // trocando o valor da posição dois
		
		System.out.println("\nValores da lista"+li);
		
		// adicionando valores a lista 
		li.add(33);
		li.add(303);
		li.add(353);
		li.add(400003);
		li.add(7003);
		li.add(35003);
		
		System.out.println("\nValores da lista"+li);
	
		System.out.println("\nRemover item da lista");
		li.remove(1);
		
		System.out.println("Valores da lista"+li);
		
		// Ordenação em ordem crescente
		System.out.println("\n--------Ordenar Lista-------");
		Collections.sort(li);
		
		System.out.println("Valores da lista"+li);
		/* Outra maneira de imprimir em ordem crescente
		System.out.println("----------------------------");
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println("Posição : "+i+" - Valor : "+li.get(i));
		}
		*/
	}
}
