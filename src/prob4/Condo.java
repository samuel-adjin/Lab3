package prob4;

public class Condo extends Property {

    private int numOfFloors;

    public Condo(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public Condo(Address address, int numOfFloors) {
        super(address);
        this.numOfFloors = numOfFloors;
    }

    @Override
    double computeRent() {
        return (400 * numOfFloors);
    }

    @Override
    public String toString() {
        return "Condo{" +
                "numOfFloors=" + numOfFloors +
                '}';
    }
}
