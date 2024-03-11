package lessons;

class L24_ObjectClassAndToStringMethod {

	public static void main(String[] args) {
		Room lounge = new Room();

		lounge.setName("Lounge");
		lounge.setArea((short) 70);

		System.out.println(lounge);
	}
}

class Room {

	@Override
	public String toString() {
		return "Room name: " + name + "\nRoom area: " + area + " square meters";
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	private short area;

	public void setArea(short area) {
		this.area = area;
	}
}