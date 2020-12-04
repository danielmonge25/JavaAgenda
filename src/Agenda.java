import java.awt.EventQueue;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agenda {

	JFrame frame;
	
	ImageIcon logo;
	ImageIcon contacto;
	ImageIcon evento;
	ImageIcon tarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda window = new Agenda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Agenda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Tarea #5, Daniel Monge Arce (B85017)");
		frame.setBounds(100, 100, 530, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		logo = new ImageIcon(getClass().getResource("logo.png"));
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(logo);
		lblLogo.setBounds(10, 11, 494, 68);
		frame.getContentPane().add(lblLogo);
		
		JButton btnEvento = new JButton("");
		evento = new ImageIcon(getClass().getResource("evento.png"));
		btnEvento.setIcon(evento);
		btnEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaEvento e = new VentanaEvento();
				e.setVisible(true);
				frame.dispose();
				
			}
		});
		btnEvento.setBounds(31, 117, 118, 44);
		frame.getContentPane().add(btnEvento);
		
		JButton btnContacto = new JButton("");
		btnContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaContacto c = new VentanaContacto();
				c.setVisible(true);
				frame.dispose();
				
			}
		});
		contacto = new ImageIcon(getClass().getResource("contacto.png"));
		btnContacto.setIcon(contacto);
		btnContacto.setBounds(192, 117, 118, 44);
		frame.getContentPane().add(btnContacto);
		
		JButton btnTarea = new JButton("");
		btnTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaTarea t = new VentanaTarea();
				t.setVisible(true);
				frame.dispose();
				
			}
		});
		tarea = new ImageIcon(getClass().getResource("tarea.png"));
		btnTarea.setIcon(tarea);
		btnTarea.setBounds(356, 117, 118, 44);
		frame.getContentPane().add(btnTarea);
		
		JLabel Nombre = new JLabel("Daniel Monge (B86017)");
		Nombre.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 11));
		Nombre.setBounds(386, 211, 118, 14);
		frame.getContentPane().add(Nombre);
	}
}
