package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "trabajadores")
public class Trabajador implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_trabajador")
	private int id_trabajador;
	
	@Column(name="din_Trabajador")
	private String din_Trabajador;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido_paterno")
	private String apellido_paterno;
	
	@Column(name="apellido_materno")
	private String apellido_materno;
	
	
}
