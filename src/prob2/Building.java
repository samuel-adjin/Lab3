package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apartmentList = new ArrayList<Apartment>();
    private double maintenanceCost;

    public Building(double maintenanceCost, double rentFirstApt) {
        this.maintenanceCost = maintenanceCost;
        this.addApartment(new Apartment(rentFirstApt));
    }

    public void addApartment(Apartment apartment) {
        this.apartmentList.add(apartment);
    }

    public double calcProfit() {
        double profit = 0.0;
        for(Apartment apartment : apartmentList) {
           profit+=apartment.getRent();
        }
        return profit-maintenanceCost;
    }
}
