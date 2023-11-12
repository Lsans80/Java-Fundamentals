package m8_2Hotel1;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_2Hotel1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
		boolean sortir = false;
		int posicion = 0;
		int opcion = 0;

		Hotel hotel1 = new Hotel("Wella", 300, 30, 3000);
		Hotel hotel2 = new Hotel("Catalonia", 200, 20, 4000);
		Hotel hotel3 = new Hotel("Athome", 10, 10, 2000);

		hoteles.add(hotel1);
		hoteles.add(hotel2);
		hoteles.add(hotel3);

		System.out.println(hotel1);
		System.out.println(hotel2);
		System.out.println(hotel3);

		do {
			switch (menu()) {
			case 1:
				posicion = buscarHotel(hoteles);
				crearHotel(posicion, hoteles);
				break;
			case 2:
				posicion = buscarHotel(hoteles);
				eliminarHotel(posicion, hoteles);
				break;
			case 3:
				posicion = buscarHotel(hoteles);
				mostrarHotel(posicion, hoteles);
				break;
			case 4:
				posicion = buscarHotel(hoteles);
				if (posicion == -1) {
					System.out.println("El hotel no está en nuestra base de datos.");
				} else {
					opcion = menuModificar();
					modificarHotel(posicion, opcion, hoteles);
				}
				break;
			case 5:
				verHoteles(hoteles);
				break;
			case 0:
				System.out.println("Hasta pronto!!");
				sortir = true;
				break;
			}
		} while (!sortir);
	}

	public static byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\n*****HOTELANDIA*****\n");
			System.out.println("1. Crear hotel.");
			System.out.println("2. Dar de baja hotel.");
			System.out.println("3. Ver hotel.");
			System.out.println("4. Modificar hotel.");
			System.out.println("5. Ver todos los hoteles.");
			System.out.println("0. Salir de la aplicación.\n");
			opcion = teclado.nextByte();
			teclado.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.err.println("La opción no es válida.");
			}

		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static int buscarHotel(ArrayList<Hotel> hoteles) {
		int i = 0;
		int posicion = -1;

		System.out.println("Dime el nombre del hotel:");
		String nombre = teclado.nextLine();

		while (posicion == -1 && i < hoteles.size()) {
			if (hoteles.get(i).getNombre().equalsIgnoreCase(nombre)) {
				posicion = i;
			}
			i++;
		}

		return posicion;
	}

	public static void crearHotel(int posicion, ArrayList<Hotel> hoteles) {

		if (posicion == -1) {

			System.out.println("Dime el nombre del hotel que quieres dar de alta:");
			String nombre = teclado.nextLine();
			System.out.println("Dime el número de habitaciones:");
			int habitaciones = teclado.nextInt();
			System.out.println("Dime el número de plantas:");
			int plantas = teclado.nextInt();
			System.out.println("Dime la superficie:");
			int superficie = teclado.nextInt();

			Hotel hotel = new Hotel(nombre, habitaciones, plantas, superficie);
			hoteles.add(hotel);

		} else {

			System.err.println("El hotel ya está en nuestra base de datos.");
		}

	}

	public static void eliminarHotel(int posicion, ArrayList<Hotel> hoteles) {

		if (posicion != -1) {
			System.out.println("El " + hoteles.get(posicion) + " ha sido eliminado.");
			hoteles.remove(posicion);

		} else {

			System.err.println("El hotel no está en nuestra base de datos.");
		}

	}

	public static void mostrarHotel(int posicion, ArrayList<Hotel> hoteles) {

		if (posicion != -1) {
			System.out.println(hoteles.get(posicion));
			hoteles.get(posicion).calcularMantenimiento();

		} else {

			System.err.println("El hotel no está en nuestra base de datos.");
		}
	}

	public static int menuModificar() {
		int opcion;

		do {
			System.out.println("Dime qué quieres modificar de tu hotel:\n");
			System.out.println("1. Habitaciones.");
			System.out.println("2. Número de plantas.");
			System.out.println("3. Superfície.");
			opcion = teclado.nextInt();

		} while (opcion < 1 || opcion > 3);

		return opcion;
	}

	public static void modificarHotel(int posicion, int opcion, ArrayList<Hotel> hoteles) {

		switch (opcion) {

		case 1:
			modificarHabitaciones(posicion, opcion, hoteles);
			break;
		case 2:
			modificarPlantas(posicion, opcion, hoteles);
			break;
		case 3:
			modificarSuperficie(posicion, opcion, hoteles);
			break;
		default:
			System.err.println("La opción no es válida.");
		}

	}

	public static void modificarHabitaciones(int posicion, int opcion, ArrayList<Hotel> hoteles) {

		System.out.println("Dime el nuevo número de habitaciones:\n");
		int habitaciones = teclado.nextInt();
		hoteles.get(posicion).setHabitaciones(habitaciones);
		System.out.println("El cambio se ha realizado: " + hoteles.get(posicion));

	}

	public static void modificarPlantas(int posicion, int opcion, ArrayList<Hotel> hoteles) {

		System.out.println("Dime el nuevo número de plantas:\n");
		int plantas = teclado.nextInt();
		hoteles.get(posicion).setPlantas(plantas);
		System.out.println("El cambio se ha realizado: " + hoteles.get(posicion));

	}

	public static void modificarSuperficie(int posicion, int opcion, ArrayList<Hotel> hoteles) {

		System.out.println("Dime el nuevo número de habitaciones:\n");
		int habitaciones = teclado.nextInt();
		hoteles.get(posicion).setSuperficie(habitaciones);
		System.out.println("El cambio se ha realizado: " + hoteles.get(posicion));

	}

	public static void verHoteles(ArrayList<Hotel> hoteles) {

		for (Hotel verhotel : hoteles) {
			System.out.println("\n" + verhotel);
			verhotel.calcularMantenimiento();
		}

	}

}
