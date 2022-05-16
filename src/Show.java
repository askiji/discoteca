
public enum Show {
	ROW(35,"Rows"),
	CODE(25,"Code"),
	UNIVERSIPARTY(20,"Universi party"),
	DRAKQUEENPARTY(100,"Drak night");
	
	int coste;
	String nombre;
	private Show(int coste, String nombre) {
		this.coste = coste;
		this.nombre = nombre;
	}
	
	public int getCoste() {
		return coste;
	}
	public void setCoste(int coste) {
		this.coste = coste;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
