package persistencia;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entidade.Funcionario;

public class FuncionarioDao extends Dao {

	public boolean cadastrar(Funcionario f)throws Exception{
		boolean success = false;
		try {
			open();// abrir banco de dados
			stmt = conn.prepareStatement("insert into funcionario values(null,?,?,?,?,?)");
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
		}finally{
			close();
		}
		return success;
	}
	
	public List<Funcionario>buscar(String nome)throws Exception{		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		try {
			open();// abrir banco de dados
			// montar a instrução de seleção
			stmt = conn.prepareStatement("select * from funcionario where nome like ?");
			// substituindo o caracter coringa ? pelo dado nome
			stmt.setString(1, nome);
			// a variável rs recebe o resultado da execução da consulta
			rs = stmt.executeQuery();
			while(rs.next()){
				Funcionario f = new Funcionario(
						rs.getInt("idfuncionario"),
						rs.getString("nome"),
						rs.getString("email"),
						rs.getString("cpf"),
						rs.getDouble("salario"),
						rs.getDate("nascimento"));
				
				// adicionar o objeto funcionario, com os dados vindo do banco a minha lista
				lista.add(f);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return lista;
		
		
	}
	
	public Funcionario buscarPorId(int id)throws Exception{
			Funcionario f = null;
			
			try {
				// abrir banco de dados
				open();
				stmt = conn.prepareStatement("select * from funcionario where idfuncionario = ?");
				stmt.setInt(1, id);
				
				rs = stmt.executeQuery();
				
				if(rs.next()){
					f =new Funcionario(rs.getInt("idfuncionario"),
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
	
	public boolean excluir(int id) throws Exception{
		boolean success = false;
		try {
			open();
			
			stmt = conn.prepareStatement("delete from funcionario where idFuncionario = ?");
			stmt.setInt(1, id);
			
			stmt.execute();
			
			success = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return success;
	}
	
	public boolean editar(Funcionario f) throws Exception {
		boolean success = false;
		try {
			open();
			stmt = conn.prepareStatement("update * from funcionario nome = ?, email = ?, cpf = ?, salario = ?, nascimento = ? where id = ?");
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getEmail());
			stmt.setString(3, f.getCpf());
			stmt.setDouble(4, f.getSalario());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			stmt.setString(5, sdf.format(f.getNascimento()));
			stmt.setInt(6, f.getIdFuncionario());
			
			rs = stmt.executeQuery();
			
			success = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return success;
	}
} 

