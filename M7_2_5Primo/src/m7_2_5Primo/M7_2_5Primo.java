package m7_2_5Primo;

import java.util.Scanner;

public class M7_2_5Primo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Dime un n�mero:");
		int numero = teclado.nextInt();
		
		if (esPrimo(numero)) {
			System.out.println(numero + " es un n�mero primo.");
		} else {
			System.out.println(numero + " no es un n�mero primo.");
		}

	}
	
	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int i = 2;

		if (numero > 1) {

			while (primo && i < numero) {
				if (numero % i == 0) {
					primo = false;
				}
				i++;//si no da 0 la divisi�n le seguir� sumando 1, no es necesario poner else.
			}

		} else {
			primo = false;
		}

		return primo;
	}
	
	//Menos eficiente:

	/*public static void esPrimo(int numero) {
		int primo = 0;

		if (numero > 1) {
			for (int i = 2; i < numero; i++) {

				if (numero % i == 0) {
					primo++;
				}
			}
			
		} else {
			primo++;
		}

		if (primo > 0) {
			System.out.println(numero + " no es un n�mero primo.");
		} else {
			System.out.println(numero + " es un n�mero primo.");
		}
	}*/

}
