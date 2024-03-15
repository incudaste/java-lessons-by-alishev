package lessons;

import java.util.List;
import java.util.ArrayList;

class L33_Generics {

	public static void main(String[] args) {
		// Before Java 5
		List names = new ArrayList();

		names.add("Viktor");
		names.add("Alexey");
		names.add("Ekaterina");
		names.add("Olga");
		names.add("Yaroslav");

		String name = (String) names.get(2);

		System.out.println("The traveler's name is " + name + ".");

		// Java 5 (Emergence of Generics)
		List<String> capitals = new ArrayList<String>();

		capitals.add("Moscow");
		capitals.add("London");
		capitals.add("Stockholm");
		capitals.add("Tokio");
		capitals.add("Berlin");

		String capital = capitals.get(0);

		System.out.println(name + " is from " + capital + ".");

		// Java 7 (Don’t have to specify the <type> on the right)
		List<String> countries = new ArrayList<>();

		countries.add("Finland");
		countries.add("China");
		countries.add("Belgium");
		countries.add("Australia");
		countries.add("United States of America");

		String country = countries.get(3);

		System.out.println("She wants to visit " + country + ".");
	}
}