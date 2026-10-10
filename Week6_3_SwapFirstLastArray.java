package Muaaz;

import java.util.Arrays;

public class Week6_3_SwapFirstLastArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(numbers));

        int temporary = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temporary;

        System.out.println("Array after swapping first and last elements:");
        System.out.println(Arrays.toString(numbers));
    }
}
