package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao { // podia ser conexão
	Connection conn;
	PreparedStatement stmt;  // Variavel responsavel pela atualização(inclusão, exclusão e atualização)
	ResultSet rs;
	
	public void abrirConexao() throws Exception {
		// Definir a classe que atua como drive de conexão entre o java e o mysql
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto01","root","");
	}
	
	public void fecharConexao() throws Exception {
		conn.close();
	}

	
	// Não é necessario chamar(so para verificar se esta funcionando)
	public static void main(String[] args) {
		Dao d = new Dao(); // Criar variavel do tipo dao
		try {
			d.abrirConexao();
			d.fecharConexao();
			System.out.println("Conectei...");
		} catch (Exception e) {
			System.out.println("Deu ruim...");
			e.printStackTrace(); // Informa onde possa estar o erro para não ter conectado
		}
	}
}
