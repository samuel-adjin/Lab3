package prob4;

public class Trailer extends Property{
    private static final double RENT = 500.0;

    public Trailer(Address address) {
        super(address);
    }

    public Trailer() {
    }

    @Override
    double computeRent() {
        return RENT;
    }

    @Override
    public String toString() {
        return "Trailer{}";
    }
}
