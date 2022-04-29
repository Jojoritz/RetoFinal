package clases;

import java.io.Serializable;

public class Persona implements Serializable{
	private int id_p;
	private String nomU;
	private String contU;
	private String nombre;
	private String apellido;
	
	public Persona(int id_p, String nomU, String contU, String nombre, String apellido) {
		super();
		this.id_p = id_p;
		this.nomU = nomU;
		this.contU = contU;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona() {
		super();
	}

	public int getId_p() {
		return id_p;
	}

	public void setId_p(int id_p) {
		this.id_p = id_p;
	}

	public String getNomU() {
		return nomU;
	}

	public void setNomU(String nomU) {
		this.nomU = nomU;
	}

	public String getContU() {
		return contU;
	}

	public void setContU(String contU) {
		this.contU = contU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
