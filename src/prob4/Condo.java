package prob4;

public class Condo extends Property {

    private int numOfFloors;
    private Address Address;
    private double rent;

    public Condo(int numOfFloors) {
        this.numOfFloors = numOfFloors;
        this.rent = (400 * numOfFloors);
    }

    @Override
    double computeRent() {
        return this.rent;
    }
}
