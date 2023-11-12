package examen1;

import java.util.ArrayList;
import java.util.Scanner;

/*Donat el següent array de nombres: [15, 16, 8, 2, 4, 6, 2]
Mostra per pantalla els múltiples de 3, el nombre més gran i el més petit de l'array*/

public class Examen1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> multiplos = new ArrayList<Integer>();

		numeros.add(15);
		numeros.add(16);
		numeros.add(8);
		numeros.add(2);
		numeros.add(4);
		numeros.add(6);
		numeros.add(2);

		for (int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			if (numero % 3 == 0) {
				multiplos.add(numero);
			}
		}

		int numeroMayor = numeros.get(0);
		int numeroMenor = numeros.get(0);
		int i, j;

		for (i = 0; i < numeros.size(); i++) {

			if (numeros.get(i) > numeroMayor) {
				numeroMayor = numeros.get(i);
			}

		}

		for (j = 0; j < numeros.size(); j++) {

			if (numeros.get(j) < numeroMenor) {
				numeroMenor = numeros.get(j);
			}
		}

		System.out.println("El número más grande es el " + numeroMayor);
		System.out.println("El número más pequeño es el " + numeroMenor);
		System.out.println("Los números multiplos de 3 son: " + multiplos);
	}

}
