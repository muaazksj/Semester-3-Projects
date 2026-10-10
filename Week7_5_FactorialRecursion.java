package Muaaz;

import java.util.Scanner;

public class Week7_5_FactorialRecursion {
    
    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        if (number < 0 || number > 20) {
            System.out.println("Please enter a number from 0 to 20.");
        } else {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " = " + result);
        }

        input.close();
    }
}
