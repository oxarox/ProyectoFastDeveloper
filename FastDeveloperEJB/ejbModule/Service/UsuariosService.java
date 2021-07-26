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
	}
	
	public void agregarUsuario(Usuario u) {
		EntityManager em = this.emf.createEntityManager();
		try {
			em.persist(u);
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
		
	}
	
	public List<Usuario> listarUsuario() {
		EntityManager em = this.emf.createEntityManager();
		try {
			return em.createNamedQuery("Usuario.getAll", Usuario.class).getResultList();
		}catch(Exception ex){
			return null;
		}finally{
			em.close();
		}
	}
	
	public void eliminarPersona(Usuario u) {
		EntityManager em = this.emf.createEntityManager();
		try {
			em.remove(em.find(Usuario.class, u.getIdUser()));
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
		
	}
	
	public void editarPersona(Usuario u) {
		EntityManager em = this.emf.createEntityManager();
		try {
			Usuario original= em.find(Usuario.class, u.getIdUser());
			original.setIdUser(u.getIdUser());
			original.setNombreUsuario(u.getNombreUsuario());
			original.setPassword(u.getPassword());
			original.setId_trabajador(u.getId_trabajador());
			original.setId_tipo_usuario(u.getId_tipo_usuario());
			em.merge(original);
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
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
				}
			}
		}catch(Exception ex){
			return 0;
		}finally {
			em.close();
		}
		return tipoUsuario;
	}
	
	public int verificarTipoUsuarioByNombre(String usuario){
		EntityManager em = this.emf.createEntityManager();
		int tipoUsuario = 0;
		try {
			List<Usuario> listaUsuario = new  ArrayList<Usuario>();
			listaUsuario =  em.createNamedQuery("Usuario.getAll", Usuario.class).getResultList();
			for (Usuario usuario2 : listaUsuario) {
				if (usuario2.getNombreUsuario().equals(usuario)) {
					tipoUsuario =  usuario2.getId_tipo_usuario();
				}
			}
		}catch(Exception ex){
			return tipoUsuario; 
		}finally {
			em.close();
		}
		return tipoUsuario;
	}
}

