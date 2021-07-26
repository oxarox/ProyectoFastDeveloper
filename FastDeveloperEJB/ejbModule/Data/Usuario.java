package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity(name = "usuarios")
@NamedQueries({
    @NamedQuery(name="Usuario.getAll",query="select u from usuarios u")
})
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private int idUser;
	
	@Column(name="nombre_usuario")
	private String nombreUsuario;
	
	@Column(name="password")
	private String password;
	
	@Column(name="id_trabajador")
	private int id_trabajador;
	
	@Column(name="id_tipo_usuario")
	private int id_tipo_usuario;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId_trabajador() {
		return id_trabajador;
	}

	public void setId_trabajador(int id_trabajador) {
		this.id_trabajador = id_trabajador;
	}

	public int getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(int id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}
	
	
}
