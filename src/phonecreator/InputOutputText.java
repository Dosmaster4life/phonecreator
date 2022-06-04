package phonecreator;

import java.util.Scanner;

public class InputOutputText {

	public int promptInput() { // get 3 digit area code for phone number
		System.out.println("Type a 3 digit area code to create a phone number list or 0 to exit");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println(s);
		if (Integer.parseInt(s) == 0) {
			return 0;
		}
		if (s.length() != 3 || (Integer.parseInt(s) < 1000) == false) { // recursive check for valid input
			System.out.println("invalid input, try again with a 3 digit number");
			return promptInput();
		}
		return Integer.parseInt(s);
	}

}
