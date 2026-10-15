package Muaaz;

import java.util.Scanner;

public class Week3_2_MultiplyFloatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first floating number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second floating number: ");
        double b = sc.nextDouble();

        System.out.println("Product = " + (a * b));
    }
}
