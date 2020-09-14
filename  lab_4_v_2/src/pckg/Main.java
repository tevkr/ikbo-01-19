package pckg;

public class Main {

    public static void main(String[] args) {
	    Book b = new Book(100,"Book1");
	    Processor p = new Processor(1000,"Processor1");
	    System.out.println(b.getPrice());
	    System.out.println(p.getPrice());

    }
}
