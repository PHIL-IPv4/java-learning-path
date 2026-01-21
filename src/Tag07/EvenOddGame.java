package Tag07;

import java.util.Scanner;
import java.util.Random;

public class EvenOddGame {
    public static void main(String[] args){
        Random generator = new Random();
        Scanner input = new Scanner(System.in);

        int stake;
        int credit = 100;
        char bet;

        int randomNum;
        int evenNum = 0;
        int oddNum = 0;

        for (credit = 95; credit > 0; credit -= 5){
            System.out.println("Sie haben " + credit + " Coins. Setzen sie auf [g]erade oder [u]ngerade?: ");
            bet = input.next().charAt(0);

            for (int i = 0; i < 100; i++){
                randomNum = generator.nextInt(101);

                if (randomNum % 2 == 0){
                    evenNum++;
                } else {
                    oddNum++;
                }
            }
            if (oddNum < evenNum){

            }
        }


        System.out.println("Das waren  " + evenNum + " gerade Zahlen und " + oddNum + " ungerade Zahlen");
    }
}
