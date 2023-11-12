package m7_3_3palindromo1;

import java.util.Scanner;

public class M7_3_3palindromo1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String frase;
		String sinEspacio = "";
		String palindromo = "";

		System.out.println("Dime una frase:");
		frase = teclado.nextLine();
		
		frase = frase.replaceAll(" ","");

		int length = frase.length() - 1;

		for (int i = length; i >= 0; i--) {// Le damos la vuelta a la frase.

			palindromo = palindromo + frase.charAt(i);

		}

		System.out.println(frase);
		System.out.println(palindromo);

		if (palindromo.equalsIgnoreCase(frase)) {
			System.out.println("La frase " + frase + " es un palíndromo.");
		} else {
			System.out.println("La frase " + frase + " no es un palíndromo.");
		}

	}

}
