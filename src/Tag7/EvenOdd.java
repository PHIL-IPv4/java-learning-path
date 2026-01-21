package Tag7;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Bitte geben sie eine Zahl ein: ");
        num = input.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " ist gerade.");
        }
        else {
            System.out.println(num + " ist ungerade");
        }
    }
}
