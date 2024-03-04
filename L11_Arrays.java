package lessons;

class L11_Arrays {

	public static void main(String[] args) {
		String[] pupils = new String[5];

		pupils[0] = "Vova";
		pupils[1] = "Nastya";
		pupils[2] = "Vika";
		pupils[3] = "Egor";
		pupils[4] = "Misha";

		System.out.println("List of pupils:");

		for (int index = 0; index < pupils.length; index++) {
			System.out.println((index + 1) + ". " + pupils[index]);
		}

		int[] numbers = {
			4, 13, 2024, 847,
			9382, -1, -48355
		};

		System.out.println("List of numbers:");

		for (int index2 = 0; index2 < numbers.length; index2++) {
			System.out.println(numbers[index2]);
		}

		int[] identifiers = new int[1000];

		System.out.println("List of user IDs:");

		for (short index3 = 0; index3 < identifiers.length; index3++) {
			System.out.println(index3 + 1);
		}
	}
}