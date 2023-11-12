package m5_extrapdfsumahasta10000;

/*Escriu un programa que permeti anar introduint una s�rie indeterminada de nombres
mentre la seva suma no superi el valor 10000. Quan aix� �ltim passi, s'ha de mostrar el total
acumulat, el comptador dels nombres introdu�ts i la mitjana.*/

import java.util.Scanner;

public class M5_extrapdfsumahasta10000 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float suma = 0;
		int cantidadNumeros = 0;

		do {

			System.out.println("Dime un n�mero:");
			float numero = teclado.nextFloat();

			suma = suma + numero;
			cantidadNumeros++;

		} while (suma < 10000);

		System.out.println("La suma de todos los n�meros introducidos es: " + suma);
		System.out.println("Has introducido " + cantidadNumeros + " n�meros.");
		System.out.println("La media de todos los n�meros introducidos es: " + (suma/cantidadNumeros));

	}
}
