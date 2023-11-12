package m4_extra1pdfarray;

import java.util.ArrayList;
import java.util.Scanner;

public class M4_extra1pdfarray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Float> Toppings = new ArrayList<Float>();

		Toppings.add(1.90f);
		Toppings.add(1f);
		Toppings.add(1.50f);
		Toppings.add(0.75f);
		Toppings.add(0.95f);

		ArrayList<Float> sumaToppings = new ArrayList<Float>();

		System.out.println("Dime cuantos toppings quieres para tu helado:\n");
		int cantidadToppings = teclado.nextInt();

		int opcion;
		int i = 0;

		if (cantidadToppings == 0) {
			sumaToppings.add(Toppings.get(cantidadToppings));

		} else {

			do {

				System.out.println("Dime que topping quieres para tu helado:\n");
				System.out.println("0. Sin topping.");
				System.out.println("1. Oreo.");
				System.out.println("2. Kitkat.");
				System.out.println("3. Brownie.");
				System.out.println("4. M&M.");

				opcion = teclado.nextInt();
				sumaToppings.add(Toppings.get(opcion));
				i++;

			} while (i < cantidadToppings);

		}

		float heladoTotal = 0;

		for (int j = 0; j < sumaToppings.size(); j++) {
			heladoTotal = heladoTotal + sumaToppings.get(j);
		}

		System.out.println("Tu helado cuesta: " + heladoTotal + " Euros.");

	}

}
