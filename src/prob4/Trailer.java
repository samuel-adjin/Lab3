package prob4;

public class Trailer extends Property{
    private Address Address;
    private static final double RENT = 500.0;
    @Override
    double computeRent() {
        return RENT;
    }
}
