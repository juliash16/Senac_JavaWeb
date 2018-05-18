package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Funcionario;
import persistencia.FuncionarioDAO;


@WebServlet({ "/Controle","/cadastrar.html","/buscar.html","/editar.html","/excluir.html" })
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	
    public Controle() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// pegar url q foi executada
			String url = request.getServletPath();
			if (url.equalsIgnoreCase("/cadastrar.html")) {
				cadastrar(request,response);
			}else if (url.equalsIgnoreCase("/buscar.hmtl")) {
				buscar(request,response);
			}else {
				response.sendRedirect("/");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	protected void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// Resgatar os dados do formulario - O jeito certo é = (cria um objt e joga nele)
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String email = request.getParameter("email");
			String salario = request.getParameter("salario");
			String nascimento = request.getParameter("nascimento");
			
			// instancia um objeto do tipo Funcionario
			Funcionario func = new Funcionario();
			
			salario = salario.replace(',', '.');
			
			func.setNome(nome);
			func.setEmail(email);
			func.setCpf(cpf);
			func.setSalario(new Double(salario));
			func.setNascimento(Funcionario.converterData(nascimento));
			
			new FuncionarioDAO().cadastrar(func);
			
			request.setAttribute("msg", "<div class='alert alert-success'>Funcionario Cadastrado</div>");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "<div class='alert alert-danger'>Funcionario não foi Cadastrado</div>");
		}finally {
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		}
	}

	protected void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");  // name="nome"
			// manter no campo nome o valor buscado
			request.setAttribute("nome", nome);
			
			FuncionarioDAO fd = new FuncionarioDAO();
			List<Funcionario> lista = fd.buscar(nome+"%"); //se vc escrever simone e tem uma simone maria ela vai trazer por causa do %
			if (lista.size() == 0){
				request.setAttribute("msg", "<div class='alert alert-info'>Nenhum funcionário encontrado</div>");
			}
			
			request.setAttribute("lista", lista);
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "<div class='alert alert-danger'>Erro na busca</div>");
		}finally {
			request.getRequestDispatcher("buscar.jsp").forward(request, response);
		}
	}
	
	protected void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}
	
	protected void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}
	

}
