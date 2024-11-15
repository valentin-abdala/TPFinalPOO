import java.util.LinkedList;

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
		return "Admin [idEmpleado=" + idEmpleado + ", banco=" + banco + "]";
	}
	
}
