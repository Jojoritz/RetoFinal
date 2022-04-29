package clases;

public class Admin extends Persona{
	private String email;

	public Admin(int id_p, String nomU, String contU, String nombre, String apellido, String email) {
		super(id_p, nomU, contU, nombre, apellido);
		this.email = email;
	}

	public Admin() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
