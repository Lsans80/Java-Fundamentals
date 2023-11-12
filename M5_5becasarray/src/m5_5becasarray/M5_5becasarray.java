package m5_5becasarray;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_5becasarray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> becados = new ArrayList<String>();

		final int MAYOREDAD = 18;
		int edad;
		String universidad, paro;

		do {

			System.out.println("*****BECAS*****\n");
			System.out.println("Dime que edad tienes:");
			edad = teclado.nextInt();
			teclado.nextLine();

			System.out.println("¿Tienes título universitario?");
			universidad = teclado.nextLine();
			universidad = universidad.toUpperCase();

			System.out.println("¿Estás en el paro?");
			paro = teclado.nextLine();
			paro = paro.toUpperCase();

			if (edad >= MAYOREDAD && (universidad.charAt(0) == 'S'|| paro.charAt(0) == 'S')){

				System.out.println("Tu beca está aprobada!!");
				System.out.println("Dime tu nombre y apellidos:");
				String nombreApellido = teclado.nextLine();
				becados.add(nombreApellido);

			} else {
				System.out.println("Lo sentimos, no cumples con los requisitos para optar a una beca.");
			}

		} while (becados.size() < 5);

		if (becados.size() == 5) {
			System.out.println("Los 5 becados son:\n");

			for (int i = 0; i < becados.size(); i++) {
				System.out.println(becados.get(i));
			}

		}

	}
}
