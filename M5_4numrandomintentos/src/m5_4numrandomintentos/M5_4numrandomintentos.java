package m5_4numrandomintentos;

import java.util.Scanner;

public class M5_4numrandomintentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero;
		int aleatorio = (int) Math.ceil((Math.random() * 10));
		int intentos = 0;
		
		System.out.println(aleatorio);
		
		System.out.println("Introduce un número del 1 al 10:");
		numero = teclado.nextInt();
		intentos++;
		
		do {
			
			System.out.println("Introduce otro número del 1 al 10:");
			numero = teclado.nextInt();
			intentos++;
			
		} while (aleatorio != numero);
		
		System.out.println("Has acertado!! El número escogido es el " + aleatorio + " y has necesitado " + intentos + " intentos.");
		

	}

}
