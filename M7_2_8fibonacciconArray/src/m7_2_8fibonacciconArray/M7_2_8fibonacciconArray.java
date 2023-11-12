package m7_2_8fibonacciconArray;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_2_8fibonacciconArray {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList <Integer> fibonacci = new ArrayList <Integer>();
		fibonacci.add(0);
		fibonacci.add(1);		
		
		int numero;	
		
		System.out.println("Dime un número:");
		numero = teclado.nextInt();
		
		if (numero == 1) {
			System.out.println("La primera posición de la serie de Fibonacci es: " +fibonacci.get(0));
			
		} else if (numero < 0 || numero < 1) {
			System.err.println("El número introducido no es correcto, no se pueden mostrar 0 posiciones.");
		} else if (numero >= 2) {
			for (int i = 2; i < numero; i++) {
				
				fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));						
			}
			
			System.out.print(fibonacci);
		}
		

	}

}
