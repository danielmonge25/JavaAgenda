import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaContacto extends JFrame {

	private JPanel contentPane;
	ImageIcon agregar;
	ImageIcon atras;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JTextField txtTelefono;

	public VentanaContacto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Contactos");
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 464, 221);
		contentPane.add(textArea);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 270, 53, 14);
		contentPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono:\r\n");
		lblTelefono.setBounds(161, 270, 61, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo:\r\n");
		lblCorreo.setBounds(10, 318, 46, 14);
		contentPane.add(lblCorreo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(65, 267, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(55, 315, 167, 20);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(231, 267, 86, 20);
		contentPane.add(txtTelefono);
		
		JButton btnAgregar = new JButton("");
		agregar = new ImageIcon(getClass().getResource("Agregar.png"));
		btnAgregar.setIcon(agregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = txtNombre.getText();
				String telefono = txtTelefono.getText();
				String correo = txtCorreo.getText();
				
				String total = nombre + " " + telefono + " " + correo;
				
				textArea.append(total + "\n");
				
			}
		});
		btnAgregar.setBounds(356, 243, 118, 44);
		
		contentPane.add(btnAgregar);
		
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Agenda window = new Agenda();
				window.frame.setVisible(true);
				dispose();
				
			}
		});
		atras = new ImageIcon(getClass().getResource("atras.png"));
		btnAtras.setIcon(atras);
		btnAtras.setBounds(356, 298, 118, 44);
		contentPane.add(btnAtras);
	}

}
