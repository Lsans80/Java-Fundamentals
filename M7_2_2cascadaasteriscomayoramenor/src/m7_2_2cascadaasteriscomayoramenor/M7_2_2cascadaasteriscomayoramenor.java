package m7_2_2cascadaasteriscomayoramenor;

import java.util.Scanner;

public class M7_2_2cascadaasteriscomayoramenor {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		char asterisco = '*';
		String espacio = "";
		int numero;

		System.out.println("Dime un número. Será la altura de tu cascada de asteriscos:");
		numero = teclado.nextInt();

		
		 for (int i = 0; i < numero; i++) {
		 
		 	for (int j = 1; j < numero-i; j++) { 
		 	System.out.print(asterisco); 
		 	}
		 	System.out.println(asterisco); 
		 }
		 
		// Otra manera de hacerlo:

			/*for (int i = 1; i <= numero; i++) {
				for (int j = i; j < numero; j++) {
					espacio += asterisco;
				}
				espacio += "\n";

			}
			System.out.println(espacio);*/

	}

}
