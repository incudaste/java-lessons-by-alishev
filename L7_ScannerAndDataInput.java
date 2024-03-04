package lessons;

import java.util.Scanner;

class L7_ScannerAndDataInput {
	
	public static void main(String[] args) {
		Scanner scannedUserName = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		
		String userName = scannedUserName.nextLine();
		scannedUserName.close();
		
		System.out.println("Hi, " + userName + "!" + " What's up?");
	}
}