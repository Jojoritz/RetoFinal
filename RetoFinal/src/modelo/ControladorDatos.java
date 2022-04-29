package modelo;

import java.util.Map;

import clases.Consola;
import clases.Videojuego;

public interface ControladorDatos {
	public void insertarJuegos(Videojuego jue);
	public void borrarJuegos(Videojuego jue);
	public void modificarJuegos(Videojuego jue);
	public Map<String, Videojuego> listarJuegos();
	public void insertarConsolas(Consola con);
	public void borrarConsolas(Consola con);
	public void modificarConsolas(Consola con);
	public Map<String, Consola> listarConsola();
}
