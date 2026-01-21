package Tag15;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 3, 5, 4};
        showArray(arr);
        bubblesort(arr);
        showArray(arr);
    }

    static void showArray(int[] temp){
        System.out.println(Arrays.toString(temp));
    }

    static void bubblesort(int[] arr){
        int hilfe;
        for (int i = arr.length-1; i > 1 ; i = i - 1) {
            System.out.println("i Durchlauf: "+ i);
            for (int j = 0; j < i; j++) {
                System.out.println("j Durchlauf: "+ j);
                if (arr[j] > arr[j+1]){
                    hilfe = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = hilfe;
                    showArray(arr);
                }
            }
        }
    }
}
