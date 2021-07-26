package Service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Data.*;

@Stateless
@LocalBean
public class UsuariosService {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("FastDeveloperEJB");
	
	
	/**
     * Default constructor. 
     */
	public UsuariosService() {
		// TODO Auto-generated constructor stub
	}
	public int buscarUsuario(String usuario, String password) {
		EntityManager em = this.emf.createEntityManager();
		int tipoUsuario = 0;
		try {
			List<Usuario> listaUsuario = new  ArrayList<Usuario>();
			listaUsuario =  em.createNamedQuery("Usuario.getAll", Usuario.class).getResultList();
			for (Usuario usuario2 : listaUsuario) {
				if (usuario2.getNombreUsuario().equals(usuario) && usuario2.getPassword().equals(password)) {
					tipoUsuario =  usuario2.getId_tipo_usuario();
				}else {
					tipoUsuario = 0;
				}
			}
		}catch(Exception ex){
			return 0;
		}finally {
			em.close();
		}
		return tipoUsuario;
	}
}
