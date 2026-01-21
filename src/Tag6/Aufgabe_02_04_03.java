package Tag6;

import java.util.Random;

/*

START
    int num
    int highestNum = 1

    for i = 0, i <= 10, i++

        num = randomgenerator(1-100)
        print(num)

        if num > highestNum
            highestNum = num

    print("Der höchste Wert war: " + highestNum)

 */

public class Aufgabe_02_04_03 {
    public static void main(String[] args){

        int num;
        int highestNum = 1;
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            num = random.nextInt(1, 101);
            System.out.println(num);

            if (num > highestNum){
                highestNum = num;
            }
        }
        System.out.println("Der höchste Wert ist: " + highestNum);

    }
}
