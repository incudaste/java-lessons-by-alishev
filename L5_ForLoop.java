package lessons;

class L5_ForLoop {
	
	public static void main(String[] args) {
		for (int counter = 1; counter <= 10; counter++) {
			System.out.println("Iteration №" + counter);
		}
		
		System.out.println();
		
		for (int counter = 10; counter >= 1; counter--) {
			System.out.println("Iteration №" + counter);
		}
	}
}
