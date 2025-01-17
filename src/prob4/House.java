package prob4;

public class House extends Property {
    private double lotSize;

    public House(double lotSize) {
        this.lotSize = lotSize;
    }

    public House(Address address, double lotSize) {
        super(address);
        this.lotSize = lotSize;
    }

    public double getLotSize() {
        return lotSize;
    }


    @Override
    double computeRent() {
        return 0.1 * lotSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "lotSize=" + lotSize +
                '}';
    }
}
