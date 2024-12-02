package lab8;

public class GeometryCalculator {
    public static void main(String[] args) {
        // Create an object of CircleAndSphere with an initial radius of 5
        CircleAndSphere shape = new CircleAndSphere(5);
        
        // Display the current radius
        System.out.println("Current radius: " + shape.getRadius());
        
        // Calculate and print all the properties using the initial radius (5)
        System.out.println("Circumference of Circle: " + shape.calculateCircumference());
        System.out.println("Area of Circle: " + shape.calculateAreaOfCircle());
        System.out.println("Volume of Sphere: " + shape.calculateVolumeOfSphere());
        System.out.println("Surface Area of Sphere: " + shape.calculateSurfaceAreaOfSphere());
        
        // Change the radius to 10 (mutable operation)
        shape.setRadius(10);
        System.out.println("\nUpdated radius: " + shape.getRadius());
        
        // Calculate and print all the properties using the new radius (10)
        System.out.println("Circumference of Circle: " + shape.calculateCircumference());
        System.out.println("Area of Circle: " + shape.calculateAreaOfCircle());
        System.out.println("Volume of Sphere: " + shape.calculateVolumeOfSphere());
        System.out.println("Surface Area of Sphere: " + shape.calculateSurfaceAreaOfSphere());
    }
}
