package GetxoBank;

import java.util.TreeSet;

public class Usuario {
	private String email,nombre,apellidos,dni,fechaNacimiento;
	private Provincia provincia;
	private int numeroDeCuentas,saldoUsuario,PIN;
	private static TreeSet<Cuenta>tsCuentas;
	public Usuario() {
	}
	public Usuario(String email, String nombre, String apellidos, String dni, String fechaNacimiento,
			Provincia provincia, int numeroDeCuentas, int saldoUsuario, int pIN) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
		this.numeroDeCuentas = numeroDeCuentas;
		this.saldoUsuario = saldoUsuario;
		PIN = pIN;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public int getNumeroDeCuentas() {
		return numeroDeCuentas;
	}
	public void setNumeroDeCuentas(int numeroDeCuentas) {
		this.numeroDeCuentas = numeroDeCuentas;
	}
	
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	
	//Metodo para obtener el saldo total del usuario
	
	/**public int getSaldoUsuario() {
		saldoUsuario = 0;
		
		
		for (cuenta:tsCuentas) {
			saldoUsuario = saldoUsuario + cuenta.getSaldo;
			
		};
		return saldoUsuario;
	}**/
	
	



	

}
