package phonecreator;

import java.util.ArrayList;

public class createNumbers {

	public ArrayList<String> generateAll(int prefix) {

		ArrayList<String> all = new ArrayList<String>();

		for (int i = 0; i <= 9999999; i++) {
			String formattedString = String.format("%07d", i); // Format additional zeroes leading the number
			String phoneNumber = Integer.toString(prefix) + formattedString;
			all.add(phoneNumber); // add phone number to arraylist
		}

		return all;

	}
}
