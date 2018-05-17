package exercicio;

import javax.swing.JOptionPane;

public class Exercicio1301 {
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog(null, "Forneça um valor númerico entre 0 e 10");
		
		if(aux != null) {
			try {
				float x = Float.parseFloat(aux);
				if (x >= 0 && x <= 10) {
					JOptionPane.showMessageDialog(null, "Nota = "+x+", valor valido");
				}else {
					JOptionPane.showMessageDialog(null, "Nota = "+x+", valor invalido");
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
			}
		}
		System.exit(0);
	}
}
