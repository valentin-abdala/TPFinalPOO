import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
		LinkedList<Transferencia> movimientos = new LinkedList<Transferencia>();
		Estadistica estadisticas = new Estadistica(0, 2, 0, 0, 0, 0);
		Banco banco = new Banco("AbdaBank", estadisticas);
		Cliente valen = new Cliente("Valentín", "Abdala", 46293877, "vabdala", "valen123", listaUsuarios, 47869);
		Cuenta cuentaValen = new Cuenta(valen, 2000, estadisticas);
		listaUsuarios.add(valen);
		Cliente profe = new Cliente("Gamaliel", "Quiroz", 0, "gquiroz", "gama123", listaUsuarios, 78934);
		Cuenta cuentaProfe = new Cuenta(profe, 4500, estadisticas);
		listaUsuarios.add(profe);
		Cliente cliente = new Cliente("", "", 0, "", "", listaUsuarios, 0);
		Cuenta cuenta = new Cuenta(cliente, 0, estadisticas);
		Transferencia transferencia = new Transferencia(cuenta, cuenta, 0, null, null);
		Admin admin = new Admin("", "", 0, "", "", listaUsuarios, 0, banco);
		
		int opcionUsuario = 0, opcionCliente = 0, opcionAdmin = 0;
		
		do {
			opcionUsuario = seleccionarUsuario(opcionUsuario);
			
			switch (opcionUsuario) {
			case 0:
				cliente.registrar();
				listaUsuarios.add(cliente);
				estadisticas.setClientesRegistrados(estadisticas.getClientesRegistrados() + 1);
				do {				
					opcionCliente = seleccionarOpcionCliente(opcionCliente);
					
					switch (opcionCliente) {
					case 0:
						transferencia.transferir(cliente, valen, profe, cuentaValen, cuentaProfe, estadisticas);
						
						if (transferencia.transferir(cliente, valen, profe, cuentaValen, cuentaProfe, estadisticas)) {
							movimientos.add(transferencia);
							JOptionPane.showMessageDialog(null, movimientos);
						}
						break;
					case 1:
						cuenta.depositar(estadisticas);
						break;
					case 2:
						cuenta.retirar(estadisticas);
						break;
					case 3:
						cliente.verDatos(cuenta, estadisticas, banco);
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Cerrando sesión...");
						break;
					}
				} while (opcionCliente != 4);
				break;
			case 1:
				admin.registrar();
				listaUsuarios.add(admin);
				estadisticas.setClientesRegistrados(estadisticas.getClientesRegistrados() + 1);
				
				do {
				opcionAdmin = seleccionarOpcionAdmin(opcionAdmin);
				
				switch (opcionAdmin) {
				case 0:
					admin.verDatos(cuenta, estadisticas, banco);
					break;
				case 1:
					JOptionPane.showMessageDialog(null, listaUsuarios);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Cerrando sesión...");
					break;
				}
			} while (opcionAdmin != 2);
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
