package m7_2_3arbolasteriscos;

import java.util.Scanner;

public class M7_2_3arbolasteriscos {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		char asterisco = '*';
		String espacio = "";
		int numero;

		System.out.println("Dime un número:");
		numero = teclado.nextInt();

		for (int i = 0; i < numero; i++) {

			espacio = espacio + asterisco;
			System.out.println(espacio);
		}

		for (int i = 1; i < numero; i++) {//1 línea menos.
			 
		 	for (int j = 1; j < numero-i; j++) { //un asterisco menos ya que acabamos el otro bucle con asteriscos completos.
		 	System.out.print(asterisco); 
		 	}
		 	
		 	System.out.println(asterisco); 
		 }
	}

}
