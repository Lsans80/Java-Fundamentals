package m7_1_3multiplo;

import java.util.Scanner;

public class M7_1_3multiplo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Dime un número:");
		int numero1 = teclado.nextInt();
		System.out.print("Dime otro número:");
		int numero2 = teclado.nextInt();

		boolean multiplo = esMultiplo(numero1, numero2);

		if (multiplo) {
			System.out.println("El " + numero1 + " es multiplo de " + numero2 + ".");
		} else {
			System.out.println("El " + numero1 + " no es multiplo de " + numero2 + ".");
		}

	}

	public static boolean esMultiplo(int numero1, int numero2) {
		boolean multiplo = false;

		if (numero2 != 0) {
			if (numero1 % numero2 == 0) {
				multiplo = true;
			}
		}

		return multiplo;
	}

}
