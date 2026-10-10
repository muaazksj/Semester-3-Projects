package Muaaz;

public class Week6_4_MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {24, 7, 56, 12, 3, 41};

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > maximum) {
                maximum = numbers[index];
            }

            if (numbers[index] < minimum) {
                minimum = numbers[index];
            }
        }

        System.out.print("Array elements: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }

        System.out.println("\nMaximum element = " + maximum);
        System.out.println("Minimum element = " + minimum);
    }
}
