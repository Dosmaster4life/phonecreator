package phonecreator;

import java.util.ArrayList;

public class phonestart {

	public static void main(String[] args) {
		boolean isRunning = true;

		while (isRunning) {
			InputOutputText inputOutputHandler = new InputOutputText(); // Ask for input from the user
			int areaCode = inputOutputHandler.promptInput(); // Prompt for 3 digit area code
			if (areaCode == 0) {
				isRunning = false;
			}
			if (isRunning) {

				createNumbers create = new createNumbers();
				ArrayList<String> list = create.generateAll(areaCode); // Create all possible phone numbers for area
																		// code
				WriteFile w = new WriteFile();
				w.write(list, Integer.toString(areaCode) + ".txt"); // Write to file
			}

		}
	}

}
