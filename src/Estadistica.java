
public class Estadistica {
	private int nroTransferencias;
	private int clientesRegistrados;
	private double dineroEnMovimiento;
	private double dineroTransferido;
	private double dineroDepositado;
	private double dineroRetirado;
	
	public Estadistica(int nroTransferencias, int clientesRegistrados, double dineroEnMovimiento,
			double dineroTransferido, double dineroDepositado, double dineroRetirado) {
		this.nroTransferencias = nroTransferencias;
		this.clientesRegistrados = clientesRegistrados;
		this.dineroEnMovimiento = dineroEnMovimiento;
		this.dineroTransferido = dineroTransferido;
		this.dineroDepositado = dineroDepositado;
		this.dineroRetirado = dineroRetirado;
	}

	public int getNroTransferencias() {
		return nroTransferencias;
	}

	public void setNroTransferencias(int nroTransferencias) {
		this.nroTransferencias = nroTransferencias;
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
		return "Estadistica [nroTransferencias=" + nroTransferencias + ", clientesRegistrados=" + clientesRegistrados
				+ ", dineroEnMovimiento=" + dineroEnMovimiento + ", dineroTransferido=" + dineroTransferido
				+ ", dineroDepositado=" + dineroDepositado + ", dineroRetirado=" + dineroRetirado + "]";
	}
	
}
