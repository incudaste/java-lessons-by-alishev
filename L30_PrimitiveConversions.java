package lessons;

class L30_PrimitiveConversions {

	public static void main(String[] args) {
		float floatNumber = 3.0126F;

		double doubleNumber = floatNumber;

		System.out.println("Double -> Float: " + floatNumber);

		long longNumber = 5_000_000L;

		int intNumber = (int) longNumber;

		System.out.println("Long -> Int: " + longNumber);

		byte byteNumber = (byte) 130;

		System.out.println("\n" + byteNumber);
	}
}