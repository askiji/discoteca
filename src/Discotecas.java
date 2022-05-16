import java.util.HashMap;
import java.util.Scanner;

public class Discotecas {

	
	private String nombre;
	private int id;
	private Show show;
	private int edadEntrada;
	private Show anterior;
	
	public static HashMap<String,Integer> bbddEdades = new HashMap<>();
	
	public void entrarDiscoteca(Cliente cliente) {
		Scanner sc = new Scanner(System.in);
		Integer edad=0;
		String nombre = cliente.getNombre();
		System.out.println(cliente);
		System.out.println("pPedir nombre");
		if(bbddEdades.get(nombre) == null) {
			System.out.println("Preguntar edad");
			
			edad = Discotecas.esNumero(0,100);
			bbddEdades.put(nombre, edad);
			
		}
		else {
			edad = bbddEdades.get(nombre); 
			
		}
		System.out.println("PUEDE ENTRAR?");
		System.out.println("LA edad minima de la discoteca es " + this.edadEntrada);
		if(this.edadEntrada<=edad) {
			System.out.println("si puede netrar");
			
			cliente.setCartera(cliente.getCartera()- this.show.coste);
		}
		else {
			System.out.println("nop");
		}
		
		
		

		
	}
	private static Integer esNumero(int a ,int b) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Integer aux = Integer.valueOf(sc.nextLine());
			if(a<aux && aux<b) {
				return aux;
			}
			else {
				System.out.println("no es un rango aceptable");
				System.out.println("mete nueva edad");
				return Discotecas.esNumero(a,b);
				
			}
		} catch (Exception e) {
			System.out.println("No es numero");
			return Discotecas.esNumero(a,b);
		}
		
		
	}
	

	public int getEdadEntrada() {
		return edadEntrada;
	}
	public void setEdadEntrada(int edadEntrada) {
		this.edadEntrada = edadEntrada;
	}
	public Show getAnterior() {
		return anterior;
	}
	public void setAnterior(Show anterior) {
		this.anterior = anterior;
	}
	public Discotecas(String nombre, int id, Show show, int edadEntrada) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.show = show;
		this.edadEntrada = edadEntrada;
	}
	@Override
	public String toString() {
		return "Discotecas [nombre=" + nombre + ", id=" + id + ", show=" + show + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	
	
}
