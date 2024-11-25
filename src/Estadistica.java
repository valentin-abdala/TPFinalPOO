
public class Estadistica {
	private int nroMovimientos;
	private int clientesRegistrados;
	private double dineroEnMovimiento;
	private double dineroTransferido;
	private double dineroDepositado;
	private double dineroRetirado;
	
	public Estadistica(int nroMovimientos, int clientesRegistrados, double dineroEnMovimiento,
			double dineroTransferido, double dineroDepositado, double dineroRetirado) {
		this.nroMovimientos = nroMovimientos;
		this.clientesRegistrados = clientesRegistrados;
		this.dineroEnMovimiento = dineroEnMovimiento;
		this.dineroTransferido = dineroTransferido;
		this.dineroDepositado = dineroDepositado;
		this.dineroRetirado = dineroRetirado;
	}

	public int getnroMovimientos() {
		return nroMovimientos;
	}

	public void setnroMovimientos(int nroMovimientos) {
		this.nroMovimientos = nroMovimientos;
	}

	public int getClientesRegistrados() {
		return clientesRegistrados;
	}

	public void setClientesRegistrados(int clientesRegistrados) {
		this.clientesRegistrados = clientesRegistrados;
	}

	public double getDineroEnMovimiento() {
		return dineroEnMovimiento;
	}

	public void setDineroEnMovimiento(double dineroEnMovimiento) {
		this.dineroEnMovimiento = dineroEnMovimiento;
	}

	public double getDineroTransferido() {
		return dineroTransferido;
	}

	public void setDineroTransferido(double dineroTransferido) {
		this.dineroTransferido = dineroTransferido;
	}

	public double getDineroDepositado() {
		return dineroDepositado;
	}

	public void setDineroDepositado(double dineroDepositado) {
		this.dineroDepositado = dineroDepositado;
	}

	public double getDineroRetirado() {
		return dineroRetirado;
	}

	public void setDineroRetirado(double dineroRetirado) {
		this.dineroRetirado = dineroRetirado;
	}

	@Override
	public String toString() {
		return "Estadistica [nroMovimientos=" + nroMovimientos + ", clientesRegistrados=" + clientesRegistrados
				+ ", dineroEnMovimiento=" + dineroEnMovimiento + ", dineroTransferido=" + dineroTransferido
				+ ", dineroDepositado=" + dineroDepositado + ", dineroRetirado=" + dineroRetirado + "]";
	}
	
}
