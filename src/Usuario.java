import java.util.LinkedList;

import javax.swing.JOptionPane;

public abstract class Usuario {
	private String nombre;
	private String apellido;
	protected int dni;
	protected String nombreUsuario;
	private String contrasena;
	private LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
	
	public Usuario(String nombre, String apellido, int dni, String nombreUsuario, String contrasena,
			LinkedList<Usuario> listaUsuarios) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.listaUsuarios = listaUsuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public LinkedList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(LinkedList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nombreUsuario="
				+ nombreUsuario + ", contrasena=" + contrasena + ", listaUsuarios=" + listaUsuarios + "]";
	}
	
	public void registrar() {
		nombre = validarCadena(JOptionPane.showInputDialog("Ingresa tu nombre."));
		apellido = validarCadena(JOptionPane.showInputDialog("Ingresa tu apellido."));
		dni = validarInteger(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu DNI.")));
		nombreUsuario = (nombre.substring(0, 1) + apellido).toLowerCase();
		contrasena = validarCadena(JOptionPane.showInputDialog("Ingresa tu contraseña."));
		String contrasena2 = validarCadena(JOptionPane.showInputDialog("Confirma tu contraseña."));
		while (!contrasena.equals(contrasena2)) {
			contrasena2 = validarCadena(JOptionPane.showInputDialog("Error: Las contraseñas no coinciden. Reingresa tu contraseña."));
		}
		
	}
	
	public String validarCadena(String cadena) {
		while (cadena.isEmpty()) {
			cadena = JOptionPane.showInputDialog("Error. Reingresa los datos.");
		}
		return cadena;
	}
	
	public int validarInteger(int numero) {
		while (numero < 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Error. Reingresa los datos."));
		}
		return numero;
	}
}
