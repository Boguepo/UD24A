package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "Trabajadores")
public class TrabajadorDto {
	public enum trabajo {
		DESARROLLO, SISTEMAS, ADMINISTRACION, GESTION
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre;
	@Column
	private trabajo puesto;
	@Column
	private double sueldo;

	public TrabajadorDto() {

	}

	public TrabajadorDto(int id, String nombre, trabajo puesto, Double sueldo) {
		// super();
		this.id = id;
		this.nombre = nombre;
		this.puesto = puesto;
		this.sueldo = sueldo;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public trabajo getPuesto() {
		return puesto;
	}

	public void setPuesto(trabajo puesto) {
		switch (puesto) {
		case DESARROLLO:
			this.puesto = trabajo.DESARROLLO;
			this.sueldo = 16000;
			break;
		case SISTEMAS:
			this.puesto = trabajo.SISTEMAS;
			this.sueldo = 15000;
			break;
		case ADMINISTRACION:
			this.puesto = trabajo.ADMINISTRACION;
			this.sueldo = 12000;
			break;
		case GESTION:
			this.puesto = trabajo.GESTION;
			this.sueldo = 12500;
			break;
		
		}
		
	}
	

	public double getSueldo() {
		return sueldo;
	}


	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", sueldo=" + sueldo + "]";
	}

}
