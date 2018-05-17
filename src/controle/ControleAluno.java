package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataUtil.ConversaoData;
import entidade.Aluno;
import entidade.Endereco;
import persistencia.AlunoDao;


@WebServlet("/ControleAluno")
public class ControleAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControleAluno() {
        super();
        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// Cria a lista alunos no servlet que recebe os dados vindo da lista consultarAluno
			List<Aluno> alunos = new AlunoDao().consultarAlunoEndereco();
			request.setAttribute("listaAluno", alunos);
			request.getRequestDispatcher("consulta.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("mensagem", e.getMessage());
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg = null;
		
		try {
			Aluno a = new Aluno(null,
								request.getParameter("nome"),
								request.getParameter("email"),
								new ConversaoData().converterStringDate(request.getParameter("nascimento")));
		
			Endereco e = new Endereco(null,
									  request.getParameter("rua"),
									  request.getParameter("bairro"),
									  request.getParameter("cidade"));
			
			// Associação
			a.setEndereco(e);
			
			// Enviar para o banco de dados
			new AlunoDao().inserir(a);
			
			msg = "Aluno cadastrado com sucesso!";
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
		}
		
		request.setAttribute("mensagem", msg);
		
		request.getRequestDispatcher("cadastro.jsp").forward(request, response);
	}

}
