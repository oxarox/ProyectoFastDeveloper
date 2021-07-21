package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "direcciones")
public class Direccion implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_direccion")
	private int idDireccion;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="id_comuna")
	private int idComuna;
	
	@Column(name="tipo_user")
	private int tipoUser;
	
	@Column(name="id_usuario")
	private int idUsuario;

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIdComuna() {
		return idComuna;
	}

	public void setIdComuna(int idComuna) {
		this.idComuna = idComuna;
	}

	public int getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(int tipoUser) {
		this.tipoUser = tipoUser;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
		
}
