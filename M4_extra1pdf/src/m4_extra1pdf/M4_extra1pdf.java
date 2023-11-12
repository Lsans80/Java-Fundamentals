package m4_extra1pdf;

import java.util.Scanner;

public class M4_extra1pdf {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float helado = 1.90f;
		float oreo = 1;
		float kitkat = 1.50f;
		float brownie = 0.75f;
		float mandm = 0.95f;

		int opcion;
		int i = 0;

		do {

			System.out.println("Dime que topping quieres para tu helado:\n");
			System.out.println("0. Sin topping.");
			System.out.println("1. Oreo.");
			System.out.println("2. Kitkat.");
			System.out.println("3. Brownie.");
			System.out.println("4. M&M.");

			opcion = teclado.nextInt();
			i++;

		} while (i < opcion);

		switch (opcion) {

		case 0:
			System.out.println("Tu helado cuesta: " + helado + " Euros.");
			break;
		case 1:
			System.out.println(
					"Tu helado cuesta: " + helado + " + " + oreo + " del topping = " + (helado + oreo) + " Euros.");
			break;
		case 2:
			System.out.println(
					"Tu helado cuesta: " + helado + " + " + kitkat + " del topping = " + (helado + kitkat) + " Euros.");
			break;
		case 3:
			System.out.println("Tu helado cuesta: " + helado + " + " + brownie + " del topping = " + (helado + brownie)
					+ " Euros.");
			break;
		case 4:
			System.out.println(
					"Tu helado cuesta: " + helado + " + " + mandm + " del topping = " + (helado + mandm) + " Euros.");
			break;
		default:
			System.out.println(
					"Lo sentimos, no tenemos este topping.\nEl helado sin toppings cuesta " + helado + " Euros.");
		}

	}

}
