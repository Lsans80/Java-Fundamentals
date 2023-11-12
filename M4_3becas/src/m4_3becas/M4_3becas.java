package m4_3becas;

import java.util.Scanner;

public class M4_3becas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int MAYOREDAD = 18;
		int edad;
		String universidad, paro;

		System.out.println("Dime que edad tienes:");
		edad = teclado.nextInt();
		teclado.nextLine();

		System.out.println("¿Tienes título universitario?");
		universidad = teclado.nextLine();
		universidad = universidad.toUpperCase();

		System.out.println("¿Estás en el paro?");
		paro = teclado.nextLine();
		paro = paro.toUpperCase();

		if ((edad >= MAYOREDAD && (universidad.equals("SI") || universidad.equals("S")))
				|| (paro.equals("SI") || paro.equals("S"))) {

			System.out.println("Tu beca está aprobada!!");

		} else {
			System.out.println("Lo sentimos, no cumples con los requisitos para optar a una beca.");
		}

	}

}
