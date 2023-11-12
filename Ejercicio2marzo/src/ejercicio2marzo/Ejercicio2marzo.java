package ejercicio2marzo;

import java.util.Scanner;

public class Ejercicio2marzo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1, numero2;
		
		System.out.println("Introduzca numero 1");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduzca numero 2");
		numero2 = teclado.nextInt();
		
		int resta = numero1 - numero2;
				
		float resultado = (float)numero1 / numero2;
		System.out.println(resultado);
		
		System.out.println("El resultado de sumar: "+numero1+" y "+numero2+" es "+(numero1+numero2));
		
		System.out.println("El resultado de restar: "+numero1+" y "+numero2+" es "+numero1*numero2);
		
		System.out.println("El resultado de multiplicar: "+numero1+" y "+numero2+" es "+resta);
		
		System.out.println("El resultado de dividir: "+numero1+" y "+numero2+" es "+(float)numero1/numero2);	
		
	}

}
