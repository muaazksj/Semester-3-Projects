package Muaaz;

class ObjectOriented {
    void abstraction() {
        System.out.println("Abstraction: hiding internal details, showing only essentials.");
    }

    void polymorphism() {
        System.out.println("Polymorphism: one interface, many forms.");
    }

    void inheritance() {
        System.out.println("Inheritance: a class acquires properties of another class.");
    }
}

class JavaLanguage extends ObjectOriented {
    void persistence() {
        System.out.println("Persistence: object state can be saved and restored.");
    }

    void interfaces() {
        System.out.println("Interfaces: define a contract that classes implement.");
    }
}

public class Week10_4_ObjectOrientedJavaLanguage {
    public static void main(String[] args) {
        JavaLanguage language = new JavaLanguage();

        language.abstraction();
        language.polymorphism();
        language.inheritance();
        language.persistence();
        language.interfaces();
    }
}
