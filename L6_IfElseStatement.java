package lessons;

class L6_IfElseStatement {
	
	public static void main(String[] args) {
		byte boyAge = 6;
		byte girlAge = 6;
		
		if(boyAge == girlAge) {
			System.out.println("The ages are equal.");
		} else {
			System.out.println("The ages are not equal.");
		}
		
		System.out.println();
		
		int salary = 160000;
		
		if(salary < 140000) {
			System.out.println("Salary increased by 10%.");
		} else if(salary > 190000) {
			System.out.println("Salary cut by 7%.");
		} else {
			System.out.println("Salary has not changed.");
		}
	}
}
