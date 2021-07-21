package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipos_precios")
public class TipoPrecio implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_precio")
	private int id_tipo_precio;
	
	@Column(name="descripcion")
	private String descripcion;

	public int getId_tipo_precio() {
		return id_tipo_precio;
	}

	public void setId_tipo_precio(int id_tipo_precio) {
		this.id_tipo_precio = id_tipo_precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
