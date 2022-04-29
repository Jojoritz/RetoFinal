package clases;

public class Cliente extends Persona{
	private int telefono;
	private String direccion;
	private int tarjeta;
	
	public Cliente(int id_p, String nomU, String contU, String nombre, String apellido, int telefono, String direccion,
			int tarjeta) {
		super(id_p, nomU, contU, nombre, apellido);
		this.telefono = telefono;
		this.direccion = direccion;
		this.tarjeta = tarjeta;
	}

	public Cliente() {
		super();
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}
}
