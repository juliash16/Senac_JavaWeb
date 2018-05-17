package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidade.Aluno;

public class AlunoDao extends Dao{

	public void inserir(Aluno a) throws Exception { // inserir
		
		abrirConexao(); 
		stmt = conn.prepareStatement("insert into aluno values(null,?,?,?,?,?,?,?)");
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getEmail());
		stmt.setString(3, a.getNascimento());
		stmt.setString(4, a.getRua());
		stmt.setString(5, a.getBairro());
		stmt.setString(6, a.getCidade());
		stmt.setString(7, a.getCep());
		
		stmt.execute(); 
		stmt.close();
		
		fecharConexao(); 
	}
	
	//lista
	public List<Aluno> consultarAluno() throws Exception{
		abrirConexao();
		
		stmt = conn.prepareStatement("select * from aluno");
		rs = stmt.executeQuery(); 
		List<Aluno> lista = new ArrayList<Aluno>();
		
		while(rs.next()) {
			lista.add(new Aluno(rs.getInt("id"),
								  rs.getString("nome"),
								  rs.getString("email"),
								  rs.getString("nascimento"),
								  rs.getString("rua"),
								  rs.getString("bairro"),
								  rs.getString("cidade"),
								  rs.getString("cep")));
		}
		
		rs.close();
		stmt.close();
		fecharConexao();
		return lista;
	}
	
	
}
