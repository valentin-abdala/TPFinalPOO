import javax.swing.JOptionPane;

public class Cuenta {
	private Cliente cliente;
	private double saldo;
	private Estadistica estadistica;
	
	public Cuenta(Cliente cliente, double saldo, Estadistica estadistica) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.estadistica = estadistica;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Estadistica getEstadistica() {
		return estadistica;
	}

	public void setEstadistica(Estadistica estadistica) {
		this.estadistica = estadistica;
	}

	@Override
	public String toString() {
		return "Cuenta [cliente=" + cliente + ", saldo=" + saldo + ", estadistica=" + estadistica + "]";
	}
	
	public void depositar(Estadistica estadistica) {
		double deposito = validarDouble(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto que deseas depositar.")));
		saldo = saldo + deposito;
		JOptionPane.showMessageDialog(null, "Depósito realizado con éxito.");
		
		estadistica.setDineroDepositado(estadistica.getDineroDepositado() + deposito);
		estadistica.setnroMovimientos(estadistica.getnroMovimientos() + 1);
		estadistica.setDineroEnMovimiento(estadistica.getDineroEnMovimiento() + deposito);
	}
	
	public void retirar(Estadistica estadistica) {
		double retiro = validarDouble(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto que deseas retirar.")));
		if (saldo < retiro) {
			JOptionPane.showMessageDialog(null, "No tienes el saldo suficiente para realizar este retiro.");
		} else {
			saldo = saldo - retiro;
			JOptionPane.showMessageDialog(null, "Retiro realizado con éxito.");
			
			estadistica.setDineroRetirado(estadistica.getDineroRetirado() + retiro);
			estadistica.setnroMovimientos(estadistica.getnroMovimientos() + 1);
			estadistica.setDineroEnMovimiento(estadistica.getDineroEnMovimiento() + retiro);
		}
	}
	
	public double validarDouble(double numero) {
		while (numero <= 0) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Error. Reingresa los datos."));
		}
		return numero;
	}
	
}
