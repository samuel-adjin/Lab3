package prob4;

import java.util.List;

public class Driver {

	public static void main(String[] args) {

		Property[] properties = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);

		//get Properties In specific city
		Property[] propertiesInSpecificCities = { new House(new Address("Fairfield strt","Fairfield","Iowa","5222"),9000),
				new Condo(new Address("Fairfield strt","Fairfield","Iowa","5222"),2),
				new Trailer(new Address("New Jersey strt","New Jersey","New York","6222")),
	};
		List<Property> propertyList = Admin.getPropertiesInCity("Fairfield", propertiesInSpecificCities);
		for (Property property : propertyList) {
			System.out.println(property.toString());
		}
	}
}
