package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {

	public static void main(String[] args) {
		Person pr1 = new Person(123, "Jason");
		System.out.println(pr1);
		
		Person.setCount(123);
		
		try (ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("People1.bin"))) {
			os1.writeObject(pr1);

			os1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
