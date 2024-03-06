package lessons;

class L17_MethodParameters {
	
	public static void main(String[] args) {
		User andrey = new User();
		andrey.setUsername("andreyboev2001");
		
		System.out.println("User 1 (Username): " + andrey.username + "\n");
		
		User egor = new User();
		egor.setIdentifier(3974);
		
		System.out.println("User 2 (Identifier): " + egor.identifier + "\n");
		
		User nastya = new User();
		nastya.setBalance(93.162);
		
		System.out.println("User 3 (Balance): " + nastya.balance + " USD\n");
		
		User kirill = new User();
		kirill.setAllInfo("notkirillhaha", 85401, 907.4);
		
		System.out.println("User 4 (All the information): "
						  + kirill.username + ", "
						  + kirill.identifier + ", "
						  + kirill.balance);
	}
}

class User {
	
	String username;
	int identifier;
	double balance;

	void setUsername(String receivedUsername) {
		username = receivedUsername;
	}

	void setIdentifier(int receivedIdentifier) {
		identifier = receivedIdentifier;
	}

	void setBalance(double receivedBalance) {
		balance = receivedBalance;
	}
	
	void setAllInfo(String receivedUsername, 
					int receivedIdentifier,
					double receivedBalance) {
		username = receivedUsername;
		identifier = receivedIdentifier;
		balance = receivedBalance;
	}
}