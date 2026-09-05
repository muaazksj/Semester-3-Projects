package Muaaz;

public class Week5_1_Array10To100 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10;
        }

        System.out.println("Array elements:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
