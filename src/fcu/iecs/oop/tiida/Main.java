package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NissanTiida nissanTiida = new NissanTiida();
		System.out.print("Please enter a number: ");
		for (int loop = scanner.nextInt(), i = 0; i < loop; i++) {
			nissanTiida.tiida();
		}
	}

}
