package Muaaz;

class Edible {
    static class Fruit {
        static void fruitDetails() {
            System.out.println("Fruit details: mango is sweet and rich in vitamins.");
        }

        void fruitPackaging() {
            System.out.println("Fruit packaging: packed in cardboard boxes.");
        }
    }

    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("Vegetable details: spinach is green and rich in iron.");
        }

        void vegetablePackaging() {
            System.out.println("Vegetable packaging: packed in net bags.");
        }
    }
}

public class Week10_2_EdibleStaticClasses {
    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();

        Edible.Fruit fruit = new Edible.Fruit();
        Edible.Vegetable vegetable = new Edible.Vegetable();

        fruit.fruitPackaging();
        vegetable.vegetablePackaging();
    }
}
