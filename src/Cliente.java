
public class Cliente {
	
	private int edad;
	private String Nombre;
	private double cartera;
	
	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", Nombre=" + Nombre + ", cartera=" + cartera + "]";
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getCartera() {
		return cartera;
	}
	public void setCartera(double cartera) {
		this.cartera = cartera;
	}
	public Cliente(int edad, String nombre, double cartera) {
		super();
		this.edad = edad;
		Nombre = nombre;
		this.cartera = cartera;
	}

}
