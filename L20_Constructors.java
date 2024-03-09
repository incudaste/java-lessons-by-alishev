package lessons;

class L20_Constructors {

	public static void main(String[] main) {
		Person friend = new Person();
	}
}

class Person {

	private String name;
	private int age;

	Person() {
		this.name = "Person";
		this.age = 0;
		System.out.println("Constructor 1 (Sets the default values)");
		System.out.println(name + ", " +age);
	}

	Person(String name) {
		this.name = name;
		System.out.println("Constructor 2 (Sets the value for \"name\" field)");
		System.out.println(name);
	}

	Person(int age) {
		System.out.println("Contructor 3 (Sets the value for \"age\" field)");
		this.age = age;
		System.out.println(age);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Constructor 4 (Sets the values for fields \"name\" and \"age\")");
		System.out.println(name + ", " + age);
	}
}