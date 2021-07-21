package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "datalles_boletas")
public class DatalleBoleta implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_detalle_boleta")
	private int idDetalleBoleta;
	
	@Column(name="id_boleta")
	private int idBoleta;
	
	@Column(name="id_copia_libro")
	private int idCopiaLibro;
	
	@Column(name="valor_libro")
	private int valorLibro;

	
	
	public int getIdDetalleBoleta() {
		return idDetalleBoleta;
	}

	public void setIdDetalleBoleta(int idDetalleBoleta) {
		this.idDetalleBoleta = idDetalleBoleta;
	}

	public int getIdBoleta() {
		return idBoleta;
	}

	public void setIdBoleta(int idBoleta) {
		this.idBoleta = idBoleta;
	}

	public int getIdCopiaLibro() {
		return idCopiaLibro;
	}

	public void setIdCopiaLibro(int idCopiaLibro) {
		this.idCopiaLibro = idCopiaLibro;
	}

	public int getValorLibro() {
		return valorLibro;
	}

	public void setValorLibro(int valorLibro) {
		this.valorLibro = valorLibro;
	}
}
