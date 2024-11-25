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
	
}
