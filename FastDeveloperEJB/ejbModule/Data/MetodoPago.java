package Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "metodos_pagos")
public class MetodoPago implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_metodo")
	private int id_metodo;
	
	@Column(name="metodo")
	private String metodo;

	
	public int getId_metodo() {
		return id_metodo;
	}

	public void setId_metodo(int id_metodo) {
		this.id_metodo = id_metodo;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	
}
