package Muaaz;

import java.util.Scanner;

public class Week6_6_LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter the element to search: ");
        int searchValue = input.nextInt();

        int foundIndex = -1;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == searchValue) {
                foundIndex = index;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Element was not found in the array.");
        } else {
            System.out.println("Element found at index " + foundIndex + ".");
        }

        input.close();
    }
}
