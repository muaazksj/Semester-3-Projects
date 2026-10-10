package Muaaz;

class FRUIT {
    String color;
    String taste;
    double price;

    void setDetails(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    void display() {
        System.out.println("Fruit details:");
        System.out.println("Color = " + color);
        System.out.println("Taste = " + taste);
        System.out.println("Price = " + price);
    }
}

public class Week8_2_FruitSetDetails {
    public static void main(String[] args) {
        FRUIT fruit = new FRUIT();

        fruit.setDetails("Orange", "Citrus", 90.0);
        fruit.display();
    }
}
