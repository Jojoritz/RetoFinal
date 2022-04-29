package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.ControladorDatos;

public class Ventana2 extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField textUsu1;
	private JButton btnSiguiente;
	private JPasswordField con1;
	private JButton btnVolver;
	private ControladorDatos datos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventana2 dialog = new Ventana2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */	
	public Ventana2() {
		setBounds(100, 100, 431, 244);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel labelUsu1 = new JLabel("Usuario");
			labelUsu1.setBounds(77, 59, 55, 14);
			contentPanel.add(labelUsu1);
		}
		{
			JLabel labelCon2 = new JLabel("Contrase\u00F1a");
			labelCon2.setBounds(77, 96, 76, 14);
			contentPanel.add(labelCon2);
		}
		{
			textUsu1 = new JTextField();
			textUsu1.setBounds(156, 56, 103, 20);
			contentPanel.add(textUsu1);
			textUsu1.setColumns(10);
		}
		{
			btnVolver = new JButton("volver");
			btnVolver.addActionListener(this);
			btnVolver.setBounds(30, 161, 89, 23);
			contentPanel.add(btnVolver);
		}
		{
			btnSiguiente = new JButton("siguiente");
			btnSiguiente.addActionListener(this);
			btnSiguiente.setBounds(290, 161, 89, 23);
			contentPanel.add(btnSiguiente);
		}
		{
			con1 = new JPasswordField();
			con1.setBounds(156, 93, 103, 20);
			contentPanel.add(con1);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String ususario = "admin";
				String contra = "admin";
				
				if(e.getSource().equals(btnSiguiente)) {
					if(textUsu1.getText().equalsIgnoreCase(ususario) && con1.getText().equalsIgnoreCase(contra)) {
						Ventana3 ven3 = new Ventana3();
						ven3.setVisible(true);
					}else {
						VentanaError err = new VentanaError();
						err.setVisible(true);
					}
				}
				if(e.getSource().equals(btnVolver)) {
					this.dispose();
				}
	}
}
