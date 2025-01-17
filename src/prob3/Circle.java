package prob3;

public class Circle extends Cylinder{

    public Circle(double radius) {
        super(radius, 0.0);
    }

    public double computeArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
