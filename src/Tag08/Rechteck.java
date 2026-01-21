package Tag08;

/*
Aufgabe 3

Das Programm fragt zu Beginn einmalig zwei ganze Zahlen ab, die für die Breite und Länge eines Rechteckes stehen.
Anschließend startet eine Schleife, in der pro Durchlauf das Produkt der beiden Zahlen (also die Fläche des Rechteckes) abgefragt wird.
Die Schleife wird solange wiederholt, solange die Eingabe nicht der Fläche entspricht.
Nach der Schleife wird ausgegeben, wie viele Versuche der User benötigte, bis er die korrekte Fläche eingab.

Pseudocode und lauffähiges JAVA Programm sind zu erstellen

START
    Scanner input

    int breite
    int länge
    int fläche = 0
    int antwort = 1

    input: breite, länge

    do while antwort != fläche
        fläche = breite * länge
        antwort = input
 */

import java.util.Scanner;

public class Rechteck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int width;
        int length;
        int area = 0;
        int answer = 1;

        System.out.print("Enter length: ");
        width = input.nextInt();
        System.out.println("Enter width: ");
        length = input.nextInt();

        do {
            area = length * width;
            System.out.println("Enter area: ");
            answer = input.nextInt();
        } while (answer != area);

        System.out.println("Correct! Area is " + area);
    }
}
