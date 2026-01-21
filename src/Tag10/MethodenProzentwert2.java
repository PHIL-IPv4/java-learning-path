package Tag10;

import java.util.Scanner;

public class MethodenProzentwert2 {
    public static void main(String[] args) {
        float basis;
        float proz;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bitte geben Sie den Basiswert ein: ");
            basis = input.nextFloat();
            if (basis == 0) {
                System.out.println("Basiswert ist 0, keine Berechnung notwendig. \nProgramm endet.");
                break;
            }
            System.out.println("Bitte geben Sie den Prozentwert ein: ");
            proz = input.nextFloat();

            float berechnung = berechneProzent(basis, proz);
            System.out.printf("%.2f %% von %.2f sind %.2f\n", proz, basis, berechnung);

        } while (basis != 0 );

    }


    /**
     * berechneProzent()
     *
     *
     * @param basisWert         Wert für den der Prozentwert berechnet wird (100%)
     * @param prozWert          Wert für den Prozentanteil, der berechnet werden soll (x%)
     * @return ergebnis         Liefert ausgerechneten Prozentwert zurück
     */

    static float berechneProzent(float basisWert, float prozWert) {
        float ergebnis;

        ergebnis = basisWert / 100f * prozWert;
        return  ergebnis;
    }
}
