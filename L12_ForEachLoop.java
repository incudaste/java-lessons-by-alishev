package lessons;

class L12_ForEachLoop {
	
	public static void main(String[] args) {
		String[] carBrands = {
			"Volvo", "Toyota", "Ford",
			"Kia", "Audi", "Honda",
			"Opel", "Nissan", "Mazda",
			"Peugeot", "Renault", "BMW"
		};
		
		var counter = 0;
		
		for (var carBrand : carBrands) {
			counter++;
			System.out.println(counter + ". "
				+ carBrand);
		}
		
		for (var counter2 = 0;
				counter2 < carBrands.length;
				counter2++) {
			System.out.println((counter2 + 1)
				+ ". " + carBrands[counter2]);
		}
	}
}