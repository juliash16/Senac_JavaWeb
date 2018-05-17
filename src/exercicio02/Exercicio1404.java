package exercicio02;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exercicio1404 {

	public static void main(String[] args) {
		Date agora = new Date();
		
		Calendar calendario = Calendar.getInstance();  // cria uma variavel com o nome calendario
		
		calendario.setTime(agora);
		
		int dia = calendario.get(Calendar.DATE);
		int mes = calendario.get(Calendar.MONTH);
		int ano = calendario.get(Calendar.YEAR);
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minuto = calendario.get(Calendar.MINUTE);
		int segundo = calendario.get(Calendar.SECOND);
		int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
		
		JOptionPane.showMessageDialog(null, "Dia : "+dia+"\nMês : "+mes+"\nAno : "+ano
				+"\nHora : "+hora+"\nMinuto : "+minuto+"\nSegundo : "+segundo+"\nDia da Semana : "+diaDaSemana);
	}
}
