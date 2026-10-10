package Muaaz;

import java.util.Scanner;

public class Week7_3_ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = input.nextLine();

        String reversed = "";

        for (int index = original.length() - 1; index >= 0; index--) {
            reversed = reversed + original.charAt(index);
        }

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);

        input.close();
    }
}
