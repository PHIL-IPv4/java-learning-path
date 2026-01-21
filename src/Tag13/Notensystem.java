package Tag13;

/*
Implementiere ein Programm, das eine Schulnote von A bis F als Eingabe nimmt und eine entsprechende Bewertung
"Sehr gut", "Gut", "Befriedigend", "Ausreichend", "Mangelhaft", "Ungenügend".
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Notensystem {
    public static void main(String[] args) {

        boolean ungueltig;
        char note;

        Scanner input = new Scanner(System.in);

        do {
            ungueltig = false;
            System.out.println("Geben sie ihre Note ein: ");
            note = input.next(".").charAt(0);
            note = Character.toUpperCase(note);

            switch (note){
                case 'A':
                    System.out.println("Bewertung: Sehr gut");
                    break;
                case 'B':
                    System.out.println("Bewertung: Gut");
                    break;
                case 'C':
                    System.out.println("Bewertung: Befriedigend");
                    break;
                case 'D':
                    System.out.println("Bewertung: Ausreichend");
                    break;
                case 'F':
                    System.out.println("Bewertung: Durchgefallen");
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    ungueltig = true;
                    break;

            }
        } while (ungueltig);

    }
}
