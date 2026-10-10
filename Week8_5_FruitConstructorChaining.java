package Muaaz;

class FRUIT {
    String color;
    String taste;
    double price;

    FRUIT() {
        this("Unknown");
    }

    FRUIT(String color) {
        this(color, "Unknown");
    }

    FRUIT(String color, String taste) {
        this(color, taste, 0.0);
    }

    FRUIT(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    void display() {
        System.out.println("Color: " + color + ", Taste: " + taste
                + ", Price: " + price);
    }
}

public class Week8_5_FruitConstructorChaining {
    public static void main(String[] args) {
        FRUIT first = new FRUIT();
        FRUIT second = new FRUIT("Red");
        FRUIT third = new FRUIT("Yellow", "Sweet");
        FRUIT fourth = new FRUIT("Green", "Sour", 45.0);

        System.out.println("Default constructor:");
        first.display();

        System.out.println("One-argument constructor:");
        second.display();

        System.out.println("Two-argument constructor:");
        third.display();

        System.out.println("Three-argument constructor:");
        fourth.display();
    }
}
