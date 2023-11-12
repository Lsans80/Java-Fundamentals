package m4Extra3piedrapapel;

import java.util.Scanner;

public class M4Extra3piedrapapel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numRandom = (int) (Math.random() * 3) + 1;

		int piedra = 1;
		int papel  = 2;
		int tijera = 3;
		String resultadoPc = "";
		String resultado   = "";

		if (numRandom == piedra) {
			resultadoPc = "Piedra";
		} else if (numRandom == papel) {
			resultadoPc = "Papel";
		} else if (numRandom == tijera) {
			resultadoPc = "Tijera";
		}

		System.out.println("Vamos a jugar a piedra, papel, tijera!!\n");

		System.out.println("1. Piedra.");
		System.out.println("2. Papel.");
		System.out.println("3. Tijera.\n");

		System.out.println("Escoje del 1 al 3.");
		int numero = teclado.nextInt();
		
		if (numero < 1 || numero > 3) {
			System.out.println("Entiendo que no quieres jugar conmigo :(");
		}

		if (numero == piedra) {
			resultado = "Piedra";
		} else if (numero == papel) {
			resultado = "Papel";
		} else if (numero == tijera) {
			resultado = "Tijera";
		}

		System.out.println("Yo he escogido " + resultadoPc + " y tú " + resultado + ".");

		switch (resultadoPc) {

			case "Piedra":
				if (resultadoPc == "Piedra" && resultado == "Tijera") {
					System.out.println("He ganado!!.");
				} else if (resultadoPc == "Piedra" && resultado == "Papel") {
					System.out.println("Has ganado!!.");
				} else if (resultadoPc == resultado) {
					System.out.println("Hemos empatado.");
				}	
				break;
			case "Papel":
				if (resultadoPc == "Papel" && resultado == "Piedra") {
					System.out.println("He ganado!!.");
				} else if (resultadoPc == "Papel" && resultado == "Tijera") {
					System.out.println("Has ganado!!.");
				} else if (resultadoPc == resultado) {
					System.out.println("Hemos empatado.");
				}	
				break;
			case "Tijera":
				if (resultadoPc == "Tijera" && resultado == "Piedra") {
					System.out.println("Has ganado!!.");
				} else if (resultadoPc == "Tijera" && resultado == "Papel") {
					System.out.println("He ganado!!.");
				} else if (resultadoPc == resultado) {
					System.out.println("Hemos empatado.");
				}	
				break;
			
		}

	}

}
