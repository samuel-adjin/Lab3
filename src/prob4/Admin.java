package prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {

	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property prop : properties) {
			totalRent+=prop.computeRent();
		}
		return totalRent;
	}

	public static List<Property> getPropertiesInCity(String city,Property[] properties) {
		List<Property> propertiesInCity = new ArrayList<Property>();
		for (Property prop : properties) {
			if(prop.getAddress().getCity().equals(city)){
				propertiesInCity.add(prop);
			}
		}
		return propertiesInCity;
	}

}
