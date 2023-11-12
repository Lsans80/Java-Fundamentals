package m4_5switchoperacionesconbucle;

import java.util.Scanner;

public class M4_5switchoperacionesconbucle {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String respuesta;

		do {

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
				resultado = numero1 + numero2;
				System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			case "-":
				resultado = numero1 - numero2;
				System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			case "*":
				resultado = numero1 * numero2;
				System.out.println("La multiplicaci�n de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			case "/":
				resultado = numero1 / numero2;
				System.out.println("La divisi�n de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			case "%":
				resultado = numero1 % numero2;
				System.out.println("El m�dulo de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			default:
				System.err.println("El operador introducido no es correcto.");

			}

			System.out.println("Quieres seguir operando?:");
			respuesta = teclado.nextLine();
			respuesta = respuesta.toUpperCase();

		} while (respuesta.charAt(0) == 'S');
		
		System.out.println("Gracias por operar! hasta la pr�xima :)");

	}


}
