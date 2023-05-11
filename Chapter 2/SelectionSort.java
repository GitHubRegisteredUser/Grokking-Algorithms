package GrokkingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    static int count = 0;

    static int[] sSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
                count++;
            }
            if (i != minIndex) {
                temp = array[i];
                array[i] = min;
                array[minIndex] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
        sSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }

}
