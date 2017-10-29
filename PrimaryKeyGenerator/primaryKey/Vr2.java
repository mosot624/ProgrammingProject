package primaryKey;

import java.util.Scanner;

public class Vr2 {

	public static void main(String[] args) {
		int j =1;
		while(j==j){
		Scanner input = new Scanner(System.in);
		int num;
		boolean isPrime = true;

		System.out.println("Enter your number");
		num = input.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Is prime");

		} else {
			System.out.println("not a prime number");
		}

	}
	}
}