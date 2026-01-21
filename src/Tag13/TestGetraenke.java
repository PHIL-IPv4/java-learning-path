package Tag13;

import java.util.Scanner;

public class TestGetraenke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GetraenkeAutomat g1 = new GetraenkeAutomat();
        int auswahl;
        double zuZahlenderBetrag;



        do {
            g1.zeigeMenue();
            auswahl = input.nextInt();
            zuZahlenderBetrag = g1.waehleGetraenk(auswahl);
            System.out.println("Betrag: "+ zuZahlenderBetrag);

        } while (auswahl != 0);

    }

}
