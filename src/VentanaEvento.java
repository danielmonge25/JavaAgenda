import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaEvento extends JFrame {

	private JPanel contentPane;
	ImageIcon agregar;
	ImageIcon atras;
	private JTextField txtFecha;
	private JTextField txtNombre;
	private JTextField txtLugar;
	private JTextField txtPrioridad;

	public VentanaEvento() {
		setTitle("Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 464, 221);
		contentPane.add(textArea);
		
		JButton btnAgregar = new JButton("");
		agregar = new ImageIcon(getClass().getResource("Agregar.png"));
		btnAgregar.setIcon(agregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = txtNombre.getText();
				String fecha = txtFecha.getText();
				String lugar = txtLugar.getText();
				String prioridad = txtPrioridad.getText();
				
				String total = nombre + " " + fecha + " " + lugar + " " + prioridad;
				textArea.append(total + "\n");
				
			}
		});
		btnAgregar.setBounds(356, 243, 118, 44);
		contentPane.add(btnAgregar);
		
		JLabel lblNewLabel = new JLabel("Fecha:");
		lblNewLabel.setBounds(10, 258, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 313, 58, 14);
		contentPane.add(lblNombre);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setBounds(167, 258, 46, 14);
		contentPane.add(lblLugar);
		
		JLabel lblPrioridad = new JLabel("Prioridad:");
		lblPrioridad.setBounds(167, 313, 58, 14);
		contentPane.add(lblPrioridad);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(66, 255, 86, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(66, 310, 86, 20);
		contentPane.add(txtNombre);
		
		txtLugar = new JTextField();
		txtLugar.setColumns(10);
		txtLugar.setBounds(236, 255, 86, 20);
		contentPane.add(txtLugar);
		
		txtPrioridad = new JTextField();
		txtPrioridad.setColumns(10);
		txtPrioridad.setBounds(236, 310, 86, 20);
		contentPane.add(txtPrioridad);
		
		JButton btnAtras = new JButton("");
		atras = new ImageIcon(getClass().getResource("atras.png"));
		btnAtras.setIcon(atras);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Agenda window = new Agenda();
				window.frame.setVisible(true);
				dispose();
				
			}
		});
		btnAtras.setBounds(356, 309, 118, 44);
		contentPane.add(btnAtras);
	}

}
