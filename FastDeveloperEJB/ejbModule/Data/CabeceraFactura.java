package Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cabecera_facturas")
public class CabeceraFactura implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_factura")
	private int idFactura;
	
	@Column(name="id_proveedor")
	private int idProveedor;
	
	@Column(name="num_factura")
	private int numFactura;
	
	@Column(name="fecha_factura")
	private Date fechaFactura;
	
	@Column(name="total_neto")
	private int totalNeto;

	@Column(name="iva")
	private int iva;
	
	@Column(name="total")
	private int total;
	
	
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public int getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public int getTotalNeto() {
		return totalNeto;
	}
	public void setTotalNeto(int totalNeto) {
		this.totalNeto = totalNeto;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
