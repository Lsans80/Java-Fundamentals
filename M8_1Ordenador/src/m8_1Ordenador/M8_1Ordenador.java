package m8_1Ordenador;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_1Ordenador {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Ordenador> ordenadores = new ArrayList<Ordenador>();

		Ordenador ordenador1 = new Ordenador("dell", "inspiron", "i5", 12, 500);
		Ordenador ordenador2 = new Ordenador("chuwi", "herobook", "i3", 8, 500);
		Ordenador ordenador3 = new Ordenador("apple", "airbook");

		ordenadores.add(ordenador1);
		ordenadores.add(ordenador2);
		ordenadores.add(ordenador3);

		for (int i = 0; i < ordenadores.size(); i++) {
			System.out.println("\n" + ordenadores.get(i));
		}

		System.out.println(ordenador1.ejecutando("Google"));

		crearOrdenador(ordenadores);

		int posicion = buscarOrdenador(ordenadores);
		if (posicion != -1) {
			System.out.println(ordenadores.get(posicion));
		} else {
			System.out.println("El ordenador no está en nuestra base de datos.");
		}

		eliminarOrdenador(posicion, ordenadores);

		for (int i = 0; i < ordenadores.size(); i++) {

			System.out.println("\n" + ordenadores.get(i));
		}

	}

	public static void crearOrdenador(ArrayList<Ordenador> ordenadores) {

		System.out.println("Dime la marca:");
		String marca = teclado.nextLine().toLowerCase();
		System.out.println("Dime el modelo:");
		String modelo = teclado.nextLine().toLowerCase();
		System.out.println("Dime la procesador:");
		String procesador = teclado.nextLine();
		System.out.println("Dime la memoria Ram:");
		int ram = teclado.nextInt();
		System.out.println("Dime el disco duro:");
		int hdd = teclado.nextInt();
		teclado.nextLine();

		Ordenador ordenador = new Ordenador(marca, modelo, procesador, ram, hdd);
		ordenadores.add(ordenador);

	}

	public static int buscarOrdenador(ArrayList<Ordenador> ordenadores) {
		int posicion = -1;
		int i = 0;

		System.out.println("Dime la marca:");
		String marca = teclado.nextLine().toLowerCase();
		System.out.println("Dime el modelo:");
		String modelo = teclado.nextLine().toLowerCase();

		Ordenador ordenador1 = new Ordenador(marca, modelo);

		while (posicion == -1 && i < ordenadores.size()) {
			if (ordenador1.equals(ordenadores.get(i))) {
				posicion = i;
			}
			i++;
		}

		return posicion;
	}

	public static void eliminarOrdenador(int posicion, ArrayList<Ordenador> ordenadores) {

		if (posicion != -1) {
			ordenadores.remove(posicion);
			System.out.println("El ordenador ha sido comprado.");

		} else {
			System.out.println("El ordenador no está en nuestra base de datos.");
		}
	}

}
