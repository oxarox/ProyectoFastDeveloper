package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "metodo_pago_boleta")
public class MetodoPagoBoleta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_metodo_pago")
	private int idMetodoPago;
	
	@Column(name="id_boleta")
	private int idBoleta;
	
	@Column(name="id_metodo")
	private int idMetodo;
	
	@Column(name="metodo_monto")
	private int metodoMonto;

	public int getIdMetodoPago() {
		return idMetodoPago;
	}

	public void setIdMetodoPago(int idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}

	public int getIdBoleta() {
		return idBoleta;
	}

	public void setIdBoleta(int idBoleta) {
		this.idBoleta = idBoleta;
	}

	public int getIdMetodo() {
		return idMetodo;
	}

	public void setIdMetodo(int idMetodo) {
		this.idMetodo = idMetodo;
	}

	public int getMetodoMonto() {
		return metodoMonto;
	}

	public void setMetodoMonto(int metodoMonto) {
		this.metodoMonto = metodoMonto;
	}
	
	
}
