package m7_3_5mayusminusculas;

import java.util.Scanner;

public class M7_3_5mayusminusculas {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String frase;

		System.out.println("Dime una frase:");
		frase = teclado.nextLine();
		
		if (frase.equals(frase.toLowerCase())) {
			System.out.println("La frase está formada por minúsculas.");
		} else if (frase.equals(frase.toUpperCase())) {
			System.out.println("La frase está formada por mayúsculas.");
		} else {
			System.out.println("La frase contiene minúsculas y mayúsculas.");
		}

	}

}
