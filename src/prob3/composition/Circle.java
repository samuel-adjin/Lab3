package prob3.composition;

public class Circle {
    private Cylinder cylinder;

    public Circle(double radius) {
        this.cylinder = new Cylinder(radius, 0.0);
    }

    public double getRadius() {
        return this.cylinder.getRadius();
    }

    public double computeArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
