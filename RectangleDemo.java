// Demonstrates Rectangle geometry, array scanning, and reference aliasing.
class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Rectangle [" + width + " x " + height + "] - Area: " + area() + ", Perimeter: " + perimeter());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        // Exercise 3: Array of 5 rectangles
        Rectangle[] list = new Rectangle[5];
        double[][] dimensions = {
            {3.0, 4.0},
            {5.5, 2.0},
            {8.0, 6.0},
            {1.5, 9.0},
            {4.0, 7.0}
        };

        for (int i = 0; i < list.length; i++) {
            list[i] = new Rectangle();
            list[i].width = dimensions[i][0];
            list[i].height = dimensions[i][1];
            list[i].display();
        }

        // Find rectangle with the largest area
        Rectangle maxRect = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].area() > maxRect.area()) {
                maxRect = list[i];
            }
        }
        System.out.println("\n--- Largest Rectangle ---");
        System.out.println("Largest Area: " + maxRect.area() + " (Width=" + maxRect.width + ", Height=" + maxRect.height + ")");

        // Exercise 4: Aliasing prediction and verification
        System.out.println("\n--- Exercise 4: Aliasing Test ---");
        Rectangle r1 = new Rectangle();
        r1.width = 10.0;
        r1.height = 20.0;

        Rectangle r2 = r1; // r2 now points to the exact same object as r1
        r2.width = 99.0;   // Mutating via r2 modifies the underlying shared object

        System.out.println("r1.width after changing r2.width: " + r1.width);
        // Explanation: r1.width is 99.0 because r2 and r1 are reference variables pointing to the same heap memory.
    }
}
