package m3ejercicio1extra;

import java.util.Scanner;

public class M3ejercicio1extra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un numero");
		numero = teclado.nextInt();
				
		System.out.println("El doble de "+numero+" es "+(numero*2)+" y el triple es "+(numero*3));

	}

}

