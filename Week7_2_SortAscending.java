package Muaaz;

import java.util.Arrays;

public class Week7_2_SortAscending {
    public static void sortAscending(int[] array) {
        
        for (int pass = 0; pass < array.length - 1; pass++) {
            boolean swapped = false;

            for (int index = 0; index < array.length - 1 - pass; index++) {
                if (array[index] > array[index + 1]) {
                    int temporary = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temporary;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 8, 30, 19};

        System.out.println("Original array: " + Arrays.toString(numbers));
        sortAscending(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
    }
}
