package Tag8;

/*

Aufgabe_02_01_02

Das Programm fragt vom User zu Beginn eine „Neue Geheimnummer" ab (gefordert wird eine beliebige aber ganzzahlige Eingabe).
Anschließend wird der User gebeten, die soeben eingegebene Zahl zu bestätigen, indem er diese erneut eingibt.
Falls die zweite Eingabe der ersten nicht entspricht,
so wird erneut eine „Neue Geheimnummer" abgefragt, die ebenfalls bestätigt werden muss ... und so weiter...

Falls der User jedoch (nach beliebig vielen Versuchen) die unmittelbar vorangegangene Eingabe bestätigt, so wird die neue Geheimnummer zur Kontrolle auf der Konsole ausgegeben und das Programm endet.

START
    Scanner input
    int password
    int confirm

    do while password != confirm
        password = input
        confirm = input
    print(password)
 */

import java.util.Scanner;

public class Geheimzahl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;
        int confirm;
        int attempts = 3;

        do {
            attempts = 3;
            System.out.println("\nGeben Sie bitte die Geheimzahl ein: ");
            password = input.nextInt();
            do {
                System.out.println("\nBestätigen Sie bitte die Geheimzahl(Sie haben "+ attempts + " Versuche):");
                confirm = input.nextInt();
                attempts--;

            } while(attempts > 0 && password != confirm);
        } while(password != confirm);


        System.out.println("\nEingabe erfolgreich: " + password);
    }
}

//public class Geheimzahl {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int password;
//        int confirm;
//        final int MAX_ATTEMPTS = 3; // Konstante für maximale Versuche
//
//        // --- Teil 1: Geheimzahl festlegen ---
//        // Diese Schleife stellt sicher, dass die Zahl korrekt eingegeben wird,
//        // bevor es zum Bestätigungsteil kommt.
//        do {
//            System.out.println("\nGeben Sie bitte die Geheimzahl ein:");
//            password = input.nextInt();
//            System.out.println("Bestätigen Sie bitte die Geheimzahl:");
//            confirm = input.nextInt();
//
//            if (password != confirm) {
//                System.out.println("Fehler: Die Zahlen stimmen nicht überein. Bitte erneut eingeben.");
//            }
//
//        } while (password != confirm);
//
//        // --- Teil 2: Bestätigung überprüfen (mit Versuchen) ---
//        // Jetzt, da die "password" feststeht, kann der Bestätigungsprozess beginnen.
//
//        System.out.println("\nGeheimzahl erfolgreich festgelegt. Nun zur Überprüfung.");
//
//        int remainingAttempts = MAX_ATTEMPTS;
//        boolean confirmedCorrectly = false; // Flag, um den Erfolg zu markieren
//
//        do {
//            System.out.println("\nBestätigen Sie bitte die Geheimzahl (Sie haben noch " + remainingAttempts + " Versuche):");
//            confirm = input.nextInt();
//            remainingAttempts--;
//
//            if (password == confirm) {
//                confirmedCorrectly = true; // Erfolg!
//                break; // Schleife beenden, da korrekt
//            } else if (remainingAttempts > 0) {
//                System.out.println("Falsche Eingabe. Versuchen Sie es erneut.");
//            }
//
//        } while (remainingAttempts > 0);
//
//        // --- Teil 3: Ergebnis ---
//        if (confirmedCorrectly) {
//            System.out.println("\nEingabe erfolgreich: " + password);
//        } else {
//            System.out.println("\nZu viele falsche Versuche. Programm beendet.");
//        }
//    }
//}
