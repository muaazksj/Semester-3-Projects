package Muaaz;

class FRUIT {
    String color;
    String taste;
    double price;

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }
}

public class Week8_1_FruitThreeObjects {
    public static void main(String[] args) {
        FRUIT firstFruit = new FRUIT();
        firstFruit.color = "Red";
        firstFruit.taste = "Sweet";
        firstFruit.price = 120.0;

        FRUIT secondFruit = new FRUIT();
        secondFruit.color = "Yellow";
        secondFruit.taste = "Sweet";
        secondFruit.price = 80.0;

        FRUIT thirdFruit = new FRUIT();
        thirdFruit.color = "Green";
        thirdFruit.taste = "Sour";
        thirdFruit.price = 60.0;

        firstFruit.display();
        secondFruit.display();
        thirdFruit.display();
    }
}
