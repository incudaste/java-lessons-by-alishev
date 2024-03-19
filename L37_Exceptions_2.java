package lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class L37_Exceptions_2 {

	public static void main(String[] args) {
		try {
			readFile();
		} catch (FileNotFoundException exception) {
			System.out.println("An exception was handled in the main method.");
		}
	}

	public static void readFile() throws FileNotFoundException {
		File textFile = new File("txt");
		Scanner textFileScanner = new Scanner(textFile);
	}
}