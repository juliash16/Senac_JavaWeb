package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Aluno;
import persistencia.AlunoDao;

@WebServlet("/ControleAluno")
public class ControleAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
    public ControleAluno() {
        super();

    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			AlunoDao ad = new AlunoDao();
			List<Aluno> listaAluno = ad.consultarAluno();
			request.setAttribute("alunos", listaAluno);
			request.getRequestDispatcher("consulta.jsp").forward(request, response);
			
		} catch (Exception e) {
			
			e.printStackTrace();// Mostra a linha onde deu erro
			request.setAttribute("mensagem", "Erro: "+e.getMessage());
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg = null;
		try {
			
			Aluno alu = new Aluno(null,
							request.getParameter("nome"),
							request.getParameter("email"),
							request.getParameter("nascimento"),
							request.getParameter("rua"),
							request.getParameter("bairro"),
							request.getParameter("cidade"),
							request.getParameter("cep"));
			
			AlunoDao ad = new AlunoDao();
			ad.inserir(alu);
			
			msg = "Aluno cadastrado com sucesso!";
			
			
		} catch (Exception e) {
			msg = " Erro: "+e.getMessage();
			e.getMessage();
		}
		
		
		request.setAttribute("mensagem", msg);	
		
		// Redirecionar a navegação para index.jsp enviando o objeto
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}

