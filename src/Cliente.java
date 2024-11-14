import java.util.LinkedList;

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
		return "Cliente [nroTarjeta=" + nroTarjeta + "]";
	}
	
}
