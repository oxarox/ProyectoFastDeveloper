package Service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Data.Libro;

/**
 * Session Bean implementation class LibrosService
 */
@Stateless
@LocalBean
public class LibrosService {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DashboardEJB");
	
    /**
     * Default constructor. 
     */
    public LibrosService() {
    }

    public void agregarPersona(Libro l) {
		EntityManager em = this.emf.createEntityManager();
		try {
			em.persist(l);
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
	}
    
    public List<Libro> listarLibro() {
		EntityManager em = this.emf.createEntityManager();
		try {
			return em.createNamedQuery("Libro.getAll", Libro.class).getResultList();
		}catch(Exception ex){
			return null;
		}finally{
			em.close();
		}
	}
    
    public void eliminarPersona(Libro l) {
		EntityManager em = this.emf.createEntityManager();
		try {
			em.remove(em.find(Libro.class, l.getCodigoIsbn()));
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
	}
    
    public void editarPersona(Libro l) {
		EntityManager em = this.emf.createEntityManager();
		try {
			Libro original= em.find(Libro.class, l.getCodigoIsbn());
			original.setCodigoIsbn(l.getCodigoIsbn());
			original.setIdIdioma(l.getIdIdioma());
			original.setAnnoPublicacion(l.getAnnoPublicacion());
			original.setIdEditorial(l.getIdEditorial());
			original.setNombreLibro(l.getNombreLibro());
			original.setContadorSerie(l.getContadorSerie());
			original.setNumerosPaguina(l.getNumerosPaguina());
			original.setPortada(l.getPortada());
			original.setDestacado(l.getDestacado());			
			em.merge(original);
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
	}
    
    public List<Libro> listarLibroDestacados() {
		EntityManager em = this.emf.createEntityManager();
		List<Libro> listaLibro = new ArrayList<Libro>();
		List<Libro> listaLibroDestacado = new ArrayList<Libro>();
		try {
			listaLibro = em.createNamedQuery("Libro.getAll", Libro.class).getResultList();
			for (Libro libro : listaLibro) {
				if (libro.getDestacado() == 1) {
					listaLibroDestacado.add(libro);
				}
			}
		}catch(Exception ex){
			return null;
		}finally{
			em.close();
		}
		return listaLibroDestacado;
	}
    
    public List<Libro> listarLibroAriendo() {
		EntityManager em = this.emf.createEntityManager();
		List<Libro> listaLibro = new ArrayList<Libro>();
		List<Libro> listaLibroArriendo = new ArrayList<Libro>();
		try {
			listaLibro = em.createNamedQuery("Libro.getAll", Libro.class).getResultList();
			for (Libro libro : listaLibro) {
				if (libro.getTipoLibro() == 'A' || libro.getTipoLibro() == 'a' || libro.getTipoLibro() == 'T' || libro.getTipoLibro() == 't') {
					listaLibroArriendo.add(libro);
				}
			}
		}catch(Exception ex){
			return null;
		}finally{
			em.close();
		}
		return listaLibroArriendo;
	}
    
    public List<Libro> listarLibroVenta() {
		EntityManager em = this.emf.createEntityManager();
		List<Libro> listaLibro = new ArrayList<Libro>();
		List<Libro> listaLibroVenta = new ArrayList<Libro>();
		try {
			listaLibro = em.createNamedQuery("Libro.getAll", Libro.class).getResultList();
			for (Libro libro : listaLibro) {
				if (libro.getTipoLibro() == 'V' || libro.getTipoLibro() == 'v' || libro.getTipoLibro() == 'T' || libro.getTipoLibro() == 't') {
					listaLibroVenta.add(libro);
				}
			}
		}catch(Exception ex){
			return null;
		}finally{
			em.close();
		}
		return listaLibroVenta;
	}
}
