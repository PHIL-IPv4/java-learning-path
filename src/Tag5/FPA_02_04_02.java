package Tag5;

import java.util.Random;

public class FPA_02_04_02 {
    public static void main(String[] args){
        float num;
        Random random = new Random();

        num = random.nextFloat(1000.000F);
        float roundedNum = (float) Math.round(num * 1000) / 1000;
        System.out.println(roundedNum);
    }
}
