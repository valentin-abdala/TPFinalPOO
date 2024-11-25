import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class Transferencia {
	private Cuenta cuentaOrigen;
	private Cuenta cuentaDestino;
	private double monto;
	private LocalDate fecha;
	private LocalTime hora;
	
	public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto, LocalDate fecha, LocalTime hora) {
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
		this.monto = monto;
		this.fecha = fecha;
		this.hora = hora;
	}

	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public Cuenta getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(Cuenta cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Transferencia [cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino + ", monto=" + monto
				+ ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	public boolean transferir(Cliente cliente, Cliente valen, Cliente profe, Cuenta cuentaValen, Cuenta cuentaProfe, Estadistica estadistica) {
		String[] cuentas = { "Valentin Abdala", "Gamaliel Quiroz" };
		if (cuentaOrigen.getSaldo() == 0) {
			JOptionPane.showMessageDialog(null, "No tienes saldo para realizar cualquier tipo de transferencias.");
			return false;
		} else {
			int cuentaATransferir = JOptionPane.showOptionDialog(null, "Selecciona la cuenta a la que le deseas transferir.", "Cuenta a transferir", 1, 1, null, cuentas, cuentas[0]);
			
			switch (cuentaATransferir) {
			case 0:
				cuentaDestino = cuentaValen;
				monto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto que le deseas transferir a " + valen.getNombre() + " " + valen.getApellido() + "."));
				if (cuentaOrigen.getSaldo() < monto) {
					JOptionPane.showMessageDialog(null, "No tienes suficiente saldo para transferir ese monto.");
					return false;
				} else {
					cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
					cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
					JOptionPane.showMessageDialog(null, "Transferencia realizada con éxito.\n"
							+ "Cuenta origen\n"
							+ "Nombre: " + cliente.getNombre() + " " + cliente.getApellido() + "\n"
							+ "Número de tarjeta: " + cliente.getNroTarjeta() + "\n"
							+ "Saldo: " + cuentaOrigen.getSaldo() + "\n"
							+ "Cuenta destino\n"
							+ "Nombre: " + valen.getNombre() + " " + valen.getApellido() + "\n"
							+ "Número de tarjeta: " + valen.getNroTarjeta() + "\n"
							+ "Saldo: " + cuentaDestino.getSaldo()
							+ "Fecha: " + LocalDate.now() + "\n"
							+ "Hora: " + LocalTime.now());
					
					estadistica.setDineroTransferido(estadistica.getDineroTransferido() + monto);
					estadistica.setnroMovimientos(estadistica.getnroMovimientos() + 1);
					estadistica.setDineroEnMovimiento(estadistica.getDineroEnMovimiento() + monto);
					return true;
				}
			case 1:
				cuentaDestino = cuentaProfe;
				monto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto que le deseas transferir a " + profe.getNombre() + " " + profe.getApellido() + "."));
				if (cuentaOrigen.getSaldo() < monto) {
					JOptionPane.showMessageDialog(null, "No tienes suficiente saldo para transferir ese monto.");
					return false;
				} else {
					cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
					cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
					JOptionPane.showMessageDialog(null, "Transferencia realizada con éxito.\n"
							+ "Cuenta origen\n"
							+ "Nombre: " + cliente.getNombre() + " " + cliente.getApellido() + "\n"
							+ "Número de tarjeta: " + cliente.getNroTarjeta() + "\n"
							+ "Saldo: " + cuentaOrigen.getSaldo() + "\n"
							+ "Cuenta destino\n"
							+ "Nombre: " + profe.getNombre() + " " + profe.getApellido() + "\n"
							+ "Número de tarjeta: " + profe.getNroTarjeta() + "\n"
							+ "Saldo: " + cuentaDestino.getSaldo()
							+ "Fecha: " + LocalDate.now() + "\n"
							+ "Hora: " + LocalTime.now());
					
					estadistica.setDineroTransferido(estadistica.getDineroTransferido() + monto);
					estadistica.setnroMovimientos(estadistica.getnroMovimientos() + 1);
					estadistica.setDineroEnMovimiento(estadistica.getDineroEnMovimiento() + monto);
					return true;
				}
			default:
				return false;
			}
				
		}
		
	}
	
}
