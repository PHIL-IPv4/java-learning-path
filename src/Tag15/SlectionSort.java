package Tag15;

import java.util.Arrays;

public class SlectionSort {
    public static void main(String[] args) {
        int[] arr = {200, 326, 41, 13, 55, 4};
        showArray(arr);
        selectionSort(arr);
    }

    static void showArray(int[] temp){
        System.out.println(Arrays.toString(temp));
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
            showArray(arr);
        }
    }
}
