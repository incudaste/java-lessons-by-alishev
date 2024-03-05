package lessons;

class L14_ClassesAndObjects {
	
	public static void main(String[] args) {
		Human vasya = new Human();
		
		vasya.name = "Vasya";
		vasya.age = 21;
		vasya.growth = 177;
		vasya.weight = 74;
		
		System.out.println("Name: " + vasya.name
						  + "\nAge: " +vasya.age
						  + "\nGrowth: " + vasya.growth 
						  + "\nWeight: " + vasya.weight);
		
		Human elena = new Human();
		
		elena.name = "Elena";
		elena.age = 40;
		elena.growth = 163;
		elena.weight = 96;
		
		System.out.println("\nName: " + elena.name
						  + "\nAge: " + elena.age
						  + "\nGrowth: " + elena.growth
						  + "\nWeight: " + elena.weight);
	}
}

class Human {
	
	String name;
	byte age;
	short growth;
	short weight;
}