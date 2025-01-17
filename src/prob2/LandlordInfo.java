package prob2;

import java.util.List;

public class LandlordInfo {

    private List<Building> buildings;

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public double calcProfit() {
        double profit = 0.0;
        for (Building building : buildings) {
            profit += building.calcProfit();
        }
        return profit;
    }
}
