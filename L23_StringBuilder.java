package lessons;

class L23_StringBuilder {

	public static void main(String[] args) {
		String password = "qwerty123";
		System.out.println("Old value of variable (without method): " + password);

		password = password.toUpperCase();
		System.out.println("New value of variable (with method): " + password);

		long startTimeMillis1 = System.currentTimeMillis();

		String greeting = "\nWelcome, ";
		String user = "User! ";
		String question = "How are you?";
		String firstResult = greeting + user + question;

		System.out.println(firstResult);

		long endTimeMillis1 = System.currentTimeMillis();

		System.out.println("Concatenation time (1): " + (endTimeMillis1 - startTimeMillis1) + " ms");

		long startTimeMillis2 = System.currentTimeMillis();

		StringBuilder secondResult = new StringBuilder();

		secondResult.append(greeting).append(user).append(question);

		System.out.println(secondResult);

		long endTimeMillis2 = System.currentTimeMillis();

		System.out.println("Concatenation time (2): " + (endTimeMillis2 - startTimeMillis2) + " ms");
	}
}