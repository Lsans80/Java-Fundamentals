/*Fes un programa que pregunti a l'usuari/�ria dos nombres enters 
al qual anomenar�s dividend i divisor respectivament.

El divisor haur� d'estar compr�s entre 2 i 7.

En cas contrari, el programa haur� de mostrar un missatge d'error.

Si el divisor �s correcte (2-7) mostra en pantalla si el dividend �s m�ltiple del divisor, o no.*/

package m4_extra1;

import java.util.Scanner;

public class M4_extra1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float dividendo;
		float divisor;

		System.out.println("******DIVISI�N*****\n");
		System.out.println("Dime el dividendo:");
		dividendo = teclado.nextFloat();

		do {

			System.out.println("Dime el divisor:");
			divisor = teclado.nextFloat();

			if (divisor < 2 || divisor > 7) {
				System.err.println("El divisor debe estar entre el 2 y el 7.");
			}

		} while (divisor < 2 || divisor > 7);

		float resultado = dividendo / divisor;

		System.out.println("El resultado de dividir " + dividendo + " y " + divisor + " es " + resultado);

		esMultiplo(dividendo, divisor);

	}

	public static void esMultiplo(float dividendo, float divisor) {

		if (dividendo % divisor == 0) {
			System.out.println("El dividendo es multiplo del divisor.");

		} else {
			System.out.println("El dividendo no es multiplo del divisor.");
		}

	}

}
