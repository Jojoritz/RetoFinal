package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventana4 dialog = new Ventana4();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventana4() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Busqueda de Juegos");
		btnNewButton.setBounds(31, 105, 165, 50);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Busqueda de Consolas");
		btnNewButton_1.setBounds(234, 105, 165, 50);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btnNewButton_2.setBounds(31, 214, 89, 23);
		contentPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Iniciar Sesion");
		btnNewButton_3.setBounds(213, 11, 112, 23);
		contentPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Registrarse");
		btnNewButton_4.setBounds(335, 11, 89, 23);
		contentPanel.add(btnNewButton_4);
	}

	private void salir() {
		// TODO Auto-generated method stub
		this.dispose();
	}
}
