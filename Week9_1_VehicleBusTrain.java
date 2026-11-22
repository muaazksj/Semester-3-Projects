package Muaaz;

class Vehicle {
    void cost() {
        System.out.println("Cost of a vehicle depends on its type.");
    }
}

class Bus extends Vehicle {
    void display() {
        System.out.println("Bus: runs on roads, ticket costs Rs. 50.");
    }
}

class Train extends Vehicle {
    void display() {
        System.out.println("Train: runs on rails, ticket costs Rs. 200.");
    }
}

public class Week9_1_VehicleBusTrain {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();

        System.out.println("Bus object:");
        bus.cost();
        bus.display();

        System.out.println("Train object:");
        train.cost();
        train.display();
    }
}
