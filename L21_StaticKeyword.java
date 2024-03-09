package lessons;

class L21_StaticKeyword {

	public static void main(String[] args) {
		Country norway = new Country();

		norway.setPopulation(5_514_477);
		System.out.println("Norway population: " + norway.getPopulation() + " people");

		Country denmark = new Country();

		denmark.setPopulation(5_939_695);
		System.out.println("Denmark population: " + denmark.getPopulation() + " people");

		Country finland = new Country();

		finland.setPopulation(5_549_886);
		System.out.println("Finland population: " + finland.getPopulation() + " people");

		Country.setLifeLevel("Very high");
		System.out.println("Level of life in these countries: " + Country.getLifeLevel());

		System.out.println("\nClass \"Math\" (Static methods):");
		System.out.println("1. " + Math.round(10.69f));
		System.out.println("2. " + Math.sqrt(49));
		System.out.println("3. " + Math.pow(5, 3));
		System.out.println("4. " + Math.PI);
	}
}

class Country {

	private static String lifeLevel;

	public static void setLifeLevel(String lifeLevel) {
		Country.lifeLevel = lifeLevel;
	}

	public static String getLifeLevel() {
		return Country.lifeLevel;
	}

	private int population;

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPopulation() {
		return population;
	}
}