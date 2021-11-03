package GetxoBank;

import java.util.TreeSet;

public class Usuario {
	private String email,nombre,apellidos,dni,fechaNacimiento,contraseñaUsuario;
	private Provincia provincia;
	private int numeroDeCuentas,saldoUsuario;
	private static TreeSet<Cuenta>tsCuentas;
	public Usuario(String email, String nombre, String apellidos, String dni, String fechaNacimiento,
			String contraseñaUsuario, Provincia provincia, int numeroDeCuentas, int saldoUsuario) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.contraseñaUsuario = contraseñaUsuario;
		this.provincia = provincia;
		this.numeroDeCuentas = numeroDeCuentas;
		this.saldoUsuario = saldoUsuario;
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
	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}
	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
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
	public int getSaldoUsuario() {
		return saldoUsuario;
	}
	public void setSaldoUsuario(int saldoUsuario) {
		this.saldoUsuario = saldoUsuario;
	}
	public static TreeSet<Cuenta> getTsCuentas() {
		return tsCuentas;
	}
	public static void setTsCuentas(TreeSet<Cuenta> tsCuentas) {
		Usuario.tsCuentas = tsCuentas;
	}
	

	

}
