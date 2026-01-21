package Tag5;
import java.util.Scanner;

/*
a) Möglichst kurzer Quellcode

START

    int zahl;
    bool keineEingabe = wahr

    solange keineEingabe

        output "Geben Sie eine Zahl zwischen 1 und 100 ein die nicht ausgegeben werden soll: "
        int zahl = input

        wenn zahl < 1 und zahl > 100
            Output ("Ungültig")
        sonst
            keineEingabe = falsch

    für int i = 1, i < 100, i++
        wenn i != zahl
            output i
END

 */

public class Aufgabe2_1 {
    public static void main(String[] args){
        int num = 0;
        boolean noValidInput = true;
        Scanner input = new Scanner(System.in);

        while (noValidInput){
            System.out.println("Geben Sie eine Zahl zwischen 1 und 100 ein die nicht ausgegeben werden soll:");
            num = input.nextInt();

            if (num < 1 || num > 100){
                System.out.println("Ungültige Eingabe");
            }
            else {
                noValidInput = false;
            }
        }

        for (int i = 1; i <= 100; i++){
            if (num != i){
                System.out.println(i);
            }
        }

    }
}
