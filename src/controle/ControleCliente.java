package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Cliente;
import persistencia.ClienteDao;


@WebServlet("/ControleCliente")
public class ControleCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ControleCliente() {
        super();

    }

	// é chamado por link (link chama o servlet)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// deu bom
			ClienteDao cd = new ClienteDao();
			List<Cliente> listaCliente = cd.consultarCliente();
			request.setAttribute("clientes", listaCliente);
			request.getRequestDispatcher("consulta.jsp").forward(request, response);
			
		} catch (Exception e) {
			// deu ruim
			e.printStackTrace();// Mostra a linha onde deu erro
			request.setAttribute("mensagem", "Erro: "+e.getMessage());
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
	}
	// é chamado por formulario
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg = null;
		try {
			// Objeto criado e os dados da tela, são inseridos no objeto
			Cliente cli = new Cliente(null,
							request.getParameter("nome"),
							request.getParameter("email"),
							request.getParameter("sexo"),
							request.getParameter("estadocivil"));
			
			ClienteDao cd = new ClienteDao();
			cd.inserir(cli);
			
			msg = "Cliente cadastrado com sucesso!";
			
			
		} catch (Exception e) {
			msg = " Erro: "+e.getMessage();
			e.getMessage();
		}
		
		// Criar um atributo "mensagem"
		request.setAttribute("mensagem", msg);	
		
		// Redirecionar a navegação para index.jsp enviando o objeto
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
