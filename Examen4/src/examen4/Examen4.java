package examen4;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen4 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
		ArrayList<Restaurante> restaurantesEncontrados = new ArrayList<Restaurante>();

		Restaurante Kong = new Restaurante("kong", "52.51487716098501", "13.45925919448606", "china", 7);
		Restaurante Saigon = new Restaurante("saigon", "52.514877160935647", "13.45925919443987", "china", 6);
		Restaurante Dumpling = new Restaurante("dumpling", "52.51487716098501", "13.45925919448606", "china", 8);
		Restaurante Arirang = new Restaurante("arirang", "52.51487716098534", "13.45925919448629", "china", 9);

		Restaurante TiaMaria = new Restaurante("tia Maria", "52.51487716092909", "13.45925919442378", "mejicana", 9);
		Restaurante Jalisco = new Restaurante("jalisco", "52.51487716098579", "13.45925919448376", "mejicana", 7);

		Restaurante Milano = new Restaurante("milano", "52.52874847424482", "13.451153208875656", "italiana", 6);
		Restaurante Faro = new Restaurante("faro", "52.52874847424758", "13.451153208875293", "italiana", 5);
		Restaurante Margarita = new Restaurante("margarita", "52.52874847423284", "13.45115320872384", "italiana", 8);

		restaurantes.add(Kong);
		restaurantes.add(Saigon);
		restaurantes.add(Dumpling);
		restaurantes.add(Arirang);
		restaurantes.add(TiaMaria);
		restaurantes.add(Jalisco);
		restaurantes.add(Milano);
		restaurantes.add(Faro);
		restaurantes.add(Margarita);

		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				buscarTipococina(restaurantes, restaurantesEncontrados);

				break;
			case 2:
				buscarPuntuacion(restaurantes, restaurantesEncontrados);

				break;
			case 3:
				buscarTipococinayPuntuacion(restaurantes, restaurantesEncontrados);

				break;
			case 0:
				System.out.println("Hasta pronto!!");
				salir = true;
				break;
			}
		} while (!salir);
	}

	public static byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do {
			System.out.println("\n*****ENCUENTRA TU RESTAURANTE****\n");
			System.out.println("1. Buscar por tipo de cocina.");
			System.out.println("2. Buscar por puntuación");
			System.out.println("3. Buscar por tipo de cocina y mejor puntuación..");
			System.out.println("0. Salir.\n");
			opcion = teclado.nextByte();
			teclado.nextLine();

			if (opcion < MINIMO || opcion > MAXIMO) {
				System.err.println("La opción no es válida.");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static void buscarTipococina(ArrayList<Restaurante> restaurantes,
			ArrayList<Restaurante> restaurantesEncontrados) {

		boolean encontrado = false;

		System.out.println("Dime el tipo de cocina que quieres:");
		String cocina = teclado.nextLine();

		for (int i = 0; i < restaurantes.size(); i++) {
			if (restaurantes.get(i).getTipoCocina().equalsIgnoreCase(cocina)) {
				System.out.println(restaurantes.get(i) + "\n");
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.err.println("No existe un restaurante con estos filtros.");
		}

	}

	public static void buscarPuntuacion(ArrayList<Restaurante> restaurantes,
			ArrayList<Restaurante> restaurantesEncontrados) {

		boolean encontrado = false;

		System.out.println("Dime la puntuacion mínima que quieres:");
		int puntuacion = teclado.nextInt();

		for (int i = 0; i < restaurantes.size(); i++) {
			if (restaurantes.get(i).getPuntuacion() > puntuacion) {
				System.out.println(restaurantes.get(i) + "\n");
				encontrado = true;

			}
		}

		if (!encontrado) {
			System.err.println("No existe un restaurante con estos filtros.");
		}

	}

	public static void buscarTipococinayPuntuacion(ArrayList<Restaurante> restaurantes,
			ArrayList<Restaurante> restaurantesEncontrados) {

		boolean encontrado = false;

		System.out.println("Dime el tipo de cocina que quieres:");
		String cocina = teclado.nextLine();
		System.out.println("Dime la puntuacion mínima que quieres:");
		int puntuacion = teclado.nextInt();

		for (int i = 0; i < restaurantes.size(); i++) {
			if (restaurantes.get(i).getTipoCocina().equalsIgnoreCase(cocina)
					&& restaurantes.get(i).getPuntuacion() > puntuacion) {
				System.out.println(restaurantes.get(i) + "\n");
				encontrado = true;

			}
		}

		if (!encontrado) {
			System.err.println("No existe un restaurante con estos filtros.");
		}

	}

}
