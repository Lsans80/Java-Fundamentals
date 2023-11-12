package m7_2_1asteriscosmenoramayor;

import java.util.Scanner;

public class M7_2_1asteriscosmenoramayor {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		char asterisco = '*';
		String espacio = "";

		System.out.println("Dime un número para crear tu cascada de asteriscos:");
		int numero = teclado.nextInt();

		for (int i = 0; i < numero; i++) {
			espacio = espacio + asterisco;
			System.out.println(espacio);
		}

		// Otra manera de hacerlo:

		/*for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				espacio += asterisco;
			}
			espacio += "\n";

		}
		System.out.println(espacio);*/
	}

}
