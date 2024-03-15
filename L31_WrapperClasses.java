package lessons;

class L31_WrapperClasses {

	public static void main(String[] args) {
		int integerNumberPrimitive = 10;

		Integer integerNumberObject = 11;

		System.out.println(integerNumberPrimitive + " - Primitive");
		System.out.println(integerNumberObject.floatValue() + " - Object with running method");
		System.out.println(Integer.max(53, 222) + " - Max of 2 integers");

		Float floatNumberObject = 99.9F; // It's a boxing! (Primitive -> Object)

		float floatNumberPrimitive = floatNumberObject; // It's an unboxing! (Object -> Primitive)
	}
}