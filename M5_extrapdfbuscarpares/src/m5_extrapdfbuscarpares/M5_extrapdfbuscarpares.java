package m5_extrapdfbuscarpares;

import java.util.ArrayList;

/*Escriu un programa que, donat un nombre enter de tipus long, de més de 7 xifres, digui
quins són i quant sumen els dígits parells.
Els dígits parells s'han de mostrar en ordre, de esquerra a dreta.

Exemple:
Introduexi un nombre enter positiu : 94026782
Dígits parells : 4 0 2 6 8 2
Suma dels dígits parells: 22*/

import java.util.Scanner;

public class M5_extrapdfbuscarpares {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> pares = new ArrayList<Integer>();

		long numero;
		int suma = 0;

		do {

			System.out.println("Dime un número mayor de 7 cifras:");
			numero = teclado.nextLong();

		} while (numero < 1000000);

		for (int i = 0; i <= numero || numero > 0; i++) {
			int unidad = (int) (numero % 10);

			if (unidad % 2 == 0) {

				pares.add(unidad);
				suma = suma + unidad;
			}

			numero = numero / 10;

		}

		int size = pares.size() - 1;

		for (int i = size; i >= 0; i--) {

			System.out.print(pares.get(i) + " ");
		}

		System.out.println("y la suma de los números pares es: " + suma);

	}

}
