package exception2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {

	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			//the message is not helping anyone because its too vague.
			System.out.println("File not found");
		}

	}

	public static void openFile() throws FileNotFoundException {
		File file1 = new File("password.txt");

		FileReader filereader1 = new FileReader(file1);
		System.out.println("File found " + file1.toString());

	}

}
