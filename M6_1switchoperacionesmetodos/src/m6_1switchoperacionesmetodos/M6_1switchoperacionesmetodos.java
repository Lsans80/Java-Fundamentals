package m6_1switchoperacionesmetodos;

import java.util.Scanner;

public class M6_1switchoperacionesmetodos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un n�mero:");
		float numero1 = teclado.nextFloat();

		System.out.println("Introduce otro n�mero:");
		float numero2 = teclado.nextFloat();
		teclado.nextLine();

		System.out.println("Introduce un operador: + , - , * , / , %");
		String operador = teclado.nextLine();// tambi�n se podr�a: char operador = nextLine.charAt(0);

		// para pasarlo a char, aqu� deber�amos cambiar las comillas en el switch por
		// unas simples:
		// char opc = opcio.charAt(0);

		float resultado;

		switch (operador) {

		case "+":
			suma(numero1, numero2);
			break;
		case "-":
			resta(numero1, numero2);
			break;
		case "*":
			multiplicacion(numero1, numero2);
			break;
		case "/":
			if (numero2 != 0) {
				division(numero1, numero2);
			} else {
				System.err.println("El n�mero no puede ser 0.");
			}
			break;
		case "%":
			modulo(numero1, numero2);
			break;
		default:
			System.err.println("El operador introducido no es correcto.");

		}

	}

	public static void suma(float numero1, float numero2) {
		float resultado;

		resultado = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + resultado);

	}

	public static void resta(float numero1, float numero2) {
		float resultado;

		resultado = numero1 - numero2;
		System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resultado);

	}

	public static void multiplicacion(float numero1, float numero2) {
		float resultado;

		resultado = numero1 * numero2;
		System.out.println("La multiplicaci�n de " + numero1 + " y " + numero2 + " es " + resultado);
	}

	public static void division(float numero1, float numero2) {
		float resultado;

		resultado = numero1 / numero2;
		System.out.println("La divisi�n de " + numero1 + " y " + numero2 + " es " + resultado);
	}

	public static void modulo(float numero1, float numero2) {
		float resultado;

		resultado = numero1 % numero2;
		System.out.println("El m�dulo de " + numero1 + " y " + numero2 + " es " + resultado);
	}

}
