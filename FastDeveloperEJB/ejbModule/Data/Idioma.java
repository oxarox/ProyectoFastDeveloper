package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "idiomas")
public class Idioma implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_estado_libro")
	private int idEstadoLibro;
	
	@Column(name="descripcion")
	private String descripcion;

	public int getIdEstadoLibro() {
		return idEstadoLibro;
	}

	public void setIdEstadoLibro(int idEstadoLibro) {
		this.idEstadoLibro = idEstadoLibro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
