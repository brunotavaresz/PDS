package X2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


// Não alterar esta classe
// Mas pode (Deve!) comentar linhas com erros para poder testar o código que for desenvolvendo

public class XIII2 {
	private static Port av = new SeaPort();

	public static void main(String[] args) throws FileNotFoundException {
		String suser = System.getProperty("user.dir");
		String[] logFiles = new File(suser).list((d, s) -> {return s.equals("src");}); 
		String sp=""; if(logFiles.length>0) sp = logFiles[0]+"/";
		PrintStream fl = new PrintStream(new File(sp+"PDS2122.txt"));
		fl.println(suser + "\n" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
		exam(System.out); // executa e escreve na consola
		exam(fl); // executa e escreve no ficheiro
		fl.close();
	}

	private static void exam(PrintStream out) {
		question1(out);
		question2(out);
		question3(out);
	}

	// alínea a)
	private static void question1(PrintStream out) {
		out.println("\nAlínea a) ----------------------------------\n");

		av.add("C02", new CargoShip("S101", "Quebra Molas", 155.5));
		av.add("C11", new CargoShip("S732", "SoPingas", 20.2));
		av.add("C03", new CargoShip("S923", "Madalena", 18.8));
		av.add("P54", new PassengerShip("S199", "Bananeiros", 120));
		av.add("P35", new PassengerShip("S185", "PDS All aboard", 80));
		av.add("P06", new PassengerShip("S078", "Costeiro", 25));

		Iterator<String> it = av.iterator();
		while (it.hasNext()) {
			out.println(it.next());
		}
	}

	// alínea b)
	private static void question2(PrintStream out) {
		out.println("\nAlínea b) ----------------------------------\n");
		// Completar

	}

	// alínea c)
	private static void question3(PrintStream out) {
		// Completar

	}

	interface Port extends Iterable<String> {
		public boolean add(String ref, Ship p);
		public boolean exists(String ref);
		public Ship remove(String ref);
	}

	static class SeaPort implements Port {
		private Map<String, Ship> ships;

		public SeaPort() {
			this.ships = new HashMap<>();
		}

		@Override
		public boolean add(String ref, Ship ship) {
			if (exists(ref)) {
				ships.replace(ref, ship);
			} else {
				ships.put(ref, ship);
			}
			return true;
		}

		@Override
		public boolean exists(String ref) {
			return ships.containsKey(ref);
		}

		@Override
		public Ship remove(String ref) {
			return ships.remove(ref);
		}
		

		@Override
		public Iterator<String> iterator() {
			return ships.keySet().iterator();
		}


		public String show(String ref) {
			StringBuilder sb = new StringBuilder();
			sb.append(ref).append(": ").append(ships.get(ref)).append("\n");
			return sb.toString();
		}
	}

	interface Ship {
		public String code();
		public String name();
	}

	static class PassengerShip implements Ship {
		private String code;
		private String name;
		private int passengers;

		PassengerShip(String code, String name, int passengers) {
			this.code = code;
			this.name = name;
			this.passengers = passengers;
		}

		public String code(){
			return code;
		}

		public String name() {
			return name;
		}

		public int passengers(){
			return passengers;
		}

		@Override
		public String toString() {
			return "[code=" + code() + ", name=" + name() + ", passengers=" + passengers() + "]";
		}
	}

	static class CargoShip implements Ship {
		private String code;
		private String name;
		private double carga;

		CargoShip(String code, String name, double carga) {
			this.code = code;
			this.name = name;
			this.carga = carga;
		}

		public String code(){
			return code;
		}

		public String name() {
			return name;
		}

		public double carga(){
			return carga;
		}

		@Override
		public String toString() {
			return "[code=" + code() + ", name=" + name() + ", passengers=" + carga() + "]";
		}
	}

	
	
	


}
