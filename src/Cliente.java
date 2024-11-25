import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Cliente extends Usuario {
	private int nroTarjeta;
	
	public Cliente(String nombre, String apellido, int dni, String nombreUsuario, String contrasena,
			LinkedList<Usuario> listaUsuarios, int nroTarjeta) {
		super(nombre, apellido, dni, nombreUsuario, contrasena, listaUsuarios);
		this.nroTarjeta = nroTarjeta;
	}

	public int getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(int nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	@Override
	public String toString() {
		return "Cliente: " + nombreUsuario + " - DNI: " + dni + " - Número de tarjeta: " + nroTarjeta + "\n";
	}

	@Override
	public void registrar() {
		super.registrar();
		nroTarjeta = (int)(Math.random() * 90000) + 10000;
	}
	
	@Override
	public void verDatos(Cuenta cuenta, Estadistica estadistica) {
		super.verDatos(cuenta, estadistica);
		JOptionPane.showMessageDialog(null, "Datos del Cliente\n"
				+ "Nombre: " + nombre + "\n"
				+ "Apellido: " + apellido + "\n"
				+ "Nombre de usuario: " + nombreUsuario + "\n"
				+ "DNI: " + dni + "\n"
				+ "Contraseña: ·············\n"
				+ "______________________\n"
				+ "Datos de la cuenta\n"
				+ "Número de tarjeta: " + nroTarjeta + "\n"
				+ "Saldo: " + cuenta.getSaldo() + "\n"
				+ "Dinero transferido: " + estadistica.getDineroTransferido() + "\n"
				+ "Dinero depositado: " + estadistica.getDineroDepositado() + "\n"
				+ "Dinero retirado: " + estadistica.getDineroRetirado());
	}
	
}
