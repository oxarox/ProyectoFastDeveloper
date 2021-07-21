package Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.ForeignKey;

@Entity(name = "boletas")
public class Boleta implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_boleta")
	private int idBoleta;
	
	@Column(name="precio_neto")
	private int precioNeto;
	
	@Column(name="iva")
	private int iva;
	
	@Column(name="total")
	private int total;
	
	@Column(name="fecha_venta")
	private Date fechaVenta;
	
	@Column(name="hora_venta")
	private Date horaVenta;
	
	@OneToOne
	@JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "FK_TO_USER"))/*BUSCAR MAS INFORMACION DE COMO FUNCIONA EL FOREIGNKEY*/
	@Column(name="id_cliente")
	private int idCliente;
	
	@Column(name="id_usuario")
	private int idUsuario;
	
	
	
	
	public int getIdBoleta() {
		return idBoleta;
	}
	public void setIdBoleta(int idBoleta) {
		this.idBoleta = idBoleta;
	}
	public int getPrecioNeto() {
		return precioNeto;
	}
	public void setPrecioNeto(int precioNeto) {
		this.precioNeto = precioNeto;
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
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Date getHoraVenta() {
		return horaVenta;
	}
	public void setHoraVenta(Date horaVenta) {
		this.horaVenta = horaVenta;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
