package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "detalles_facturas")
public class DetalleFactura implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_detallefact")
	private int idDetallefact;
	
	@Column(name="id_factura")
	private int idFactura;
	
	@Column(name="cod_isbn")
	private String cod_isbn;
	
	@Column(name="precio_compra")
	private int precioCompra;
	
	@Column(name="cantidad")
	private int cantidad;
	
	
	
	public int getIdDetallefact() {
		return idDetallefact;
	}
	public void setIdDetallefact(int idDetallefact) {
		this.idDetallefact = idDetallefact;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getCod_isbn() {
		return cod_isbn;
	}
	public void setCod_isbn(String cod_isbn) {
		this.cod_isbn = cod_isbn;
	}
	public int getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
