package Tag04;
import java.util.Scanner;

/*
START
    CHAR buchstaben[2]
    BOOL keineAuswahl = Wahr

    FÜR(i = 0; i < buchstaben.länge; i++)
        AUSGABE "Geben Sie einen Buchstaben ein: "
        buchstaben[i] = EINGABE

    SOLANGE keineAuswahl
        CHAR auswahl;
        AUSGABE "Auswahl [N] - Buchstaben nebeneinander anzeigen ZEILENUMBRUCH Auswahl [U] - Buchstaben untereinander anzeigen"
        auswahl = EINGABE

        SWITCHCASE
            CASE N
                AUSGABE "buchstaben"
                keineAuswahl = Falsch
            Case U
                AUSGABE "buchstaben[0] ZEILENUMBRUCH buchstaben[1]"
                keineAuswahl = Falsch
            DEFAULT
                AUSGABE "Ungültige Auswahl"
                BREAK

 */

public class Aufgabe1 {
    public static void main(String[] args){

        char[] chars;
        chars = new char[2];
        boolean validAction = false;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < chars.length; i++){
            System.out.println("Geben Sie einen Buchstaben ein: ");
            chars[i] = input.next(".").charAt(0);
        }
        while (!validAction){
            char action;
            System.out.println("Auswahl [N] - Buchstaben nebeneinander anzeigen\nAuswahl [U] - Buchstaben untereinander anzeigen");
            action = input.next(".").charAt(0);
            action = Character.toUpperCase(action);

            switch (action){
                case 'N':
                    System.out.println(chars);
                    validAction = true;
                    break;
                case 'U':
                    System.out.println(chars[0] + "\n" + chars[1]);
                    validAction = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe\n");
                    break;
            }

        }
    }
}
