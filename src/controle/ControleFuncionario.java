package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia.FuncionarioDao;
import entidade.Funcionario;

@WebServlet({ "/ControleFuncionario", "/cadastrar.html", "/buscar.html",
		"/excluir.html", "/editar.html" })
public class ControleFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleFuncionario() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}

	protected void execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			try {
				// pegar a url que foi executada
				String url = request.getServletPath();
				if (url.equalsIgnoreCase("/cadastrar.html")) {
					cadastrar(request,response);
				} else if (url.equalsIgnoreCase("/buscar.html")) {
					buscar(request,response);
				} else  if (url.equalsIgnoreCase("/excluir.html")) {
					excluir(request,response);
				}else  if (url.equalsIgnoreCase("/editar.html")) {
					editar(request,response);
				}else{
					response.sendRedirect("/");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	protected void cadastrar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			try {
				
				String nome = request.getParameter("nome");
				String cpf = request.getParameter("cpf");
				String email = request.getParameter("email");
				// pega o salário... que é um campo texto
				String salario = request.getParameter("salario");
				String nascimento = request.getParameter("nascimento");
				
				Funcionario func = new Funcionario();
				
				salario = salario.replace(',', '.');
				
				func.setNome(nome);
				func.setEmail(email);
				func.setCpf(cpf);
				// conversão de texto para Double
				func.setSalario(new Double(salario));
				// 14/05/2018
				func.setNascimento(Funcionario.converterData(nascimento));
				//20180414
				new FuncionarioDao().cadastrar(func);
				
				request.setAttribute("msg","<div class='alert alert-success'>Funcionario Cadastrado!</div>");
				
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("msg", "<div class='alert alert-danger'>Funcionario não Cadastrado!</div>");
			}finally{
				 request.getRequestDispatcher("cadastrar.jsp").forward(request, response);
			}
	}
	protected void buscar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			// Manter no campo nome o valor buscado
			request.setAttribute("nome", nome);
			
			FuncionarioDao fd = new FuncionarioDao();
			List<Funcionario> lista = fd.buscar(nome+"%");
			if (nome == "") {
				request.setAttribute("msg", "<div class='alert alert-info'>Por favor digite um nome</div>");
				lista = null;
			}else if(lista.size() == 0){
			request.setAttribute("msg", "<div class='alert alert-info'>Nenhum funcionario encontrado</div>");
		}
			request.setAttribute("lista", lista);
			
			
		} catch (Exception e) {
			e.printStackTrace();// imprimir a linha do erro
			request.setAttribute("msg", "<div class='alert alert-danger'>Erro na busca</div>");
		}finally{
			request.getRequestDispatcher("buscar.jsp").forward(request, response);
		}
	}
	
	protected void excluir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			Integer id = new Integer(request.getParameter("id"));
			FuncionarioDao fd = new FuncionarioDao();
			Funcionario f = fd.buscarPorId(id);
			if (f == null) {
				request.setAttribute("msg", "<div class='alert alert-warning'>Funcionário não existe</div>");
			}else if (fd.excluir(id)) {
				request.setAttribute("msg", "<div class='alert alert-info'>Funcionário excluido</div>");
			}else {
				request.setAttribute("msg", "<div class='alert alert-danger'>Funcionário não foi excluido</div>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			request.getRequestDispatcher("buscar.jsp").forward(request, response);
		}
	}

	protected void editar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String email = request.getParameter("email");
			// pega o salário... que é um campo texto
			String salario = request.getParameter("salario");
			String nascimento = request.getParameter("nascimento");
			
			Funcionario func = new Funcionario();
			
			func.setNome(nome);
			func.setEmail(email);
			func.setCpf(cpf);
			// conversão de texto para Double
			func.setSalario(new Double(salario));
			// 14/05/2018
			func.setNascimento(Funcionario.converterData(nascimento));
			//20180414
			new FuncionarioDao().editar(func);
			
			request.setAttribute("msg","<div class='alert alert-success'>Funcionario editado com sucesso!</div>");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "<div class='alert alert-danger'>Funcionario não foi editado</div>");
		}finally{
			 request.getRequestDispatcher("cadastrar.jsp").forward(request, response);
		}
	}
}
