package m7_3_2stringalreves1;

import java.util.Scanner;

public class M7_3_2stringalreves1 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String respuesta;
		String alreves = "";
		
		System.out.println("Dime una palabra:");
		respuesta = teclado.nextLine();
		
		int length = respuesta.length() - 1;
		
		for (int i = length; i >= 0; i--) {
			alreves = alreves + respuesta.charAt(i);
		}
		
		System.out.println(alreves);

	}

}
