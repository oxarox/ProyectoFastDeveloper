package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "usuarios")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private int id_user;
	
	@Column(name="password")
	private int password;
	
	@Column(name="id_trabajador")
	private int id_trabajador;
	
	@Column(name="id_tipo_usuario")
	private int id_tipo_usuario;
}
