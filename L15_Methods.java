package lessons;

class L15_Methods {
	
	public static void main(String[] args) {
		Car fordMustang = new Car();
		
		fordMustang.brand = "Ford";
		fordMustang.model = "Mustang";
		fordMustang.price = 41603.052f;
		
		System.out.println("Car brand: " + fordMustang.brand
						  + "\nCar model: " + fordMustang.model
						  + "\nCar price: " + fordMustang.price + " USD\n");
		
		fordMustang.startMoving();
		fordMustang.turnRight();
		fordMustang.turnLeft();
		fordMustang.stop();
	}
}

class Car {
	
	String brand;
	String model;
	float price;
	
	void startMoving() {
		System.out.println("The car started moving.");
	}
	
	void stop() {
		System.out.println("The car has stopped.");
	}
	
	void turnRight() {
		System.out.println("The car turned right.");
	}
	
	void turnLeft() {
		System.out.println("The car turned left.");
	}
}                                                                          