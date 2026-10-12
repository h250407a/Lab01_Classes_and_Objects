// Implements Car class with antique check for Lab 1 exercises 1 and 2.
public class Car {
    String brand;
    int year;
    double mileage;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Mileage: " + mileage + " km");
    }

    // Returns true if car was manufactured more than 25 years ago (using current year 2026)
    boolean isAntique() {
        int currentYear = 2026;
        return (currentYear - year) > 25;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota Corolla";
        car1.year = 2018;
        car1.mileage = 65000.5;

        Car car2 = new Car();
        car2.brand = "Mercedes Benz W123";
        car2.year = 1985;
        car2.mileage = 240000.0;

        Car car3 = new Car();
        car3.brand = "Mazda Demio";
        car3.year = 2012;
        car3.mileage = 110000.2;

        System.out.println("--- Car Details ---");
        car1.display();
        System.out.println("Is Antique? " + car1.isAntique());

        car2.display();
        System.out.println("Is Antique? " + car2.isAntique());

        car3.display();
        System.out.println("Is Antique? " + car3.isAntique());
    }
}
