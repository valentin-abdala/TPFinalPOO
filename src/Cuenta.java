
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
	
}
