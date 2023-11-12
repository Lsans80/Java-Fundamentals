package m7_1_7cuadradoconsimbolo;

import java.util.Scanner;

public class M7_1_7cuadradoconsimbolo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String simbolo;
		int numero;

		System.out.println("Dime un número:");
		numero = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Dime un símbolo para pintar un cuadrado con él!");
		simbolo = teclado.nextLine();

		for (int i = 0; i < numero; i++) {// Por cada iteración de este bucle hará x veces el for j. Si i es 5 el j se
											// hará 25 veces.

			for (int j = 1; j < numero; j++) {
				System.out.print(simbolo);
			}

			System.out.println(simbolo);
		}

		// Otra manera de hacerlo:

		/*String resultado = "";

		for (int i = 1; i <= numero; i++) {
		
			for (int j = 1; j <= numero; j++) {
				resultado += simbolo + " ";
			}
			resultado += "\n";

		}
		System.out.println(resultado);*/

	}

}
