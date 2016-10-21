package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PasswordEncorder passwordEncorder = new PasswordEncorder();
		String input;
		do {
			System.out.print("Please enter a password:");
			input = scanner.next();
			if (input.equals("exit"))
				break;
			System.out.println(passwordEncorder.encode(input));
		} while (true);
		System.out.println("You had exited.");
	}

}
