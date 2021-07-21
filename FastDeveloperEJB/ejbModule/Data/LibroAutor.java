package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "libro_autor")
public class LibroAutor implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_libro_autor")
	private int id_libro_autor;
	
	@Column(name="id_autor")
	private int id_autor;
	
	@Column(name="codigo_isbn")
	private String codigo_isbn;

	
	public int getId_libro_autor() {
		return id_libro_autor;
	}

	public void setId_libro_autor(int id_libro_autor) {
		this.id_libro_autor = id_libro_autor;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getCodigo_isbn() {
		return codigo_isbn;
	}

	public void setCodigo_isbn(String codigo_isbn) {
		this.codigo_isbn = codigo_isbn;
	}
}
