package Tag15;

/*
    zahl[1000], per Random mit zahlen von 1 - 100.000 füllen,
    anschließend sortieren (ohne ausgabe!)
    Gebt anschließen die Zahl zahl[Random(0,1000)] aus (ohne die Position auszugeben!!!)

    Anschließend soll ein Binärer Suchalgorithmus die Speicherstelle finden, an der der Wert steht.,

    Übergebt diesen Wert einem Suchalgorithmus, der die Position der Zahl im Array ermittelt.

    Ergänzung: Gebt z.B. -1 aus, für den Fall, dass eine Zahl nicht im Array ist.
 */

import java.util.Arrays;
import java.util.Random;

public class BinaererSuchalgorithmus {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[] arr = new int[1000];


        fillArray(arr);
        showArray(arr);
        selectionSort(arr);
        showArray(arr);
        int randNum = getRandArrNum(arr);
        System.out.println("Die Zahl " + randNum + " wurde an der Stelle " + binarySearch(arr, randNum) + " gefunden.");
    }

    private static int getRandArrNum(int[] arr) {
        int randIndex = rand.nextInt(arr.length);
        System.out.println("Zufällige Zahl aus dem Array: " + arr[randIndex]);
        return arr[randIndex];
    }

    static void showArray(int[] temp){
        System.out.println(Arrays.toString(temp));
    }

    static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 100000);
        }
    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
