package lessons;

class L19_ThisKeyword {

	public static void main(String[] args) {
		Person nikolay = new Person();

		nikolay.setName("Nikolay");
		nikolay.setAge((byte) 39);
		nikolay.setGrowth((short) 183);
		nikolay.setWeight((short) 90);

		System.out.println("Name: " + nikolay.getName());
		System.out.println("Age: " + nikolay.getAge() + " years");
		System.out.println("Growth: " + nikolay.getGrowth() + " cm");
		System.out.println("Weight: " + nikolay.getWeight() + " kg");
	}
}

class Person {

	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	byte age;

	public void setAge(byte age) {
		this.age = age;
	}

	public byte getAge() {
		return age;
	}

	short growth;

	public void setGrowth(short growth) {
		this.growth = growth;
	}

	public short getGrowth() {
		return growth;
	}

	short weight;

	public void setWeight(short weight) {
		this.weight = weight;
	}

	public short getWeight() {
		return weight;
	}
}