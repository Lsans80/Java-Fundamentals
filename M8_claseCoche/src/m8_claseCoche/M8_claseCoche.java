package m8_claseCoche;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_claseCoche {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Coche> coches = new ArrayList<Coche>();

		crearCoche(coches);
		buscarCoche(coches);

	}

	public static void crearCoche(ArrayList<Coche> coches) {

		for (int i = 0; i < 3; i++) {

			System.out.println("Dime la marca del coche:");
			String marca = teclado.nextLine();
			System.out.println("Dime la modelo del coche:");
			String modelo = teclado.nextLine();
			System.out.println("Dime la matrícula del coche:");
			String matricula = teclado.nextLine();
			System.out.println("Dime la potencia del coche:");
			int potencia = teclado.nextInt();
			System.out.println("Dime la cilindrada del coche:");
			int cilindrada = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Dime color del coche:");
			String color = teclado.nextLine();

			Coche coche = new Coche(marca, modelo, matricula, potencia, cilindrada, color);

			coches.add(coche);// aquí podemos duplicar la identidad pq lo metemos en un Array y este trabaja
								// por posiciones y no por identidad como cuando creamos un objeto Coche.

		}
	}

	public static void buscarCoche(ArrayList<Coche> coches) {
		int i = 0;
		boolean encontrado = false;

		System.out.println("Dime la matricula del coche que quieres buscar.");
		String matricula = teclado.nextLine();

		while (i < coches.size() && !encontrado) {
			if (coches.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				encontrado = true;
			}
			i++;
		}

		if (encontrado) {
			System.out.println("Tu coche ya está en nuestra base de datos.");
		} else {
			System.out.println("Tu coche no está en nuestra base de datos.");
		}
	}

}
