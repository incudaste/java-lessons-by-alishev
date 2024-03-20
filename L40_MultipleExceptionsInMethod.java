package lessons;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

class L40_MultipleExceptionsInMethod {

	public static void main(String[] args) throws IOException,
												   ParseException,
												   SQLException {
		try {
			runSearch();
		} catch (IOException | ParseException | SQLException exception) {
			System.out.println("Exception was thrown out!");
		}
	}

	public static void runSearch() throws IOException,
										   ParseException,
										   SQLException {
	}
}