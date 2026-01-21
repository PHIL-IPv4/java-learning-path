package Tag06;

import java.util.Random;

/*
START
    int numbers[3]
    Random random
    int randomIndex

    print("Es werden zunächst drei Zahlen zwischen (beiderseits einschließlich) 100 und 200 ausgelost:")

    for int i = 0, i < numbers.length, i++
        numbers[i] = random(100-200)
        print("Zahl "+ (i+1) +": "+ numbers[i])

    randomIndex = random(0-2)
    print("Es wurde der "+ (randomIndex+1) +". Wert, also "+ numbers[randomIndex] +" ausgewählt)
END
 */

public class FPA_02_04_01 {
    public static void main(String[] args){
        int numbers[] = new int[3];
        Random random = new Random();
        int randomIndex;

        System.out.println("Es werden zunächst drei Zahlen zwischen (beiderseits einschließlich) 100 und 200 ausgelost:");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100, 201);
            System.out.println("Zahl "+ (i+1) +": "+ numbers[i]);
        }
        randomIndex = random.nextInt(3);
        System.out.println("Es wurde der "+ (randomIndex+1) +". Wert, also "+ numbers[randomIndex] +" ausgewählt");
    }
}
