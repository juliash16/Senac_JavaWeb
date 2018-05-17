package persistencia;

import java.util.ArrayList;
import java.util.List;
import entidade.Cliente;

public class ClienteDao extends Dao{
	
	public void inserir(Cliente c) throws Exception { // Método para inserir
		
		abrirConexao(); // Abrir o banco de dados
		stmt = conn.prepareStatement("insert into cliente values(null,?,?,?,?)");
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setString(3, c.getSexo());
		stmt.setString(4, c.getEstadoCivil());
		
		stmt.execute(); // Gravar
		stmt.close();
		
		fecharConexao(); //Fechar a conexão como banco de dados
	}
	
	// Método para lista
	public List<Cliente> consultarCliente() throws Exception{
		abrirConexao();
		
		stmt = conn.prepareStatement("select * from cliente");
		rs = stmt.executeQuery(); // Executando a consulta e colocando os objetos dentro da variavel rs
		List<Cliente> lista = new ArrayList<Cliente>();
		
		while(rs.next()) {
			lista.add(new Cliente(rs.getInt("id"),
								  rs.getString("nome"),
								  rs.getString("email"),
								  rs.getString("sexo"),
								  rs.getString("estadocivil")));
		}
		
		rs.close();
		stmt.close();
		fecharConexao();
		return lista;
	}
	
	
	// Método para excluir
}
