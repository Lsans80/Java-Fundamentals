package m5_extrapdfnumeroalreves;

/*Realitza un programa que demani un nombre major a 9999 per teclat i que després mostri
aquest nombre a l'inrevés*/

import java.util.Scanner;

public class M5_extrapdfnumeroalreves {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String numero; 
		char alreves;
		
		System.out.println("Dime un número mayor que 9999:");
		numero = teclado.nextLine();
		
		for (int i = numero.length() - 1; i >= 0; i--) {
			
			alreves = numero.charAt(i);
			System.out.print(alreves);
		}

	}

}
