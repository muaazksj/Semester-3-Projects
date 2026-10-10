package Muaaz;

import java.util.Scanner;

public class Week7_6_FibonacciWithWithoutRecursion {
    
    public static int fibonacciRecursive(int position) {
        if (position == 0 || position == 1) {
            return position;
        }

        return fibonacciRecursive(position - 1)
                + fibonacciRecursive(position - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms (1 to 15): ");
        int terms = input.nextInt();

        if (terms < 1 || terms > 15) {
            System.out.println("Please enter a value from 1 to 15.");
            input.close();
            return;
        }

        System.out.println("Fibonacci series without recursion:");
        int first = 0;
        int second = 1;

        for (int count = 1; count <= terms; count++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("\nFibonacci series with recursion:");
        for (int count = 0; count < terms; count++) {
            System.out.print(fibonacciRecursive(count) + " ");
        }

        System.out.println();
        input.close();
    }
}
