package Muaaz;

import java.util.Scanner;

public class Week7_1_BinarySearch {
    
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (array[middle] == key) {
                return middle;
            } else if (array[middle] < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter the element to search: ");
        int key = input.nextInt();

        int result = binarySearch(values, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result + ".");
        }

        input.close();
    }
}
