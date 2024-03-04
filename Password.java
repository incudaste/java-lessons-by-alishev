package pkg;

import java.util.Scanner;

public class Password {
	
	private static Scanner scannedPassword
		= new Scanner(System.in);
	
	private static String password;
	
	public static void askPassword() {
		System.out.println("Enter the password: ");
	}
	
	public static void setPassword() {
		password = scannedPassword.nextLine();
	}
	
	public static void checkPassword() {
		switch(password) {
			case "qwerty": {
				System.out.println("Low password!");
				break;
			}
			case "admin": {
				System.out.println("Low password!");
				break;
			}
			default: {
				System.out.println("Alright!");
			}
		}
	}
}
