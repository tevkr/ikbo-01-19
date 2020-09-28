package pckg;

public class Main {

    public static void main(String[] args) {
	    Complex cmp1 = new Complex(0,0);
        Complex cmp2 = new ConcreteFactory().createComplex();
	    cmp2.setImage(1);
	    cmp2.setReal(1);
	    System.out.println(cmp1);
        System.out.println(cmp2);

    }
}
