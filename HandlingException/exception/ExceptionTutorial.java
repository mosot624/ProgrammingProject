package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTutorial {

	public static void main(String[] args) {
		File file1 = new File("password.txt");
		try {
			FileReader filereader1 = new FileReader(file1);
			System.out.println("File not found " + file1.toString());

		} catch (FileNotFoundException e) {
			System.out.println("File not found :" + file1.toString());
		}
		System.out.println("Finnished");
	}

}
