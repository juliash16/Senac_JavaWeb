package exercicio;

import javax.swing.JOptionPane;

public class Exercicio1302 {
	public static void main(String[] args) {
		String aux1 = JOptionPane.showInputDialog(null, "Forne�a o 1� n�mero");
		if (aux1 == null) 
			System.exit(0); // Encerra o programa
			String aux2 = JOptionPane.showInputDialog(null, "Forne�a o 2� n�mero");
			if (aux2 == null) 
				System.exit(0);
			
			
			try {
				int num1 = Integer.parseInt(aux1);
				int num2 = Integer.parseInt(aux2);
				JOptionPane.showMessageDialog(null, "Soma = "+ (num1 + num2));
				JOptionPane.showMessageDialog(null, "Subtra��o = "+ (num1 - num2));
				JOptionPane.showMessageDialog(null, "Multiplica��o = "+ (num1 * num2));
				JOptionPane.showMessageDialog(null, "Divis�o = "+ (num1 / num2));
				
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Erro de divis�o por zero", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			
			 catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores n�mericos", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			
		}
}

