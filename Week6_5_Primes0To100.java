package Muaaz;

public class Week6_5_Primes0To100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 100 are:");

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}
