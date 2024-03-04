package lessons;

import java.util.Scanner;

class L8_DoWhileLoop {

	public static void main(String[] args) {
		Scanner scannedNumber = new Scanner(System.in);

		short number;

		do {
			System.out.print("Please enter \"99\": ");
			number = scannedNumber.nextShort();
		} while (number != 99);
		
		scannedNumber.close();
		
		System.out.println("Right!");
	}
}
