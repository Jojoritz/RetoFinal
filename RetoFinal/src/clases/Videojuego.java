package clases;

import java.time.LocalDate;

public class Videojuego extends Articulo{
	private String titulo;
	private String genero;
	private int pegi;
	private Boolean goty;
	
	public Videojuego(int id_a, String empresa, float precio, LocalDate fecha_estreno, float precio_coste,
			String titulo, String genero, int pegi, Boolean goty) {
		super(id_a, empresa, precio, fecha_estreno, precio_coste);
		this.titulo = titulo;
		this.genero = genero;
		this.pegi = pegi;
		this.goty = goty;
	}

	public Videojuego() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPegi() {
		return pegi;
	}

	public void setPegi(int pegi) {
		this.pegi = pegi;
	}

	public Boolean getGoty() {
		return goty;
	}

	public void setGoty(Boolean goty) {
		this.goty = goty;
	}
}
