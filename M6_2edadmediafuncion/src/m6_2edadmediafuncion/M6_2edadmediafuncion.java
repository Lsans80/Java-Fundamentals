package m6_2edadmediafuncion;

import java.util.Scanner;

public class M6_2edadmediafuncion {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numPersonas;

		System.out.print("Dime el número de personas:");
		numPersonas = teclado.nextInt();

		float edadMedia = mediaEdades(numPersonas);
		System.out.println("La edad media de todas las personas es " + edadMedia);

	}
	
	//sería más escalable si hacemos una función para pedir edades y otra para la media.

	public static float mediaEdades(int numPersonas) {
		int edad;
		float edadMedia = 0;
		int i = 1;

		do {

			System.out.print("Dime la edad de la persona " + i + ":");
			edad = teclado.nextInt();

			if (edad < 0 || edad > 120) {
				System.err.println("La edad debe estar entre 0 y 120.");
			} else {
				edadMedia = edadMedia + edad;
				i++;
			}

		} while (i <= numPersonas);
		
		edadMedia = edadMedia/numPersonas;

		return edadMedia;
	}

}
