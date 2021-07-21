package Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "prestamos")
public class Prestamo implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_prestamo")
	private int idPrestamo;
	
	@Column(name="id_cliente")
	private int idCliente;
	
	@Column(name="id_trabajador")
	private int idTrabajador;
	
	@Column(name="fecha_prestamos")
	private Date fechaPrestamos;
	
	@Column(name="fecha_devolucion")
	private Date fechaDevolucion;
	
	@Column(name="id_copia_libro")
	private int idCopiaLibro;
	
	@Column(name="dias_arriendo")
	private int diasArriendo;
	
	@Column(name="id_precio_arriendo")
	private int idPrecioArriendo;

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public Date getFechaPrestamos() {
		return fechaPrestamos;
	}

	public void setFechaPrestamos(Date fechaPrestamos) {
		this.fechaPrestamos = fechaPrestamos;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public int getIdCopiaLibro() {
		return idCopiaLibro;
	}

	public void setIdCopiaLibro(int idCopiaLibro) {
		this.idCopiaLibro = idCopiaLibro;
	}

	public int getDiasArriendo() {
		return diasArriendo;
	}

	public void setDiasArriendo(int diasArriendo) {
		this.diasArriendo = diasArriendo;
	}

	public int getIdPrecioArriendo() {
		return idPrecioArriendo;
	}

	public void setIdPrecioArriendo(int idPrecioArriendo) {
		this.idPrecioArriendo = idPrecioArriendo;
	}

}
