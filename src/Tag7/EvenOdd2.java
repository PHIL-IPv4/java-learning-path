package Tag7;


import java.util.Random;

public class EvenOdd2 {
    public static void main(String[] args){
        Random generator = new Random();
        int randomNum;
        int evenNum = 0;
        int oddNum = 0;

        for (int i = 0; i < 100; i++){
            randomNum = generator.nextInt(101);

            if (randomNum % 2 == 0){
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.println("Das waren  " + evenNum + " gerade Zahlen und " + oddNum + " ungerade Zahlen");
    }
}
