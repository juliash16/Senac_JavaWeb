package exercicio02;

import java.text.DateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exercicio1403 {

	public static void main(String[] args) {
		Date agora = new Date();
		
		DateFormat df1, df2, df3;
		String f1, f2, f3;
		
		df1 = DateFormat.getDateInstance();
		df2 = DateFormat.getDateInstance(DateFormat.LONG);
		df3 = DateFormat.getDateInstance(DateFormat.FULL);
		
		f1 = df1.format(agora);
		f2 = df2.format(agora);
		f3 = df3.format(agora);
		
		JOptionPane.showMessageDialog(null, "Formato Default "+f1+
				"\n\nFormato LONG "+f2+
				"\n\nFormato FULL "+f3);
	}
}
