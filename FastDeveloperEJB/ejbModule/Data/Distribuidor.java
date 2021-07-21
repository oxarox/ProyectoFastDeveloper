package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "distribuidores")
public class Distribuidor implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_distribuidor")
	private int idDistribuidor;
	
	@Column(name="rut_proveedor")
	private String rutProveedor;
	
	@Column(name="razon_social")
	private String razonSocial;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="id_comuna")
	private int idComuna;
	
	@Column(name="fono")
	private int fono;
	
	@Column(name="anno_primera_venta")
	private int annoPrimeraVenta;
	
	@Column(name="correo_electronico")
	private String correoElectronico;
	
	
}
