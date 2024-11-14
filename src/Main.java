import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionUsuario = 0, opcionCliente = 0, opcionAdmin = 0;
		
		do {
			seleccionarUsuario(opcionUsuario);
			
			switch (opcionUsuario) {
			case 0:
				seleccionarOpcionCliente(opcionCliente);
				break;
			case 1:
				seleccionarOpcionAdmin(opcionAdmin);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Cerrando sistema...");
				break;
			}
			
		} while (opcionUsuario != 2);
		
	}
	
	public static int seleccionarUsuario(int opcion) {
		opcion = JOptionPane.showOptionDialog(null, "Selecciona el tipo de usuario", "Tipo de usuario", 1, 1, null, OpcionesUsuario.values(), OpcionesUsuario.values());
		return opcion;
	}
	
	public static int seleccionarOpcionCliente(int opcion) {
		opcion = JOptionPane.showOptionDialog(null, "Selecciona el tipo de usuario", "Tipo de usuario", 1, 1, null, OpcionesCliente.values(), OpcionesCliente.values());
		return opcion;
	}
	
	public static int seleccionarOpcionAdmin(int opcion) {
		opcion = JOptionPane.showOptionDialog(null, "Selecciona el tipo de usuario", "Tipo de usuario", 1, 1, null, OpcionesAdmin.values(), OpcionesAdmin.values());
		return opcion;
	}

}
