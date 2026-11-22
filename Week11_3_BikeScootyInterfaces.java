package Muaaz;

interface Bike {
    void offer();

    default void details() {
        System.out.println("Bike: 100 cc engine, mileage 60 km/l.");
    }
}

interface Scooty {
    void offer();

    default void details() {
        System.out.println("Scooty: 110 cc engine, lightweight and easy to ride.");
    }
}

class BuySomething implements Bike, Scooty {
    public void offer() {
        System.out.println("Offer: Rs. 5000 discount on any two-wheeler.");
    }

    public void details() {
        Bike.super.details();
        Scooty.super.details();
    }
}

public class Week11_3_BikeScootyInterfaces {
    public static void main(String[] args) {
        BuySomething purchase = new BuySomething();

        purchase.offer();
        purchase.details();
    }
}
