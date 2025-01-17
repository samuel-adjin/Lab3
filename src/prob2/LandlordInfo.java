package prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {

    private List<Building> buildings = new ArrayList<Building>();

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public double calcProfits() {
        double profit = 0.0;
        for (Building building : buildings) {
            profit += building.calcProfit();
        }
        return profit;
    }
}
