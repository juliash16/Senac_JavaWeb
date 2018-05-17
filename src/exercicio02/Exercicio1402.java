package exercicio02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exercicio1402 {
	public static void main(String[] args) {
		Date agora = new Date();
		
		DateFormat df1 ,df2, df3, df4;
		
		String f1 = "dd/MM/yyyy"; // dd - dia mês e ano normal
		df1 = new SimpleDateFormat(f1);
		
		String f2 = "EEE, MMM d, yy"; // EEE - dia da semana | MMM d - mês por extenso | yy - ano com dois digitos
		df2 = new SimpleDateFormat(f2);
		
		String f3 = "DD/mm/yy"; // DD - dia do ano(a partir dp primeiro ano quantos dias se passaram) | mm - minuto da hora | yy - ano com dois digitos
		df3 = new SimpleDateFormat(f3);
		
		String f4 = "hh:mm:ss:SS"; // hh - hora | mm - minuto | ss - segundos | SS - milesimo de segundo
		df4 = new SimpleDateFormat(f4);
		
		JOptionPane.showMessageDialog(null, "Dia/mes/ano com quatro digitos --> "+df1.format(agora)
		+"\n\nDia da semana, mês por estenso, dia, ano com dois digitos --> "+df2.format(agora)
		+"\n\nDia do ano/minutos da hora/ano com dois digitos --> "+df3.format(agora)
		+"\n\nHoras:minutos:segundos:milessimos de segundo --> "+df4.format(agora));
	}
}
