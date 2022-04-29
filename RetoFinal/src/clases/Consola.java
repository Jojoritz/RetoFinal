package clases;

import java.time.LocalDate;

public class Consola extends Articulo{
	private String nombre;
	private String generacion;
	private String capacidad;
	
	public Consola(int id_a, String empresa, float precio, LocalDate fecha_estreno, float precio_coste,
			String nombre, String generacion, String capacidad) {
		super(id_a, empresa, precio, fecha_estreno, precio_coste);
		this.nombre = nombre;
		this.generacion = generacion;
		this.capacidad = capacidad;
	}

	public Consola() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
}
