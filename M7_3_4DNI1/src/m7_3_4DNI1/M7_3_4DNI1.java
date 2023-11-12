package m7_3_4DNI1;

import java.util.Scanner;

public class M7_3_4DNI1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni;

		do {
			System.out.println("Dime tu número de DNI:");
			dni = teclado.nextLine();
		} while (dni.length() != 9);

		int numDni = Integer.parseInt(dni.substring(0, 8));//separa los números de la letra.
		String letraDni = dni.substring(8);
		letraDni = letraDni.toUpperCase();
		char letraDni1 = letraDni.charAt(0);

		int posicion = numDni % 23;

		char letraDniCorrecta = letra.charAt(posicion);

		if (letraDni1 == letraDniCorrecta) {
			System.out.println("La letra de tu DNI es correcta.");
		} else {
			System.out.println("La letra de tu DNI es incorrecta.\nLa correcta sería: " + letraDniCorrecta);
		}

	}

}
