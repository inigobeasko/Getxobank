package GetxoBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {
	private static JFrame ventanaAnterior;
	private JFrame ventanaActual;
	private TreeMap<String,Usuario> tmUsuarios;
	private JPanel contentPane,panelCentral,panelSur;
	private JTextField textDni;
	private JPasswordField pinPersonal;
	private ImageIcon imagenSuperior;
	
	private JLabel lblTarjeta ;
	private JButton btnVolver,btnAcceder;
	private JRadioButton soloParaAdmins;
	private JButton btnRegistrarse;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin(ventanaAnterior);
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
	public VentanaLogin(JFrame va) {
		ventanaAnterior = va;
		ventanaActual = this;
		//CREAMOS UN USUARIO PARA QUE EL TREEMAP NO ESTE VACIO
		tmUsuarios = new TreeMap<String,Usuario>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(2, 2, 0, 0));
		
		lblTarjeta = new JLabel("A\u00F1ade tu DNI ------>");
		panelCentral.add(lblTarjeta);
		
		textDni = new JTextField();
		panelCentral.add(textDni);
		textDni.setColumns(10);
		
		JLabel lblContraseña = new JLabel("A\u00F1ade tu PIN personal --->");
		panelCentral.add(lblContraseña);
		
		pinPersonal = new JPasswordField();
		panelCentral.add(pinPersonal);
		
		panelSur = new JPanel();
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		btnVolver = new JButton("VOLVER");
		
		panelSur.add(btnVolver);
		
		btnAcceder = new JButton("ACCEDER");
		
		panelSur.add(btnAcceder);
		
		btnRegistrarse = new JButton("REGISTRARSE");
	
		panelSur.add(btnRegistrarse);
		
		soloParaAdmins = new JRadioButton("SOLO PARA ADMINS");
		panelSur.add(soloParaAdmins);
		
		
		
		
		
		

		
		
		
		
		
		
		
		/*********
		 * 
		 * 
		 * 
		 * EVENTOS
		 * 
		 * 
		 * 
		 * 
		 */
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaActual.dispose();
				VentanaRegistro ventanaRegistro = new VentanaRegistro();
				ventanaRegistro.setVisible(true);
				
			}
		});
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaActual.dispose();
				VentanaGetxoBank ventanaGetxoBank = new VentanaGetxoBank();
				ventanaGetxoBank.setVisible(true);
				
				
				
			}
		});
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erdni = "[0-9]{8}[A-Z]";
				String erContraseñaDni = "[0-9]{6}";
				
				String c = pinPersonal.getText();
				int z = Integer.parseInt(c);
				String d = textDni.getText();
				
				boolean correctoDni = Pattern.matches(erdni, d);
				boolean correctoContraseñaDni = Pattern.matches(erContraseñaDni, c);
				// COMPROBAMOS QUE ESTE EN EL TREEMAP
				
				
				//SI NO APARECE EN NUESTRA BASE DE DATOS
			
				if (correctoDni && correctoContraseñaDni) {// Comprobamos que el usuario introduzca bien los datos
					JOptionPane.showMessageDialog(null, "ESPERE UNOS SEGUNDOS ESTAMOS VERIFICANDO SUS DATOS","ESPERE",JOptionPane.WARNING_MESSAGE);
					
					for(String clave: tmUsuarios.keySet()) {
						Usuario valor = tmUsuarios.get(clave);
						int contraseñaValor = valor.getPIN();
					
						//SI YA ESTA REGISTRADO
						if (valor != null||contraseñaValor == z) {
							JOptionPane.showMessageDialog(null, "ESPERE UNOS SEGUNDOS ESTAMOS ACCEDIENDO ASU CUENTA","ESPERE",JOptionPane.INFORMATION_MESSAGE);
							ventanaActual.dispose();
							new VentanaGestion(valor, ventanaActual);
						//SI NO ESTA REGISTRADO
						}else {
							JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EN NUESTRA BASE DE DATOS , REGISTRESE","AVISO",JOptionPane.INFORMATION_MESSAGE);
							ventanaActual.dispose();
							VentanaRegistro ventanaregistro = new VentanaRegistro();
							
						}
						
						
					}
				// EN EL CASO DE QUE NO HAYA PUESTO BIEN LA CONTRASEÑA O EL DNI
				}else {
					JOptionPane.showMessageDialog(null, "El dni o la contraseña no son correctos", "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
					vaciarCampos();
				}
			}
		});	
		
	
		
	}
	
	//METODOS
	public void vaciarCampos() {
		textDni.setText("");
		pinPersonal.setText("");
		
		
	}
	public void añadirUsuarioAlTm(Usuario u) {
		tmUsuarios.put(u.getDni(), u);
		
		
	}
}
