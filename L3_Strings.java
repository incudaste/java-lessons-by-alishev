package lessons;

class L3_Strings {
	
	public static void main(String[] args) {
		String part1 = new String("I live ");
		String part2 = "in Russia!";
		
		System.out.println(part1 + part2);
		
		String americanCompanyName
			= new String("Advanced Micro Devices");
		String germanCompanyName = "Volkswagen";
		
		System.out.println(americanCompanyName
			+ " & " + germanCompanyName);
	}
}
