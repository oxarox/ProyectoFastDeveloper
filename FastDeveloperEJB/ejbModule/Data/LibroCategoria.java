package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "libro_categoria")
public class LibroCategoria implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_libro_categoria")
	private int idLibroCategoria;
	
	@Column(name="id_categoria")
	private int idCategoria;
	
	@Column(name="cod_isbn")
	private String codIsbn;
	

	public int getIdLibroCategoria() {
		return idLibroCategoria;
	}

	public void setIdLibroCategoria(int idLibroCategoria) {
		this.idLibroCategoria = idLibroCategoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCodIsbn() {
		return codIsbn;
	}

	public void setCodIsbn(String codIsbn) {
		this.codIsbn = codIsbn;
	}
	
}
