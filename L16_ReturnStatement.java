package lessons;

class L16_ReturnStatement {
	
	public static void main(String[] args) {
		WholeNumber number1 = new WholeNumber();
		number1.value = 7;
		
		System.out.println(number1.checkParity());
		
		WholeNumber number2 = new WholeNumber();
		number2.value = -31_026;
		
		System.out.println(number2.checkParity());
		
		WholeNumber number3 = new WholeNumber();
		number3.value = 630_158_408;
		
		System.out.println(number3.checkParity());
	}
}

class WholeNumber {
	
	long value;
	boolean isEvenNumbered;
	
	boolean checkParity() {
		isEvenNumbered = value % 2 == 0;
		return isEvenNumbered;
	}
}