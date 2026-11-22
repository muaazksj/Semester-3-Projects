package Muaaz;

public class Week10_3_MinMaxAddOverloading {
    static void minMaxAdd(int first, int second) {
        System.out.println("Integers: " + first + ", " + second);
        System.out.println("Minimum = " + Math.min(first, second));
        System.out.println("Maximum = " + Math.max(first, second));
        System.out.println("Addition = " + (first + second));
    }

    static void minMaxAdd(double first, double second) {
        System.out.println("Real numbers: " + first + ", " + second);
        System.out.println("Minimum = " + Math.min(first, second));
        System.out.println("Maximum = " + Math.max(first, second));
        System.out.println("Addition = " + (first + second));
    }

    static void minMaxAdd(char first, char second) {
        System.out.println("Characters: " + first + ", " + second);
        System.out.println("Minimum = " + (char) Math.min(first, second));
        System.out.println("Maximum = " + (char) Math.max(first, second));
        System.out.println("Addition of character codes = " + (first + second));
    }

    public static void main(String[] args) {
        minMaxAdd(25, 40);
        minMaxAdd(12.5, 7.25);
        minMaxAdd('A', 'Z');
    }
}
