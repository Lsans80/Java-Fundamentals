package m7_1_4hayunnegativo;

import java.util.Scanner;

public class M7_1_4hayunnegativo {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Dime un número:");
		int numero1 = teclado.nextInt();
		System.out.print("Dime otro número:");
		int numero2 = teclado.nextInt();
		
		if ((numero1 < 0 && numero2 >= 0) || (numero2 < 0 && numero1 >= 0)){
			System.out.println("Hay un negativo.");
		}
		
		if ((numero1 < 0 && numero2 >= 0) || (numero2 < 0 && numero1 >= 0)){
			System.out.println("Hay un negativo.");
		}

	}

}
