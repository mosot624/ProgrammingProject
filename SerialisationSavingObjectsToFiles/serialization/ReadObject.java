package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {

	public static void main(String[] args) {
		System.out.println("Reading Files");
		try(FileInputStream fis1 = new FileInputStream("People1.bin")){
			ObjectInputStream os1 = new ObjectInputStream(fis1);
			
			Person[] people = (Person[])os1.readObject();
			
			
			ArrayList<Person> peoplelist = (ArrayList<Person>)os1.readObject();
			System.out.println("First Way of doing it");

			for(Person person: people){
				System.out.println(person);
			}
			System.out.println("2nd way of doing it");

			for(Person person: peoplelist){
				System.out.println(person);
			}
			System.out.println("3rd way of doing it");
			
			int num = os1.readInt();
			System.out.println();
			for(int i = 0; i<num;i++){
				Person person = (Person)os1.readObject();
				System.out.println(person);
			}
			
			//System.out.println(person1);
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
