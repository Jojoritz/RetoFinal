package vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import modelo.ControladorDatos;

public class VentanaPrincipal extends JFrame{

	private JPanel contentPane;
	JRadioButton cir1;
	JRadioButton cir2;
	private ButtonGroup grupoUsur = new ButtonGroup();
	private ControladorDatos datos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
		public VentanaPrincipal() {
		setIconImage(
		Toolkit.getDefaultToolkit().getImage("C:\\Users\\1dam\\Desktop\\logo reto final\\G2 carrefer.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("Entrar como:");
		label1.setBounds(45, 11, 96, 33);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(label1);

		cir1 = new JRadioButton("administrador");
		grupoUsur.add(cir1);
		cir1.setBounds(88, 51, 109, 23);
		contentPane.add(cir1);

		cir2 = new JRadioButton("Usuario");
		grupoUsur.add(cir2);
		cir2.setBounds(88, 83, 109, 23);
		contentPane.add(cir2);

		JButton btnsigui1 = new JButton("siguiente");
		btnsigui1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				siguiente();
			}
		});
		btnsigui1.setBounds(222, 123, 89, 23);
		contentPane.add(btnsigui1);
	}

	private void siguiente() {
		// TODO Auto-generated method stub
		if (cir1.isSelected()) {
			Ventana2 ven = new Ventana2();
			ven.setVisible(true);
		}else if(cir2.isSelected()) {
			Ventana4 ven2 = new Ventana4();
			ven2.setVisible(true);
		}
	}

}
