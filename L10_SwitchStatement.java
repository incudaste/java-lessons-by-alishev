package lessons;

import java.util.Scanner;

class L10_SwitchStatement {

	public static void main(String[] args) {
		Scanner scannedAge = new Scanner(System.in);

		System.out.print("Please enter your age: ");

		byte age = scannedAge.nextByte();

		if (age == 0) {
			System.out.println("The person was born.");
		} else if (age == 7) {
			System.out.println("The child went to school.");
		} else if (age == 18) {
			System.out.println("The pupil graduated from school.");
		} else if (age == 60) {
			System.out.println("The person is considered elderly.");
		} else {
			System.out.println("Not one of the cases.");
		}

		switch (age) {
			case 0:
				System.out.println("The person was born.");
				break;
			case 7:
				System.out.println("The child went to school.");
				break;
			case 18:
				System.out.println("The pupil graduated from school.");
				break;
			case 60:
				System.out.println("The person is considered elderly.");
				break;
			default:
				System.out.println("Not one of the cases.");
		}
		scannedAge.close();
	}
}
