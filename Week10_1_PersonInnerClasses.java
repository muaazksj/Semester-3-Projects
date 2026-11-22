package Muaaz;

class Person {
    String name, phone;
    Address address;
    DateOfBirth dateOfBirth;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    class Address {
        String houseNo, street, city, state;

        Address(String houseNo, String street, String city, String state) {
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        void displayAddr() {
            System.out.println("Address: " + houseNo + ", " + street + ", " + city + ", " + state);
        }
    }

    class DateOfBirth {
        int day, month, year;

        DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayDOB() {
            System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        address.displayAddr();
        dateOfBirth.displayDOB();
    }
}

public class Week10_1_PersonInnerClasses {
    public static void main(String[] args) {
        Person person = new Person("Amit Kumar", "9876543210");

        person.address = person.new Address("12", "University Road", "Aligarh", "Uttar Pradesh");
        person.dateOfBirth = person.new DateOfBirth(15, 8, 2005);

        person.display();
    }
}
