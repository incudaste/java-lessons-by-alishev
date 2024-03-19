package lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class L37_Exceptions_1 {

	public static void main(String[] args) {
		File passwordsListFile = new File("passwordsList.txt");

		try {
			Scanner passwordsListFileScanner = new Scanner(passwordsListFile);
		} catch (FileNotFoundException exception) {
			System.out.println("File not found!");
		}

		System.out.println("\nThe execution of the code continues...");
	}
}