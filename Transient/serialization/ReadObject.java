package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {

	public static void main(String[] args) {
		System.out.println("Reading Files");
		try (ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("People1.bin"))) {

			Person person = (Person) os1.readObject();

			System.out.println(person);
			os1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
