package cl.inacap.FastDeveloperDashboar.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Service.UsuariosService;

/**
 * Servlet implementation class login2
 */
@WebServlet(name = "login2.do", urlPatterns = { "/login2.do" })
public class login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login2() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private UsuariosService us;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Site/js/login2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Usuario= request.getParameter("nombreUsuario").toString();
		String Password= request.getParameter("nombrePassword").toString();
		
		// id_user=Ana cliente  1, Jose vendedor1 2, Pepa vendedor2	3						
		//password
		
		int tipo_usuario= us.buscarUsuario(Usuario, Password); //servicio
		
		//0= refuse , los demas pasan a home
		
		//revisar si logea
		
		if(tipo_usuario==0) {
			System.out.println("0");
		}else {
			System.out.println("1");
			request.setAttribute("Usuario", Usuario);
			 //buscar a traves del usuario de do a do????
		}
		
		

}
}
