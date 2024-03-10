package lessons;

class L23_StringFormatting {

	public static void main(String[] args) {
		System.out.printf("1. First string (Sentence): %s", "\"My name is Roman!\"");

		System.out.printf("\n2. Second string (Number): %d", 10_438);

		System.out.printf("\n3. Third string (Float number): %f", 2.71828);

		System.out.printf("\n4. Fourth string (Short number with specified width): %10d", 123);

		System.out.printf("\n5. Fifth string (Medium number with specified width): %10d", 123456);

		System.out.printf("\n6. Sixth string (Long number with specified width): %10d", 123456789);

		System.out.printf("\n7. Seventh string "
			+ "(Float number with specified amount characters after comma): %.2f\n", 3.14159265359);
	}
}