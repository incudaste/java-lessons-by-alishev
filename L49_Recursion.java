package lessons;

public class Main {

	public static void main(String[] args) {
		countToZero(5);

		System.out.println("\n" + factorial(5));
	}

	private static void countToZero(int number) {
		if (number == -1) {
			return;
		}

		System.out.println(number);

		countToZero(number - 1);
	}

	private static int factorial(int number) {
		if (number == 1) {
			return number;
		}

		int nextNumber = factorial(number - 1);

		return number * nextNumber;
	}
}