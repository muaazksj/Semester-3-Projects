package Muaaz;

class FRUIT {
    String color;
    String taste;
    double price;

    FRUIT() {
        color = "Unknown";
        taste = "Unknown";
        price = 0.0;
    }

    FRUIT(String color) {
        this.color = color;
        taste = "Unknown";
        price = 0.0;
    }

    FRUIT(String color, String taste) {
        this.color = color;
        this.taste = taste;
        price = 0.0;
    }

    void display() {
        System.out.println("Color: " + color + ", Taste: " + taste
                + ", Price: " + price);
    }
}

public class Week8_4_FruitOverloadedConstructors {
    public static void main(String[] args) {
        FRUIT first = new FRUIT();
        FRUIT second = new FRUIT("Red");
        FRUIT third = new FRUIT("Yellow", "Sweet");

        System.out.println("Object created with default constructor:");
        first.display();

        System.out.println("Object created with one-argument constructor:");
        second.display();

        System.out.println("Object created with two-argument constructor:");
        third.display();
    }
}
