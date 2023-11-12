package m7_2_7bisiesto;

import java.util.Scanner;

public class M7_2_7bisiesto {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int a;

		System.out.println("Dime un año para saber si es bisieto o no:");
		a = teclado.nextInt();

		System.out.println(bisiesto(a));

	}

	public static String bisiesto(int a) {
		String respuesta;

		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			respuesta = (a + " es bisiesto.");
		} else {
			respuesta = (a + " no es bisiesto.");
		}

		return respuesta;
	}
}
