package persistencia;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import entidade.Funcionario;

public class FuncionarioDAO extends DAO{

	public boolean cadastrar(Funcionario f) throws Exception {
		boolean success = false;
		
		try {
			open(); // abrir banco de dados
			stmt = conn.prepareStatement("insert into funcionario values(null, ?, ?, ?, ?, ?)");
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getEmail());
			stmt.setString(3, f.getCpf());
			stmt.setDouble(4, f.getSalario());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			stmt.setString(5, sdf.format(f.getNascimento()));
			
			stmt.execute();
			success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return success;	
	}
	
	public List<Funcionario> buscar(String nome) throws Exception {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		try {
			open(); // abrindo banco de dados
			stmt = conn.prepareStatement("select * from funcionario where nome like ?"); 
			stmt.setString(1, nome);
			// rs recebe o resultado da execução
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				//criar obj tipo funcionairo q vai receber os dados do banco
				Funcionario f = new Funcionario(rs.getInt("id"),
						 						rs.getString("nome"),
						 						rs.getString("email"),
						 						rs.getString("cpf"),
						 						rs.getDouble("salario"),
						 						rs.getDate("nascimento"));
				// adicionar obj funcionario com os dados vindo do banco a lista
				lista.add(f);
			}
			
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return lista;
	}
	// so existe um id então não precisa de lista
	public Funcionario buscarPorId(int id) throws Exception {
		Funcionario f = null;
		
		try {
			open();
			stmt = conn.prepareStatement("select * from funcionario where idFuncionario = ?");
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				f = new Funcionario(rs.getInt("idFuncionario"),
									rs.getString("nome"),
									rs.getString("email"),
									rs.getString("cpf"),
									rs.getDouble("salario"),
 									rs.getDate("nascimento"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return f;
	}
	
}

