package lessons;

class L18_EncapsulationSettersAndGetters {
	
	public static void main(String[] args) {
		Food cake = new Food();
		
		cake.setName("Chocolate cake");
		cake.setPrice(6.49f);
		cake.setIsFit(true);
		
		System.out.println(cake.getName());
		System.out.println(cake.getPrice() + " USD");
		System.out.println(cake.getIsFit());
	}
}

class Food {
	
	private String name;
	private float price;
	private boolean isFit;
	
	public void setName(String receivedName) {
		if (receivedName.isEmpty()) {
			System.out.println("The field \"Name\" cannot be empty!");
		} else {
			name = receivedName;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(float receivedPrice) {
		if ((receivedPrice < 0) | (receivedPrice == 0)) {
			System.out.println("Field \"Price\" cannot be empty!");
		} else {
			price = receivedPrice;
		}
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setIsFit(boolean receivedIsFit) {
		isFit = receivedIsFit;
	}
	
	public boolean getIsFit() {
		return isFit;
	}
}