import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
		LinkedList<Transferencia> movimientos = new LinkedList<Transferencia>();
		Estadistica estadisticas = new Estadistica(0, 0, 0, 0, 0, 0);
		Banco banco = new Banco("", estadisticas);
		Cliente cliente = new Cliente("", "", 0, "", "", listaUsuarios, 0);
		Admin admin = new Admin(null, null, 0, null, null, listaUsuarios, 0, banco);
		
		
		int opcionUsuario = 0, opcionCliente = 0, opcionAdmin = 0;
		
		do {
			opcionUsuario = seleccionarUsuario(opcionUsuario);
			
			switch (opcionUsuario) {
			case 0:
				cliente.registrar();
				listaUsuarios.add(cliente);
				opcionCliente = seleccionarOpcionCliente(opcionCliente);
				
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
				admin.registrar();
				listaUsuarios.add(cliente);
				seleccionarOpcionAdmin(opcionAdmin);
				
				switch (opcionAdmin) {
				case 0:
					
					break;
				case 1:
					
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Cerrando sesión...");
					break;
				}
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
