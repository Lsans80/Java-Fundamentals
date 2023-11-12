package m7_2_6numeroshastaprimo;

import java.util.Scanner;
/*Primo: si haces la división por cualquier número que no sea 1 o él mismo, se obtiene un resto distinto de cero.*/

public class M7_2_6numeroshastaprimo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;

		do {

			System.out.println("Dime un número:");
			numero = teclado.nextInt();

			esPrimo(numero);

		} while (!esPrimo(numero));

		System.out.println(numero + " es un número primo.");

	}

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int i = 2;

		if (numero > 1) {

			while (primo && i < numero) {
				if (numero % i == 0) {
					primo = false;
				}
				i++;//si no da 0 la división le seguirá sumando 1, no es necesario poner else.
			}

		} else {
			primo = false;
		}

		return primo;

	}
	
	//Menos eficiente:

	/*public static int esPrimo(int numero) {
		int primo = 0;

		if (numero > 1) {
			for (int i = 2; i < numero; i++) {

				if (numero % i == 0) {
					primo++;
				}
			}

		} else {
			primo++;
		}

		return primo;

	}*/

}
