package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "copia_libros")
public class CopiaLibro implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_copialib")
	private int idCopialib;
	
	@Column(name="cod_isbn")
	private String codIsbn;
	
	@Column(name="numero_serie")
	private int numeroSerie;
	
	@Column(name="destino")
	private String destino;
	
	@Column(name="id_precio_libro")
	private int idPrecioLibro;
	
	@Column(name="id_estado_libro")
	private int idEstadoLibro;

	
	
	
	public int getIdCopialib() {
		return idCopialib;
	}

	public void setIdCopialib(int idCopialib) {
		this.idCopialib = idCopialib;
	}

	public String getCodIsbn() {
		return codIsbn;
	}

	public void setCodIsbn(String codIsbn) {
		this.codIsbn = codIsbn;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getIdPrecioLibro() {
		return idPrecioLibro;
	}

	public void setIdPrecioLibro(int idPrecioLibro) {
		this.idPrecioLibro = idPrecioLibro;
	}

	public int getIdEstadoLibro() {
		return idEstadoLibro;
	}

	public void setIdEstadoLibro(int idEstadoLibro) {
		this.idEstadoLibro = idEstadoLibro;
	}
}
