package m7_1_6tablamultiplicar;

import java.util.Scanner;

public class M7_1_6tablamultiplicar {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;

		do {

			System.out.println("Dime un número del 1 al 10:");
			numero = teclado.nextInt();

		} while (numero < 1 || numero > 10);

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);

		}

	}

}
