package prob3;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeVolume() {
        return Math.PI * Math.pow(this.radius,2) * this.height;
    }


}
