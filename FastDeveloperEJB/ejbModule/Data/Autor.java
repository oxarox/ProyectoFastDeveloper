package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "autores")
public class Autor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_autor")
	private int IdAutor;
	@Column(name="nombre_autor")
	private String NombreAutor;
	
	
	public int getIdAutor() {
		return IdAutor;
	}
	public void setIdAutor(int idAutor) {
		IdAutor = idAutor;
	}
	public String getNombreAutor() {
		return NombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		NombreAutor = nombreAutor;
	}
		
}
