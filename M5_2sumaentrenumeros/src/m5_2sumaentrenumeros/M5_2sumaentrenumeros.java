package m5_2sumaentrenumeros;

import java.util.Scanner;

public class M5_2sumaentrenumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		int resultado = 0;
		
		System.out.println("Introduce un número:");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduce otro número:");
		numero2 = teclado.nextInt();
		
		//numero1 2
		//numero2 4
		
		if (numero1 > numero2) {
			int aux = numero1;//aux = 2
			numero1 = numero2;//numero1 = 4
			numero2 = aux;//numero2 = 2
			
		} 
		
		for (int i = numero1; i <= numero2; i++) {
			resultado = resultado + i;						
		}
		
		System.out.println("La suma de los números entre " + numero1 + " y " + numero2 + " es " + resultado);
	

	}

}
