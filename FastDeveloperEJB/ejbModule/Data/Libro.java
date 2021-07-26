package Data;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity(name = "libros")
@NamedQueries({
    @NamedQuery(name="Libro.getAll",query="select l from libros l")
})
public class Libro implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_isbn")
	private String codigoIsbn;
	
	@Column(name="id_idioma")
	private int idIdioma;
	
	@Column(name="anno_publicacion")
	private int annoPublicacion;
	
	@Column(name="id_editorial")
	private int idEditorial;
	
	@Column(name="nombre_libro")
	private String nombreLibro;
	
	@Column(name="contador_serie")
	private int contadorSerie;
	
	@Column(name="numeros_paguina")
	private int numerosPaguina;

	@Column(name="portada")
	private String portada;
	
	@Column(name="destacado")
	private int destacado;
	
	@Column(name="tipo_libro")
	private char tipoLibro;
	
	public String getCodigoIsbn() {
		return codigoIsbn;
	}

	public void setCodigoIsbn(String codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}

	public int getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	public int getAnnoPublicacion() {
		return annoPublicacion;
	}

	public void setAnnoPublicacion(int annoPublicacion) {
		this.annoPublicacion = annoPublicacion;
	}

	public int getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(int idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public int getContadorSerie() {
		return contadorSerie;
	}

	public void setContadorSerie(int contadorSerie) {
		this.contadorSerie = contadorSerie;
	}

	public int getNumerosPaguina() {
		return numerosPaguina;
	}

	public void setNumerosPaguina(int numerosPaguina) {
		this.numerosPaguina = numerosPaguina;
	}
	
	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}
	
	public int getDestacado() {
		return destacado;
	}

	public void setDestacado(int destacado) {
		this.destacado = destacado;
	}
	
	public char getTipoLibro() {
		return tipoLibro;
	}

	public void setTipoLibro(char tipoLibro) {
		this.tipoLibro = tipoLibro;
	}
}
