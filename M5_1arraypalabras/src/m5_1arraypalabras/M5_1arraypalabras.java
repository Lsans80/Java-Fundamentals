package m5_1arraypalabras;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_1arraypalabras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		ArrayList <String> palabras = new ArrayList <String>();
		String palabra;
		int numPalabras;
		
		System.out.println("Introduce el número de palabras que deseas introducir:");
		numPalabras = teclado.nextInt();
		teclado.nextLine();
		
		for (int i = 1; i <= numPalabras; i++) {
			System.out.println("Introduce la palabra número " + i + ":");
			palabra = teclado.nextLine();
					
			palabras.add(palabra);
			
		}
		
		System.out.println(palabras);

	}

}
