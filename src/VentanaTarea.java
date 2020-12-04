import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaTarea extends JFrame {

	private JPanel contentPane;
	ImageIcon agregar;
	ImageIcon atras;
	private JTextField txtNombre;
	private JTextField txtPrioridad;

	public VentanaTarea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 464, 221);
		contentPane.add(textArea);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(10, 264, 67, 14);
		contentPane.add(label);
		
		JLabel lblPrioridad = new JLabel("Prioridad:");
		lblPrioridad.setBounds(10, 313, 67, 14);
		contentPane.add(lblPrioridad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(87, 261, 101, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPrioridad = new JTextField();
		txtPrioridad.setColumns(10);
		txtPrioridad.setBounds(87, 310, 101, 20);
		contentPane.add(txtPrioridad);
		
		JButton btnAgregar = new JButton("");
		agregar = new ImageIcon(getClass().getResource("Agregar.png"));
		btnAgregar.setIcon(agregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = txtNombre.getText();
				String prioridad = txtPrioridad.getText();
				
				String total = nombre + " " + prioridad;
				
				textArea.append(total + "\n");
				
			}
		});
		btnAgregar.setBounds(343, 243, 118, 44);
		contentPane.add(btnAgregar);
		
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
		btnAtras.setBounds(343, 298, 118, 44);
		contentPane.add(btnAtras);
	}

}
