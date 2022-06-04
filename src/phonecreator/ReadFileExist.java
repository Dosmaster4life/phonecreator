package phonecreator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExist {

	public boolean checkFileExist(String path) { // returns whether a file exist so duplicates are not created
		File i = new File(path);
		try {
			Scanner fileReader = new Scanner(i);
		} catch (FileNotFoundException e) {
			return false;
		}
		System.out.println(path + "File already exist, this list has already been generated.");
		return true;
	}

}
