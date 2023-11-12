package m5_extrapdfsumahasta10000;

/*Escriu un programa que permeti anar introduint una sèrie indeterminada de nombres
mentre la seva suma no superi el valor 10000. Quan això últim passi, s'ha de mostrar el total
acumulat, el comptador dels nombres introduïts i la mitjana.*/

import java.util.Scanner;

public class M5_extrapdfsumahasta10000 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float suma = 0;
		int cantidadNumeros = 0;

		do {

			System.out.println("Dime un número:");
			float numero = teclado.nextFloat();

			suma = suma + numero;
			cantidadNumeros++;

		} while (suma < 10000);

		System.out.println("La suma de todos los números introducidos es: " + suma);
		System.out.println("Has introducido " + cantidadNumeros + " números.");
		System.out.println("La media de todos los números introducidos es: " + (suma/cantidadNumeros));

	}
}
