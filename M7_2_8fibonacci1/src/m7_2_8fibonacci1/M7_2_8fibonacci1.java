package m7_2_8fibonacci1;

import java.util.Scanner;

public class M7_2_8fibonacci1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int num1 = 		0;
		int num2 = 		1;
		int resultado = 0;

		System.out.println("Dime un número:");
		numero = teclado.nextInt();

		System.out.println("Los primeros " + numero + " números de la serie de Fibonacci son:");

		for (int i = 0; i < numero; i++) {

			System.out.print(num1 + ",");

			resultado = num1 + num2;
			num1 = num2;
			num2 = resultado;

		}

	}

}
