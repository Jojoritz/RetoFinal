package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Videojuego;
import modelo.BDControladorImplementacion;
import modelo.ControladorDatos;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaJuegos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField textTitulo;
	private JTextField txtEmpresa;
	private JTextField txtPrecio;
	private JTextField txtFechaDeSalida;
	private JTextField txtPegi;
	private JTextField textEmpresa;
	private JTextField textPrecio;
	private JTextField textFecha;
	private JComboBox comboPegi;
	private JCheckBox chckbxGOTY;
	private JButton btnNewButton;
	private JTextField txtPrecioCoste;
	private JTextField textPrecioCos;
	private ControladorDatos datos;
	private JTextField txtId;
	private JTextField textID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaJuegos dialog = new VentanaJuegos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaJuegos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\1dam\\Desktop\\G2Carrefurro.PNG"));
		setBounds(100, 100, 531, 288);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtNombre = new JTextField();
			txtNombre.setEditable(false);
			txtNombre.setText("Titulo:");
			txtNombre.setBounds(10, 42, 49, 20);
			contentPanel.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			textTitulo = new JTextField();
			textTitulo.setBounds(129, 42, 199, 20);
			contentPanel.add(textTitulo);
			textTitulo.setColumns(10);
		}
		{
			txtEmpresa = new JTextField();
			txtEmpresa.setEditable(false);
			txtEmpresa.setText("Empresa:");
			txtEmpresa.setBounds(10, 73, 54, 20);
			contentPanel.add(txtEmpresa);
			txtEmpresa.setColumns(10);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setText("Precio:");
			txtPrecio.setBounds(10, 104, 42, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtFechaDeSalida = new JTextField();
			txtFechaDeSalida.setEditable(false);
			txtFechaDeSalida.setText("Fecha de Salida:");
			txtFechaDeSalida.setBounds(10, 135, 92, 20);
			contentPanel.add(txtFechaDeSalida);
			txtFechaDeSalida.setColumns(10);
		}
		{
			txtPegi = new JTextField();
			txtPegi.setEditable(false);
			txtPegi.setText("Pegi:");
			txtPegi.setBounds(10, 193, 33, 20);
			contentPanel.add(txtPegi);
			txtPegi.setColumns(10);
		}
		{
			textEmpresa = new JTextField();
			textEmpresa.setColumns(10);
			textEmpresa.setBounds(129, 73, 199, 20);
			contentPanel.add(textEmpresa);
		}
		{
			textPrecio = new JTextField();
			textPrecio.setColumns(10);
			textPrecio.setBounds(129, 104, 199, 20);
			contentPanel.add(textPrecio);
		}
		{
			textFecha = new JTextField();
			textFecha.setColumns(10);
			textFecha.setBounds(129, 135, 199, 20);
			contentPanel.add(textFecha);
		}
		
		comboPegi = new JComboBox();
		comboPegi.setBounds(129, 192, 199, 22);
		contentPanel.add(comboPegi);
		comboPegi.addItem("3");
		comboPegi.addItem("7");
		comboPegi.addItem("12");
		comboPegi.addItem("16");
		comboPegi.addItem("18");
		comboPegi.setSelectedIndex(-1);
		
		chckbxGOTY = new JCheckBox("GOTY");
		chckbxGOTY.setBounds(129, 221, 97, 23);
		contentPanel.add(chckbxGOTY);
		
		JButton btnInsertar = new JButton("Insertar Juegos");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				introducirUnJuego(datos);
			}
		});
		btnInsertar.setBounds(366, 11, 115, 32);
		contentPanel.add(btnInsertar);
		
		JButton btnBorrar = new JButton("Borrar Juegos");
		btnBorrar.setBounds(366, 54, 115, 32);
		contentPanel.add(btnBorrar);
		
		JButton btnModif = new JButton("Modificar Juegos");
		btnModif.setBounds(366, 97, 115, 32);
		contentPanel.add(btnModif);
		
		JButton btnLimpiar = new JButton("Limpiar Datos");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setBounds(366, 140, 115, 32);
		contentPanel.add(btnLimpiar);
		{
			btnNewButton = new JButton("Volver");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					volver();
				}
			});
			btnNewButton.setBounds(366, 187, 115, 51);
			contentPanel.add(btnNewButton);
		}
		{
			txtPrecioCoste = new JTextField();
			txtPrecioCoste.setEditable(false);
			txtPrecioCoste.setText("Precio Coste:");
			txtPrecioCoste.setBounds(10, 164, 72, 20);
			contentPanel.add(txtPrecioCoste);
			txtPrecioCoste.setColumns(10);
		}
		{
			textPrecioCos = new JTextField();
			textPrecioCos.setBounds(129, 166, 199, 20);
			contentPanel.add(textPrecioCos);
			textPrecioCos.setColumns(10);
		}
		{
			txtId = new JTextField();
			txtId.setEditable(false);
			txtId.setText("ID:");
			txtId.setBounds(10, 11, 27, 20);
			contentPanel.add(txtId);
			txtId.setColumns(10);
		}
		{
			textID = new JTextField();
			textID.setBounds(129, 11, 199, 20);
			contentPanel.add(textID);
			textID.setColumns(10);
		}
	}

	private void introducirUnJuego(ControladorDatos datos) {
		// TODO Auto-generated method stub
		//Recogemos la información de la pantalla en un objeto
		Videojuego juego = new Videojuego();
		juego.setId_a(Integer.parseInt(textID.getText()));
		juego.setTitulo(textTitulo.getText());
		juego.setEmpresa(textEmpresa.getText());
		juego.setPrecio(Float.parseFloat(textPrecio.getText()));
		juego.setFecha_estreno(LocalDate.parse(textFecha.getText()));
		juego.setPrecio_coste(Float.parseFloat(textPrecioCos.getText()));
		juego.setPegi(comboPegi.getSelectedIndex());
	}
	
	private void limpiar() {
		// TODO Auto-generated method stub
		textID.setText(" ");
		textTitulo.setText(" ");
		textEmpresa.setText(" ");
		textPrecio.setText(" ");
		textFecha.setText(" ");
		textPrecioCos.setText(" ");
		comboPegi.setSelectedIndex(-1);
		chckbxGOTY.setSelected(false);
	}
	
	private void volver() {
		// TODO Auto-generated method stub
		this.dispose();
	}
}
