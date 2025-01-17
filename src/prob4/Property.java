package prob4;

public abstract class Property {
    private Address address;

    public Property(Address address) {
        this.address = address;
    }

    public Property() {
    }

    abstract double computeRent();

    public Address getAddress() {
        return address;
    }
}
