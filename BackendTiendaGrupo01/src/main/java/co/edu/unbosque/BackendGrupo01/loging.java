package co.edu.unbosque.BackendGrupo01;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.Usuario;

/**
 * Servlet implementation class loging
 */
@WebServlet("/loging")
public class loging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loging() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String ario="admininicial";
		String seña="admin123456";
		String user=request.getParameter("Usuario");
		String pass=request.getParameter("Contrase�a");
		if (user != null || pass != null){
			if (user.equals(ario) && pass.equals(seña)){
				System.out.println("Carga exitosa");
				request.setAttribute("Bienvenido", user);
				request.getRequestDispatcher("/usuarios.jsp").forward(request, response);
			}else{
				System.out.println("Datos invalidos");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
		}
	}
	public void validar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<Usuario> lista = TestJSON.getJSON();
			request.setAttribute("lista", lista;
			String ario = request.getParameter("txtusuario");
			String seña = request.getParameter("txtcontrase�a");
			int res=0;
			for(Usuario usuario:lista) {
				if(usuario.getArio().equals(ario) && usuario.getPass().equals(seña)) {
					request.setAttribute("usuario", usuario);
					request.getRequestDispatcher("/usuarios.jsp").forward(request, response);
					res=1;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
