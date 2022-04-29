package clases;

import java.io.Serializable;
import java.time.LocalDate;

public class Articulo implements Serializable{
	private int id_a;
	private String empresa;
	private float precio;
	private LocalDate fecha_estreno;
	private float precio_coste;
	
	public Articulo(int id_a, String empresa, float precio, LocalDate fecha_estreno, float precio_coste) {
		super();
		this.id_a = id_a;
		this.empresa = empresa;
		this.precio = precio;
		this.fecha_estreno = fecha_estreno;
		this.precio_coste = precio_coste;
	}

	public Articulo() {
		super();
	}

	public int getId_a() {
		return id_a;
	}

	public void setId_a(int id_a) {
		this.id_a = id_a;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public LocalDate getFecha_estreno() {
		return fecha_estreno;
	}

	public void setFecha_estreno(LocalDate fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}

	public float getPrecio_coste() {
		return precio_coste;
	}

	public void setPrecio_coste(float precio_coste) {
		this.precio_coste = precio_coste;
	}
}
