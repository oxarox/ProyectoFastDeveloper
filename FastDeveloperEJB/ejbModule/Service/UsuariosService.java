package Service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

        try {

        }catch(Exception ex){
            return 0;
        }finally {
            em.close();
        }

        return 0;
    }
}