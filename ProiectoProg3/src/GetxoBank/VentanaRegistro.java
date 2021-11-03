package GetxoBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame {
	
	private JComboBox comboProvincia;
	private static JComboBox<Integer> comboA�o;
	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textTelefono;
	private JTextField dni;
	private JTextField textPin;
	private JTextField textDni;
	private JFrame ventanaActual;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelSur = new JPanel();
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaActual.dispose();
				
				VentanaLogiin ventana = new VentanaLogiin();
				ventana.setVisible(true);
				
				
			}
		});
		panelSur.add(btnVolver);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		panelSur.add(btnFinalizar);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(10, 2, 0, 0));
		
		JLabel lblEmail = new JLabel(" E-MAIL");
		panelCentral.add(lblEmail);
		
		textEmail = new JTextField();
		panelCentral.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNombre = new JLabel(" NOMBRE");
		panelCentral.add(lblNombre);
		
		textNombre = new JTextField();
		panelCentral.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblDni = new JLabel("Dni");
		panelCentral.add(lblDni);
		
		textDni = new JTextField();
		panelCentral.add(textDni);
		textDni.setColumns(10);
		
		JLabel lblApellidos = new JLabel("APELLIDOS");
		panelCentral.add(lblApellidos);
		
		textApellidos = new JTextField();
		panelCentral.add(textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblTelefono = new JLabel("TELEFONO MOVIL");
		panelCentral.add(lblTelefono);
		
		textTelefono = new JTextField();
		panelCentral.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblPin = new JLabel("INTRODUZCA SU PIN");
		panelCentral.add(lblPin);
		
		textPin = new JTextField();
		panelCentral.add(textPin);
		textPin.setColumns(10);
		
		JLabel lblA�oNacimiento = new JLabel("A\u00D1O DE  NACIMIENTO");
		panelCentral.add(lblA�oNacimiento);
		
		
	
		
		
		
		JComboBox comboA�o = new JComboBox<Integer>();
		llenarComboFechas(comboA�o);
		
		
		panelCentral.add(comboA�o);
		
		JLabel lblProvincia = new JLabel("PROVINCIA");
		panelCentral.add(lblProvincia);
		
		JComboBox comboProvincia = new JComboBox();
		comboProvincia.setModel(new DefaultComboBoxModel(Provincia.values()));
		panelCentral.add(comboProvincia);
		
		 ventanaActual = this;
	}
	//METODOS
	public void comprobarEmail() {
		String datoRecibido = textEmail.getText();
		
	}
	public  boolean comprobarDni() {
		String datoRecibido = textDni.getText();
		String erDni = "[0-9] {8}[A-Z] {1}";
		boolean correctoDni = Pattern.matches(erDni, datoRecibido);
		return correctoDni;
		
		
	}
	public boolean comprobarNombre() {
		String datoRecibido = textNombre.getText();
		String erNombre = "[A-Z]";
		boolean correctoNombre = Pattern.matches(erNombre, datoRecibido);
		return correctoNombre;
	}
	public boolean comprobarTelelfono() {
		String datoRecibido = textTelefono.getText();
		String erTelefono = "[0-9] {9}";
		boolean correctoTelefono = Pattern.matches(erTelefono, datoRecibido);
		return correctoTelefono;
	}
	public void crearUsuario() {
		comprobarDni();
		comprobarEmail();
		comprobarNombre();
		comprobarTelelfono();
		//Usuario u = new Usuario();
		
		//Usuario  nuevoUsuario= new Usuario(textEmail.getText(), textNombre.getText(), textApellidos.getText(), textDni.getText(), comboA�o.getSelectedItem(), comboProvincia.getSelectedItem(), 0, 0, 0);
		
	}
	public void llenarComboFechas(JComboBox<Integer> combo) {
		// LLENAMOS EL COMBO BOX CON LOS ULTIMOS 100 A�OS
		int a�o = 2022;
		int i = 0;
		
		for(i = 0; i<100;i++) {
			a�o = a�o -1;
			combo.addItem(a�o);
			
		}
		
	}
	
	


}
