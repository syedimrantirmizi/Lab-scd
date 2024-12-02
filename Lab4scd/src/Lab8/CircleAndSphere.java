package lab8;

public class CircleAndSphere {
    private double radius;

    // Constructor to initialize the radius
    public CircleAndSphere(double radius) {
        this.radius = radius;
    }

    // Setter to modify radius (mutable property)
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter to retrieve the radius
    public double getRadius() {
        return radius;
    }

    // Circumference of circle: C = 2 π r
    public double calculateCircumference() {
        return 2 * Pi.VALUE * radius;
    }

    // Area of circle: A = π r²
    public double calculateAreaOfCircle() {
        return Pi.VALUE * radius * radius;
    }

    // Volume of sphere: V = (4/3) π r³
    public double calculateVolumeOfSphere() {
        return (4.0 / 3.0) * Pi.VALUE * Math.pow(radius, 3);
    }

    // Surface area of sphere: A = 4 π r²
    public double calculateSurfaceAreaOfSphere() {
        return 4 * Pi.VALUE * radius * radius;
    }

    // String representation of the object
    @Override
    public String toString() {
        return "Radius: " + radius;
    }
}

