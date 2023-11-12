package m5_extraclasebusquedanombre;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_extraclasebusquedanombre {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<String>();

		String nombre;
		boolean encontrado = false;
		int i = 0;

		nombres.add("Clara");
		nombres.add("Neithan");
		nombres.add("Kara");
		nombres.add("Luisa");
		nombres.add("Black");
		nombres.add("Ariel");
		
		System.out.println("Dime el nombre de la persona que deseas buscar:");
		nombre = teclado.nextLine();

		while (!encontrado && i < nombres.size()) {

			if (nombre.equalsIgnoreCase(nombres.get(i))) {
				encontrado = true;
			} else {
				i++;//si lo ponemos aquí tenemos la posición correcta, si no sumara 1 a la posición y será una más de donde está.
			}
			
		}

		if (encontrado) {
			System.out.println(nombre + " está en nuestra base de datos. Está en la posición " +i);
		} else {
			System.out.println(nombre + " no está en nuestra base de datos.");

		}
		
		//Busca en bucle hasta que encuentra nombre.

		/*do {

			System.out.println("Dime el nombre de la persona que deseas buscar:");
			nombre = teclado.nextLine();

			while (!encontrado && i < nombres.size()) {

				if (nombre.equalsIgnoreCase(nombres.get(i))) {
					encontrado = true;
				}
				i++;
			}

			i = 0;

			if (encontrado) {
				System.out.println(nombre + " está en nuestra base de datos.");
			} else {
				System.out.println(nombre + " no está en nuestra base de datos.");

			}

		} while (!encontrado);*/

	}

}
