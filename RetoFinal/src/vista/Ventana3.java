package vista;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.ControladorDatos;

public class Ventana3 extends JDialog{

	private final JPanel contentPanel = new JPanel();
	private ControladorDatos datos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventana3 dialog = new Ventana3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventana3() {
		setBounds(100, 100, 450, 342);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrador");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(148, 11, 154, 25);
		contentPanel.add(lblNewLabel);
		
		JButton btnInsertarJuegos = new JButton("insertarJuegos");
		btnInsertarJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarJuegos();
			}
		});
		btnInsertarJuegos.setBounds(64, 57, 120, 49);
		contentPanel.add(btnInsertarJuegos);
		
		JButton btnInsertarconsolas = new JButton("insertarConsolas");
		btnInsertarconsolas.setBounds(243, 57, 120, 49);
		contentPanel.add(btnInsertarconsolas);
		
		JButton btnBorrarconsolas = new JButton("borrarConsolas");
		btnBorrarconsolas.setBounds(243, 125, 120, 49);
		contentPanel.add(btnBorrarconsolas);
		
		JButton btnBorrarjuegos = new JButton("borrarJuegos");
		btnBorrarjuegos.setBounds(64, 125, 120, 49);
		contentPanel.add(btnBorrarjuegos);
		
		JButton btnModificarjuegos = new JButton("modificarJuegos");
		btnModificarjuegos.setBounds(64, 201, 120, 49);
		contentPanel.add(btnModificarjuegos);
		
		JButton btnBorrarconsolas_1 = new JButton("borrarConsolas");
		btnBorrarconsolas_1.setBounds(243, 201, 120, 49);
		contentPanel.add(btnBorrarconsolas_1);
		
		JButton btnVolver = new JButton("salir");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();
			}
		});
		btnVolver.setBounds(23, 269, 89, 23);
		contentPanel.add(btnVolver);
	}

	private void insertarJuegos() {
		// TODO Auto-generated method stub
		VentanaJuegos inser = new VentanaJuegos();
		inser.setVisible(true);
	}
	
	private void volver() {
		// TODO Auto-generated method stub
		this.dispose();
	}
}
