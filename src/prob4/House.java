package prob4;

public class House extends Property {
    private Address Address;
    private double lotSize;
    private double rent;

    public House(double lotSize) {
        this.lotSize = lotSize;
        this.rent = 0.1 * lotSize ;
    }

    public double getLotSize() {
        return lotSize;
    }

    @Override
    double computeRent() {
        return this.rent;
    }
}
