import java.util.ArrayList;
import java.util.Random;

public class Principal {

	public 	static ArrayList<Discotecas> discotecas = new ArrayList<>();
	
	public static void main(String[] args) {
		
		discotecas.add(new Discotecas("Cocoloco", 1, null,18));
		discotecas.add(new Discotecas("Fabrik", 2, null,21));
		discotecas.add(new Discotecas("xque", 3, null,16));
		
		ArrayList<Cliente> clietnes = new ArrayList<>();
		clietnes.add(new Cliente(18, "Ramon", 25));
		clietnes.add(new Cliente(17, "Pedor", 35));
		clietnes.add(new Cliente(21, "Jorge", 55));
		clietnes.add(new Cliente(23, "Diego", 100));
		int ass=0;
		do {
			for (int j = 0; j < discotecas.size(); j++) {
				
				for (int i = 0; i < clietnes.size(); i++) {
	
					discotecas.get(j).entrarDiscoteca(clietnes.get(i));
				} 
			}
			ass++;
		} while (ass<20);
		
//		for (Discotecas d : discotecas) {
//			System.out.println(d);
//		}
//		System.out.println("asdasd");
//		dameShow();
//		for (Discotecas d : discotecas) {
//			System.out.println(d);
//		}	
//		dameShow();
//		System.out.println("asdasdasd");
//		for (Discotecas d : discotecas) {
//			System.out.println(d);
//		}		
//		
//		dameShow();
//		System.out.println("asdasdasd");
//		for (Discotecas d : discotecas) {
//			System.out.println(d);
//		}		
//		dameShow();
//		System.out.println("asdasdasd");
//		for (Discotecas d : discotecas) {
//			System.out.println(d);
//		}		



	}
	public static void dameShow() {
		Random r = new Random();
		ArrayList<Show>  shows = new ArrayList<>();
		for (Show s : Show.values()) {
			shows.add(s);
		}
		
		for (int i = 0; i < discotecas.size(); i++) {
			
			int aux1 = 0;
			do {
				aux1 =r.nextInt(shows.size());
			} while (discotecas.get(i).getShow()==shows.get(aux1));
			
			discotecas.get(i).setShow(shows.get(aux1));
			shows.remove(aux1);
		}
	}
	public static void showAnterio() {
		for (Discotecas d : discotecas) {
			d.setAnterior(d.getShow());
		}
	}
	
}
