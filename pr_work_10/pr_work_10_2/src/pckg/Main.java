package pckg;

public class Main {

    public static void main(String[] args) {
        Client cl = new Client();

        cl.setChair(new ChairFactory().createFunctionalChair());
        cl.sit();

        cl.setChair(new ChairFactory().createMagicChair());
        cl.sit();

        cl.setChair(new ChairFactory().createVictorianChair());
        cl.sit();

    }
}
