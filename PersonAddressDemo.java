// Demonstrates object containment, chained dot expressions, and null safety.
class Address {
    String street;
    String city;
    String country;
}

class Person {
    String name;
    int age;
    Address address;
}

public class PersonAddressDemo {
    public static void main(String[] args) {
        // Person with a valid address
        Address addr = new Address();
        addr.street = "Samora Machel Avenue";
        addr.city = "Harare";
        addr.country = "Zimbabwe";

        Person p1 = new Person();
        p1.name = "Anesu";
        p1.age = 20;
        p1.address = addr;

        // Chained dot expression to print city
        System.out.println(p1.name + " lives in: " + p1.address.city);

        // Person with null address to show null handling
        Person p2 = new Person();
        p2.name = "Kundai";
        p2.age = 21;
        p2.address = null;

        System.out.println("\nChecking person with null address:");
        if (p2.address != null) {
            System.out.println(p2.name + " lives in: " + p2.address.city);
        } else {
            System.out.println(p2.name + "'s address is null! Checking before access prevents NullPointerException.");
        }
    }
}
