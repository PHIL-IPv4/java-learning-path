package Tag05;

import java.util.Random;

/*
START
    int minNum
    int maxNum
    int rNum
    Random random

    minNum = random(1-100)
    maxNum = random(minNum - 100)

    do
        print("Neuer unterer Wert: " maxNum)
        print("Neuer oberer wert: " minNum)

        print("Es wird eine zufällige Zahl zwischen " minNum " und " maxNum " ausgewählt")
        rNum = random(minNum - maxNum)
        print(rNum)

    while (minNum != maxNum)

    print("Unter und Obergrenze ist identisch, das Programm endet.")

 */

public class FPA_02_04_03 {
    public static void main(String[] args){
        int minNum;
        int maxNum;
        int rNum;
        Random random = new Random();

        do {
            minNum = random.nextInt(1, 101);
            maxNum = random.nextInt(minNum, 101);
            System.out.println("\nNeuer unterer Wert: "+ minNum);
            System.out.println("Neuer oberer Wert: "+ maxNum);

            System.out.println("Es wird eine zufällige Zahl zwischen "+ minNum +" und "+ maxNum +" ausgewählt");
            rNum = random.nextInt(minNum, maxNum + 1);
            System.out.println(rNum);
        } while (minNum != maxNum);
        System.out.println("Unter und Obergrenze ist identisch, das Programm endet.");
    }
}
