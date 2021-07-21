package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "devoluciones")
public class Devolucion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_devolucion")
	private int idDevolucion;
	
	@Column(name="id_pretamos")
	private int idPretamos;
	
	@Column(name="devolucion_real")
	private int devolucionReal;
	
	@Column(name="dias_multa")
	private int diasMulta;
	
	@Column(name="precio_multa")
	private int precioMulta;
	
	@Column(name="precio_final")
	private int precioFinal;

	
	
	
	public int getIdDevolucion() {
		return idDevolucion;
	}

	public void setIdDevolucion(int idDevolucion) {
		this.idDevolucion = idDevolucion;
	}

	public int getIdPretamos() {
		return idPretamos;
	}

	public void setIdPretamos(int idPretamos) {
		this.idPretamos = idPretamos;
	}

	public int getDevolucionReal() {
		return devolucionReal;
	}

	public void setDevolucionReal(int devolucionReal) {
		this.devolucionReal = devolucionReal;
	}

	public int getDiasMulta() {
		return diasMulta;
	}

	public void setDiasMulta(int diasMulta) {
		this.diasMulta = diasMulta;
	}

	public int getPrecioMulta() {
		return precioMulta;
	}

	public void setPrecioMulta(int precioMulta) {
		this.precioMulta = precioMulta;
	}

	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}
	
	
}
