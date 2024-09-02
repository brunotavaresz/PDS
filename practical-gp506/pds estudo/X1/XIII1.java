package X1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
// Notas:
// Não altere o código apresentado na alinea 1
// Deve completar o código das alineas 2 e 3
// Pode comentar código para garantir que vai executando parcialmente

public class XIII1{

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fl = new PrintStream(new File("pds2022.txt"));
		test(System.out); // executa e escreve na consola
		fl.println(System.getProperty("user.dir"));
		fl.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
		test(fl); // executa e escreve no ficheiro
		fl.close();
	}

	private static void test(PrintStream out) {
		question1(out);
		question2(out);
		// question3(out);
	}

	private static void question1(PrintStream out) {
		out.println("\nQuestion 1) ----------------------------------\n");
		ToShare market = new ToShare();
		Product[] cars = {
			new Car("ZA11ZB", "Tesla, Grey, 2021", 100),
			new Van("AA22BB", "Chevrolet Chevy, 2020", 180),
			new Motorcycle("ZA33ZB", "Touring, 750, 2022", 85),
			new Car("BB44ZB", "Ford Mustang, Red, 2021", 150), 
		};
		for (Product item : cars) 
			market.add(item);

		out.println("--- All Products :");
		for (Product item : market.getProducts())
			out.println(item);		
	
		Client u1 = new Client("187", "Peter Pereira");
		Client u2 = new Client("957", "Anne Marques");
		Client u3 = new Client("826", "Mary Monteiro");
		market.share("ZA11ZB", u1);
		market.share(cars[2], u2);
		market.share("BB44ZB", u3);

		out.println("--- Shared Products :\n" + market.sharedProducts());
		market.giveBack(cars[0]);
		market.giveBack("BB44ZB");
		out.println("--- Shared Products :\n" + market.sharedProducts());
		
		market.remove("ZA11ZB");
		OldJeep oj = new OldJeep("JJ0011;Some old SUV;88"); // assume "code;description;points"
		market.add(new Jeep(oj));
		out.println("--- All Products :");
		for (Product item : market)
			out.println(item);	
	}

	private static void question2(PrintStream out) {
		out.println("\nQuestion 2 (output example) ----------------------------------\n");
		// Completar
	}
	
static class ToShare implements Iterable<Product> {
	private List<Product> products = new ArrayList<>();
	private Map<String, Client> sharedProducts = new HashMap<>();

	public boolean add(Product p) {
		return products.add(p);
	}

	public Product remove(String code) {
		for(Product p : products) {
			if (p.code().equals(code)) {
				products.remove(p);
				return p;
			}
		}
		return null;
	}

	public Product remove(Product p){
		if (products.remove(p)) {
			return p;
		}
		return null;
	}

	public boolean share(String code, Client user) {
        for (Product p : products) {
            if (p.code().equals(code)) {
                if (!sharedProducts.containsKey(code)) {
                    sharedProducts.put(code, user);
                    return true;
                }
                return false; // Produto já partilhado
            }
        }
        return false; // Produto não encontrado
    }

	public boolean share (Product p, Client user) {
		return share(p.code(), user);
	}

	public boolean giveBack(String code) {
        if (sharedProducts.remove(code) != null) {
            return true;
        }
        return false;
    }

	public boolean giveBack(Product p) {
		return giveBack(p.code());
	}

	public List<Product> getProducts() {
		return products;
	}

	public String sharedProducts() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total : ").append(sharedProducts.size()).append("\n");
        for (Map.Entry<String, Client> entry : sharedProducts.entrySet()) {
            sb.append(entry.getValue()).append(" shared with ").append(entry.getKey()).append("\n");
        }
        return sb.toString();
    }

	@Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}

static class Client {
    private String id;
    private String name;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
    	return "Client [number=" + id + ", name=" + name + "]";
    }
}

interface Product {
	String code();
	String description();
	int points();
}	

static class Car implements Product {
	private String code;
	private String description;
	private int points;


	public Car(String code, String description, int points) {
		this.code = code;
		this.description = description;
		this.points = points;
	}

	public String code() {
		return code;
	}

	public String description() {
		return description;
	}

	public int points() {
		return points;
	}

	@Override
        public String toString() {
            return "Car [code=" + code + ", descr=" + description + ", points=" + points + "]";
        }
}

static class Van implements Product {
	private String code;
	private String description;
	private int points;


	public Van(String code, String description, int points) {
		this.code = code;
		this.description = description;
		this.points = points;
	}

	public String code() {
		return code;
	}

	public String description() {
		return description;
	}

	public int points() {
		return points;
	}

	@Override
        public String toString() {
            return "Van [code=" + code + ", descr=" + description + ", points=" + points + "]";
        }
}

static class Motorcycle implements Product {
	private String code;
	private String description;
	private int points;


	public Motorcycle(String code, String description, int points) {
		this.code = code;
		this.description = description;
		this.points = points;
	}

	public String code() {
		return code;
	}

	public String description() {
		return description;
	}

	public int points() {
		return points;
	}

	@Override
        public String toString() {
            return "Motorcycle [code=" + code + ", descr=" + description + ", points=" + points + "]";
        }
}

static class OldJeep {
	private String data;

	public OldJeep(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "OldJeep [data=" + data + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OldJeep other = (OldJeep) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
}

static class Jeep implements Product {
	private String code;
	private String description;
	private int points;

	Jeep(OldJeep OldJeep) {
		String[] data = OldJeep.getData().split(";");
		this.code = data[0];
        this.description = data[1];
        this.points = Integer.parseInt(data[2]);
	}

	public String code() {
		return code;
	}

	public String description() {
		return description;
	}

	public int points() {
		return points;
	}

	@Override
    public String toString() {
        return "Jeep [code=" + code + ", description=" + description + ", points=" + points + "]";
    }

}


interface ProductsReader {
	List<Product> getItems();
}



}
