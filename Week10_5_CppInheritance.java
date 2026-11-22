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

class CPlusPlus extends ObjectOriented {
    void template() {
        System.out.println("Template: write generic code that works with any data type.");
    }

    void friendFunction() {
        System.out.println("Friend function: a non-member function that can access private data.");
    }
}

public class Week10_5_CppInheritance {
    public static void main(String[] args) {
        CPlusPlus language = new CPlusPlus();

        language.abstraction();
        language.polymorphism();
        language.inheritance();
        language.template();
        language.friendFunction();
    }
}
