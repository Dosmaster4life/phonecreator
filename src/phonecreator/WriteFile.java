package phonecreator;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class WriteFile {
	
	public boolean write(ArrayList<String> data, String fileName) {
		ReadFileExist checker = new ReadFileExist();
		boolean proceed = checker.checkFileExist(fileName); // Only Write if file doesn't exist
		System.out.println("Writing ...");
		if (!proceed) {
			File i = new File(fileName);

			try {

				if (i.createNewFile()) {
					FileWriter writer = new FileWriter(fileName);
					for (String s : data) { // Write each phone number in arraylist
						String finishedPhoneNum = s.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3"); // format in
																										// 123-111-4311
						writer.write(finishedPhoneNum + '\n'); // Write to file
					}
					writer.close();
					System.out.println("File Written Successfully");
					return true;
					
				}
			} catch (IOException e) {
				System.out.println("File failed to be written to.");
				return false;
			}
			
		}else {
			return false;
		}
		return true;
	}
}
