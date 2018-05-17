package persistencia;

import java.util.ArrayList;
import java.util.List;

import dataUtil.ConversaoData;
import entidade.Aluno;
import entidade.Endereco;

public class AlunoDao extends Dao{

	public void inserir (Aluno a) throws Exception {
		
		abrirConexao();
		stmt = conn.prepareStatement("insert into aluno values(null,?,?,?)",stmt.RETURN_GENERATED_KEYS);
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getEmail());
		stmt.setString(3, new ConversaoData().coverterDateMysql(a.getNascimento()));
		
		
		stmt.execute();
		
		// Recuperar o id do aluno
		rs = stmt.getGeneratedKeys();
		
		if(rs.next()) {
			a.setMatricula(rs.getInt(1));
		}
		
		stmt.close(); // "Limpou a variavel"
		
		stmt = conn.prepareStatement("insert into endereco values(null,?,?,?,?)",stmt.RETURN_GENERATED_KEYS);
		stmt.setString(1, a.getEndereco().getRua());
		stmt.setString(2, a.getEndereco().getBairro());
		stmt.setString(3, a.getEndereco().getCidade());
		stmt.setInt(4, a.getMatricula());
		
		// Gravar na tabela de endereco
		
		stmt.execute();
		stmt.close();
		fecharConexao();
		
	}
	
	public List<Aluno> consultarAlunoEndereco() throws Exception {
		abrirConexao();
		
		stmt = conn.prepareStatement("select A.mat,A.nome,A.email,A.nascimento,E.rua,E.bairro,E.cidade from aluno A inner join endereco E on A.mat = E.mat_aluno;");
		rs = stmt.executeQuery();
		List<Aluno> lista = new ArrayList<Aluno>();
		
		while(rs.next()) {
			Aluno a = new Aluno(rs.getInt("mat"),
								rs.getString("nome"),
								rs.getString("email"),
								new ConversaoData().converterStringDateBanco(rs.getString("nascimento")));
			Endereco e = new Endereco(null,
									  rs.getString("rua"),
									  rs.getString("bairro"),
									  rs.getString("cidade"));
			a.setEndereco(e);
			lista.add(a);
		}
		
		rs.close();
		stmt.close();
		fecharConexao();
		return lista;
	}
}
