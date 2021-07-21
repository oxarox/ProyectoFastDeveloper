package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "precios_libros")
public class PrecioLibro implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_precio_libro")
	private int idPrecioLibro;
	
	@Column(name="precio")
	private int precio;
	
	@Column(name="tipo_precio")
	private int tipoPrecio;
	
	@Column(name="cod_isbn")
	private String codIsbn;
	
	@Column(name="fecha_modificacion")
	private int fechaModificacion;

	public int getIdPrecioLibro() {
		return idPrecioLibro;
	}

	public void setIdPrecioLibro(int idPrecioLibro) {
		this.idPrecioLibro = idPrecioLibro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(int tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}

	public String getCodIsbn() {
		return codIsbn;
	}

	public void setCodIsbn(String codIsbn) {
		this.codIsbn = codIsbn;
	}

	public int getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(int fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
}
