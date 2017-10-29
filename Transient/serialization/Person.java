package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	private int id;
	private String name;
	private static int count;
	
	

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	
	public Person(){
		System.out.println("Regular constructor");
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two variable constructor");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ",count= "+ count  +"]";
	}

	

}
