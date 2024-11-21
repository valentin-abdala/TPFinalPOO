import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
		
		Cliente cliente = new Cliente("", "", 0, "", "", listaUsuarios, 0);
		
		int opcionUsuario = 1, opcionCliente = 1, opcionAdmin = 1;
		
		do {
			seleccionarUsuario(opcionUsuario);
			
			switch (opcionUsuario) {
			case 0:
				cliente.registrar();
				listaUsuarios.add(cliente);
				seleccionarOpcionCliente(opcionCliente);
				
				switch (opcionCliente) {
				case 0:
					
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Cerrando sesión...");
					break;
				}
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
		opcion = JOptionPane.showOptionDialog(null, "Selecciona el tipo de usuario.", "Tipo de usuario", 1, 1, null, OpcionesUsuario.values(), OpcionesUsuario.values());
		return opcion;
	}
	
	public static int seleccionarOpcionCliente(int opcion) {
		opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción.", "Menú Cliente", 1, 1, null, OpcionesCliente.values(), OpcionesCliente.values());
		return opcion;
	}
	
	public static int seleccionarOpcionAdmin(int opcion) {
		opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción.", "Menú Admin", 1, 1, null, OpcionesAdmin.values(), OpcionesAdmin.values());
		return opcion;
	}

}
