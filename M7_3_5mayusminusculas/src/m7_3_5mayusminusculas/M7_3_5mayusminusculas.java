package m7_3_5mayusminusculas;

import java.util.Scanner;

public class M7_3_5mayusminusculas {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String frase;

		System.out.println("Dime una frase:");
		frase = teclado.nextLine();
		
		if (frase.equals(frase.toLowerCase())) {
			System.out.println("La frase est� formada por min�sculas.");
		} else if (frase.equals(frase.toUpperCase())) {
			System.out.println("La frase est� formada por may�sculas.");
		} else {
			System.out.println("La frase contiene min�sculas y may�sculas.");
		}

	}

}
