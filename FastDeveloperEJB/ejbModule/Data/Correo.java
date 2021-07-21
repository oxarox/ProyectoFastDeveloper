package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "correos")
public class Correo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_correo")
	private int idCorreo;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="id_tipo_user")
	private int idTipoUser;
	
	@Column(name="id_usuario")
	private int idUsuario;
	
	
	
	
	public int getIdCorreo() {
		return idCorreo;
	}
	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getIdTipoUser() {
		return idTipoUser;
	}
	public void setIdTipoUser(int idTipoUser) {
		this.idTipoUser = idTipoUser;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
	
}
