package Muaaz;

import java.util.Scanner;

public class Week7_4_StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = input.nextLine();

        String cleaned = original.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int index = cleaned.length() - 1; index >= 0; index--) {
            reversed = reversed + cleaned.charAt(index);
        }

        System.out.println("String after removing spaces and case: " + cleaned);

        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        input.close();
    }
}
