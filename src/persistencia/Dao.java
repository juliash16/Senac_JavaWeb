package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao { // podia ser conex�o
	Connection conn;
	PreparedStatement stmt;  // Variavel responsavel pela atualiza��o(inclus�o, exclus�o e atualiza��o)
	ResultSet rs;
	
	public void abrirConexao() throws Exception {
		// Definir a classe que atua como drive de conex�o entre o java e o mysql
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto01","root","");
	}
	
	public void fecharConexao() throws Exception {
		conn.close();
	}

	
	// N�o � necessario chamar(so para verificar se esta funcionando)
	public static void main(String[] args) {
		Dao d = new Dao(); // Criar variavel do tipo dao
		try {
			d.abrirConexao();
			d.fecharConexao();
			System.out.println("Conectei...");
		} catch (Exception e) {
			System.out.println("Deu ruim...");
			e.printStackTrace(); // Informa onde possa estar o erro para n�o ter conectado
		}
	}
}
