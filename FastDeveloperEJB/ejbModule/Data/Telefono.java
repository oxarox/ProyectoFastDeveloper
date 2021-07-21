package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "telefonos")
public class Telefono implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_telefono")
	private int idTelefono;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="tipo_user")
	private int tipoUser;
	
	@Column(name="id_usuario")
	private int idUsuario;

}
