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

		Person[] people = { new Person(3, "Jeff"), new Person(66, "Jay"), new Person(123, "BoB") };

		ArrayList<Person> peoplelist = new ArrayList<Person>(Arrays.asList(people));

		try (FileOutputStream fos1 = new FileOutputStream("People1.bin")) {
			ObjectOutputStream os1 = new ObjectOutputStream(fos1);
			//first way
			os1.writeObject(people);
			
			//2nd way
			os1.writeObject(peoplelist);
			
			//third way
			os1.writeInt(peoplelist.size());
			
			for(Person person: peoplelist){
				os1.writeObject(person);
				
			}
			
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
