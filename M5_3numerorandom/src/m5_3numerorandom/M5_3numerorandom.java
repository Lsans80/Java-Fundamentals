package m5_3numerorandom;

import java.util.Scanner;

public class M5_3numerorandom {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aleatorio = (int) Math.ceil((Math.random() * 10));
		
		System.out.println("Introduce un número del 1 al 10:");
		int numero = teclado.nextInt();
		
		while (numero != aleatorio) {
			
			System.out.println("Introduce un número del 1 al 10:");
			numero = teclado.nextInt();
			
		}
		
		if (numero == aleatorio) {
			System.out.println("Enhorabuena!! Has acertado, el número era el " + aleatorio);
		}

	}

}
