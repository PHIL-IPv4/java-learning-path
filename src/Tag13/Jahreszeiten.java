package Tag13;

import java.util.Scanner;

public class Jahreszeiten {
    public static void main(String[] args) {
        boolean ungueltig;
        int monate;

        Scanner input = new Scanner(System.in);

        do {
            ungueltig = false;
            System.out.println("Geben sie einen Monat ein: ");
            monate = input.nextInt();

            switch (monate){
                case 12, 1, 2:
                    System.out.println("Winter");
                    break;
                case 3, 4, 5:
                    System.out.println("Frühling");
                    break;
                case 6, 7, 8:
                    System.out.println("Sommer");
                    break;
                case 9, 10, 11:
                    System.out.println("Herbst");
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    ungueltig = true;
                    break;

            }
        } while (ungueltig);
    }
}
