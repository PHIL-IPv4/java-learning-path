package Tag11;

public class ProduktTest {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Club Mate", 1, 2);
        System.out.println(p1.getName());
        System.out.println("Preis: "+ p1.getVerkaufspreis());
        p1.setVerkaufspreis(3);
        System.out.println("Preis: "+ p1.getVerkaufspreis());
        p1.setVerkaufspreis(0);
        System.out.println("Preis: "+ p1.getVerkaufspreis());
    }
}
