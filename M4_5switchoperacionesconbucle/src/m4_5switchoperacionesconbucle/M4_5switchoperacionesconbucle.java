package m4_5switchoperacionesconbucle;

import java.util.Scanner;

public class M4_5switchoperacionesconbucle {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String respuesta;

		do {

			System.out.println("Introduce un número:");
			float numero1 = teclado.nextFloat();

			System.out.println("Introduce otro número:");
			float numero2 = teclado.nextFloat();
			teclado.nextLine();

			System.out.println("Introduce un operador: + , - , * , / , %");
			String operador = teclado.nextLine();// también se podría: char operador = nextLine.charAt(0);

			// para pasarlo a char, aquí deberíamos cambiar las comillas en el switch por
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
				System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			case "/":
				resultado = numero1 / numero2;
				System.out.println("La división de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			case "%":
				resultado = numero1 % numero2;
				System.out.println("El módulo de " + numero1 + " y " + numero2 + " es " + resultado);
				break;
			default:
				System.err.println("El operador introducido no es correcto.");

			}

			System.out.println("Quieres seguir operando?:");
			respuesta = teclado.nextLine();
			respuesta = respuesta.toUpperCase();

		} while (respuesta.charAt(0) == 'S');
		
		System.out.println("Gracias por operar! hasta la próxima :)");

	}


}
