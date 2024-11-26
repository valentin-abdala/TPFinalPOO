import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Admin extends Usuario {
	private int idEmpleado;
	private Banco banco;
	
	public Admin(String nombre, String apellido, int dni, String nombreUsuario, String contrasena,
			LinkedList<Usuario> listaUsuarios, int idEmpleado, Banco banco) {
		super(nombre, apellido, dni, nombreUsuario, contrasena, listaUsuarios);
		this.idEmpleado = idEmpleado;
		this.banco = banco;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "Cliente: " + nombreUsuario + " - DNI: " + dni + " - ID empleado: " + idEmpleado + "\n";
	}

	@Override
	public void registrar() {
		super.registrar();
		idEmpleado = (int)(Math.random() * 900) + 100;
	}

	@Override
	public void verDatos(Cuenta cuenta, Estadistica estadistica, Banco banco) {
		super.verDatos(cuenta, estadistica, banco);
		JOptionPane.showMessageDialog(null, "Datos del Admin\n"
				+ "Nombre: " + nombre + "\n"
				+ "Apellido: " + apellido + "\n"
				+ "Nombre de usuario: " + nombreUsuario + "\n"
				+ "DNI: " + dni + "\n"
				+ "Contraseña: ·············\n"
				+ "______________________\n"
				+ "Datos del Banco\n"
				+ "Nombre: " + banco.getNombre() + "\n"
				+ "Número movimientos: " + estadistica.getnroMovimientos() + "\n"
				+ "Clientes registrados: " + estadistica.getClientesRegistrados() + "\n"
				+ "Dinero en movimiento: " + estadistica.getDineroEnMovimiento());
	}
	
}
