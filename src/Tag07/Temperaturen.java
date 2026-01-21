package Tag07;

public class Temperaturen {
    public static void main(String[] args){
        int[] t = {-3, 0, 12, 18, 27, -1, 10, 25};
        int min = t[0];
        int max = t[0];
        int sum = 0;
        int average = 0;

        for (int i = 0; i < t.length; i++){
            sum += t[i];
            if (t[i] < min){
                min = t[i];
            }
            if (t[i] > max){
                max = t[i];
            }
        }
        average = sum / t.length;
        System.out.println(min + " ist die niedrigste Temperatur und " + max + " die höchste.\n Die Durchschnittstemperatur ist " + average);
    }
}
