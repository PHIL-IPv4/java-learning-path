package Tag08;

/*
    Das Programm soll beim Rechnen üben helfen.

    Dazu generiert es zwei Zufallszahlen, die dann, ebenfalls zufällig,
    mit einer der folgenden Rechenoperationen verknüpft werden:
    +, -, *, /, % (plus, minus, mal, geteilt, modulo)

    Die Aufgabe wird dem Benutzer gestellt und er muss eine Lösung eingeben.
    Die Anzahl der Versuche wird gezählt.

    Es werden immer 5 Aufgaben (nacheinander) gestellt.
    Da ausschließlich mit Int gerechnet wird, sind bei Divisionsaufgaben nur
    ganzzahlige Ergebnisse zulässig.

    Zum Abschluss wird ausgewertet, wie viele Fehlversuche es gab, bzw. wie viele
    Aufgaben auf Anhieb richtig berechnet wurden.

    Tipp: Die Rechenzeichen in ein Char[] (Array) packen!

    Bitte Pseudo-Code und lauffähiges Java-Programm erstellen.


    START
        char[] operatoren = char{+, -, *, /, %}
        int zahl1
        int zahl2
        int ergebnis
        int antwort
        int richtig = 0
        int flasch = 0
        int zufallsOperator

        Random rand
        Scanner input

        for i = 0, i < 5, i++
            zahl1 = rand(1 - 100)
            zahl2 = rand(1 - 100)
            zufallsOperator = rand(0 - 4)
            print((i+1) + ". Aufgabe: " +zahl1 + " " + operatoren[zufallsOperator] + " " + zahl2 + " = ")
            antwort = input

            switchcase (zufallsOperator)
                case 0:
                    ergebnis = zahl1 + zahl2
                case 1:
                    ergebnis = zahl1 - zahl2
                case 2:
                    ergebnis = zahl1 * zahl2
                case 3:
                    ergebnis = zahl1 / zahl2
                case 4:
                    ergebnis = zahl1 % zahl2

            if (ergebnis == antwort)
                richtig++
            else
                falsch++

            print("Du hattest " + richtig + " richtige und " + falsch + " falsche Antworten.")




 */

import java.util.Random;
import java.util.Scanner;

public class FPA {
    public static void main(String[] args) {
        char[] operatoren = {'+', '-', '*', '/', '%'};
        int zahl1;
        int zahl2;
        int ergebnis = 0;
        int antwort;
        int richtig = 0;
        int falsch = 0;
        int zufallsOperator;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            zahl1 = rand.nextInt(1, 100);
            zahl2 = rand.nextInt(1, 100);
            zufallsOperator = rand.nextInt(5);
            System.out.println((i+1) + ". Aufgabe: " +zahl1 + " " + operatoren[zufallsOperator] + " " + zahl2 + " = ");
            antwort = input.nextInt();

            switch (zufallsOperator) {
                case 0:
                    ergebnis = zahl1 + zahl2;
                    break; //bricht sofort den switchcase
                case 1:
                    ergebnis = zahl1 - zahl2;
                    break;
                case 2:
                    ergebnis = zahl1 * zahl2;
                    break;
                case 3:
                    ergebnis = zahl1 / zahl2;
                    break;
                case 4:
                    ergebnis = zahl1 % zahl2;
                    break;
            }

            if (ergebnis == antwort) {
                richtig++;
            } else {
                falsch++;
            }


        }
        System.out.println("Du hattest " + richtig + " richtige und " + falsch + " falsche Antworten.");



    }
}
