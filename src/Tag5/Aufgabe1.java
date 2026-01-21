package Tag5;
import java.util.Scanner;

/*
START
    Output "Geben Sie die Anzahl der Räume ein:"
    int räume = Input

    float gesamtfläche = 0

    For int i = 0, i < räume, i++
        Output "Bitte geben Sie die Länge des" + i + 1 +". Raumes ein:"
        länge = Input
        Output "Bitte geben Sie die Breite des" + i + 1 +". Raumes ein:"
        breite = Input

        gesamtfläche = gesamtfläche + länge * breite

    Output "Die Fläche der Wohnung beträgt" + gesamtfläche + " Quadratmeter"
END
 */

public class Aufgabe1 {
    public static void main(String[] args){

        int rooms;
        float area = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Anzahl der Räume ein: ");
        rooms = input.nextInt();

        for (int i = 0; i < rooms; i++){

            float roomLength;
            float roomWidth;

            System.out.println("Bitte geben Sie die Länge des " + (i + 1) + ". Raumes in Metern ein: ");
            roomLength = input.nextFloat();
            System.out.println("Bitte geben Sie die Breite des " + (i + 1) + ". Raumes in Metern ein: ");
            roomWidth = input.nextFloat();

            area = area + roomLength * roomWidth;
        }
        System.out.println("Die Gesamtfläche der Wohnung beträgt " + area + " Quadratmeter.");

    }
}
