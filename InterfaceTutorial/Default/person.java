package Default;

public class person implements Info {
	private String name;

	public person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello");
	}

	@Override
	public void showInfo() {
		System.out.println("My name is "+ name);
	}

}
