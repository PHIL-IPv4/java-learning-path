package Tag7;
/*
    Wir besitzen ein Kino mit 100 Plätzen. Belegte Plätze sind mit einer 1 gefüllt, nicht belegte Plätze mit einer 0.
 */

import java.util.Random;

public class Kino {
    public static void main(String[] args){
        int[] seats = new int[100];
        int freeSeats = 0;
        int current = 0;

        Random generator = new Random();

        for (int i = 0; i < seats.length; i++){
            seats[i] = generator.nextInt(2);
            System.out.println(i + ". Platz ist " + seats[i]);
        }
        for (int i = 0; i < seats.length; i++){
            if (seats[i] == 0){
                current ++;
                if (current > freeSeats){
                    freeSeats = current;
                }
            } else {
                current = 0;
            }

        }
        System.out.println("Es gibt maximal " + freeSeats + " freie Plätze hintereinander.");
    }
}
