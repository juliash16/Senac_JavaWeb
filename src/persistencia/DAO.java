package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	// Gerenciar a conexao com o banco de dados
	Connection conn;
	
	// Manipula as querys no banco de dados (executa as querys)
	PreparedStatement stmt;
	
	// Manipula o resultado da consulta
	ResultSet rs;
	
	// URL de conexao com o banco
	private final String URL = "jdbc:mysql://localhost:3306/aula12";
	private final String USER = "root";
	private final String PASSWORD = "";
	
	public void open() throws Exception {
		// Carregar o drive de conexao com o Mysql
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public void close() throws Exception {
		// Fechar a conexao com o banco
		conn.close();
	}
	
	public static void main(String[] args) {
		try {
			DAO d = new DAO();
			d.open();
			d.close();
			System.out.println("Conectei..");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu ruim "+e.getMessage());
		}
	}
}
