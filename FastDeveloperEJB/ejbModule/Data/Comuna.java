package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "comuna")
public class Comuna implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_comuna")
	private int idComuna;
	
	@Column(name="nombre_comuna")
	private String nombreComuna;
	
	
	
	public int getIdComuna() {
		return idComuna;
	}
	public void setIdComuna(int idComuna) {
		this.idComuna = idComuna;
	}
	public String getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
}
