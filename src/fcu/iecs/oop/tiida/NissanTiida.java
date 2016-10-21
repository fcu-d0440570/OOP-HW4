package fcu.iecs.oop.tiida;

public class NissanTiida {
	private static int count = 1;

	public void tiida() {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		count++;
	}
}
