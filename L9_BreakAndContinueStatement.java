package lessons;

class L9_BreakAndContinueStatement {
	
	public static void main(String[] args) {
		int counter = 0;
		
		while (true) {
			counter++;
			System.out.println("Iteration №" + counter);
			if (counter == 10) {
				break;
			}
		}
		
		System.out.println("The loop is complete.\n");
		
		for (int counter2 = 0; counter2 <= 30; counter2++) {
			if (counter2 % 5 == 0) {
				continue;
			}
			System.out.println(counter2);
		}
		
		System.out.println("The loop is complete.");
	}
}