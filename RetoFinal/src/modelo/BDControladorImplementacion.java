package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.ResourceBundle;

import clases.Consola;
import clases.Videojuego;

public class BDControladorImplementacion implements ControladorDatos{
	
	private Connection con;
	private PreparedStatement stmt;
	
	private ResourceBundle configFile;
	private String driverBD;
	private String urlBD;
	private String userBD;
	private String passwordBD;
	
	final String INSERTjuego = "INSERT INTO articulo(id_a, empresa, precio, fecha_estreno, tipo, precioCoste) VALUES( ?, ?, ?, ?, ?, ?)";
	
	public void ControladorBDImplementacion() {

		this.configFile = ResourceBundle.getBundle("modelo.configClase");
		this.driverBD = this.configFile.getString("Driver");
		this.urlBD = this.configFile.getString("Conn");
		this.userBD = this.configFile.getString("DBUser");
		this.passwordBD = this.configFile.getString("DBPass");
	}
	
	private void openConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/retofinal?serverTimezone=Europe/Madrid&useSSL=false");
		} catch (SQLException e) {
			System.out.println("Error al intentar abrir la BD");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("aaaaaaaaaaaaqui");
			e.printStackTrace();
		}
	}
	
	private void closeConnection() throws SQLException {
		if (stmt != null) {
			stmt.close();
		}
		if (con != null)
			con.close();
	}
	
	public void insertarJuegos(Videojuego jue) {
		this.openConnection();
		
		try {
			stmt = con.prepareStatement(INSERTjuego);
			
			stmt.setInt(1, jue.getId_a());
			stmt.setString(2, jue.getEmpresa());
			stmt.setFloat(3, jue.getPrecio());
			stmt.setDate(4, Date.valueOf(jue.getFecha_estreno()));
			stmt.setFloat(5, jue.getPrecio_coste());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				this.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void borrarJuegos(Videojuego jue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarJuegos(Videojuego jue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Videojuego> listarJuegos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarConsolas(Consola con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarConsolas(Consola con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarConsolas(Consola con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Consola> listarConsola() {
		// TODO Auto-generated method stub
		return null;
	}
}
