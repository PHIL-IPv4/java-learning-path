package Tag08;

/*
    Der Benutzer gibt ein Startkapital und einen Jahreszins ein.
    Im Anschluss wird er gefragt, welches Endkapital er erreichen will.
    Danach berechnet das Programm, wie viele Jahre es dauert, bis das Zielkapital
    erreicht wird und gibt die Anzahl Jahre und das Endkapital aus.

    START
        Objekte:
        Scanner input

        Variablen:
        double startKapital
        double jahresZins
        double zielKapital
        double aktuellesKapital
        int anzahlJahre = 0

        Eingabe: startKapital, jahresZins, zielKapital

        aktuellesKapital = startKapital

        solange aktuellesKapital < zielKapital
            aktuellesKapital = aktuellesKapital + aktuellesKapital * jahresZins / 100
            anzahlJahre++

        Ausgabe: anzahlJahre, aktuellesKapital
    END

 */

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double startingCapital;
        double anualRate;
        double targetCapital;
        double currentCapital;
        int yearCount = 0;

        System.out.println("Enter Target Capital: ");
        targetCapital = input.nextDouble();
        System.out.println("Enter Starting Capital: ");
        startingCapital = input.nextDouble();
        System.out.println("Enter Anual Rate: ");
        anualRate = input.nextDouble();

        currentCapital = startingCapital;

        do {
            currentCapital = currentCapital + currentCapital * anualRate / 100;
            yearCount++;

        } while (currentCapital < targetCapital);

        System.out.println("After " + yearCount + " years your capital will reach " + currentCapital + " Euros.");
    }
}
