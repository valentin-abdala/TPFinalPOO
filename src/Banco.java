
public class Banco {
	private String nombre;
	private Estadistica estadistica;
	
	public Banco(String nombre, Estadistica estadistica) {
		this.nombre = nombre;
		this.estadistica = estadistica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadistica getEstadistica() {
		return estadistica;
	}

	public void setEstadistica(Estadistica estadistica) {
		this.estadistica = estadistica;
	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", estadistica=" + estadistica + "]";
	}
	
}
