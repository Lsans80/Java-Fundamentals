package m5_extra2pinta;

import java.util.Scanner;

public class M5_extra2pintaL {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("*****VAMOS A PINTAR UNA L*****\n");
		System.out.println("Dime la altura de tu L:");
		int altura = teclado.nextInt();

		int base = altura / 2 + 1;

		for (int i = 1; i < altura; i++) {
			System.out.println("*");

		}
		
		for (int j = 0; j < base; j++) {
			System.out.print("*");
		}

	}

}
