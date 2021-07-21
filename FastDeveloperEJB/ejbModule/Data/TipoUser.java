package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_user")
public class TipoUser implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_user")
	private int idTipoUser;
	
	@Column(name="descripcion")
	private String descripcion;

	public int getIdTipoUser() {
		return idTipoUser;
	}

	public void setIdTipoUser(int idTipoUser) {
		this.idTipoUser = idTipoUser;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
