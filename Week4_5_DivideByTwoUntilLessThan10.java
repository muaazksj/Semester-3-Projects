package Muaaz;

import java.util.Scanner;

public class Week4_5_DivideByTwoUntilLessThan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        while (n >= 10) {
            n = n / 2;
            System.out.println("After division = " + n);
        }

        System.out.println("Final value = " + n);
    }
}
