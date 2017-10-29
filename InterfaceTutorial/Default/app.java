package Default;

public class app {
	public static void main(String[] args) {

		machine mach1 = new machine();
		Info info1 = new machine();
		mach1.start();
		info1.showInfo();

		person per1 = new person("Bob");
		Info info2 = per1;
		per1.greet();
		info2.showInfo();

		System.out.println();
		outputInfo(mach1);
		outputInfo(per1);


		// System.out.println(per1.getName);
	}

	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
