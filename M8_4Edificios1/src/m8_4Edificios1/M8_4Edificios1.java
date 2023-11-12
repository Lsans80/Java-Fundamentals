package m8_4Edificios1;

import java.util.ArrayList;
import java.util.Scanner;

import Edificios.Cine;
import Edificios.Edificio;
import Edificios.Hospital;
import Edificios.Hotel;

public class M8_4Edificios1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();
		boolean salir = false;

		Hotel hotel = new Hotel("Wella", 20, 3000, 300);
		Hospital hospital = new Hospital("La Valle", 10, 2000, 200);
		Cine cine = new Cine("Metropolitan", 3, 2000, 500);

		edificios.add(hotel);
		edificios.add(hospital);
		edificios.add(cine);

		do {
			switch (menu()) {
			case 1:
				crearEdificio(edificios);
				break;
			case 2:
				verEdificio(edificios);
				break;
			case 3:
				dardebajaEdificio(edificios);
				break;
			case 4:
				mostrarEdificios(edificios);
				break;
			case 5:

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
		final byte MAXIMO = 4;

		do {
			System.out.println("\n*****EDIFICIOS*****\n");
			System.out.println("1. Crear edificio.");
			System.out.println("2. Ver edificio.");
			System.out.println("3. Dar de baja edificio.");
			System.out.println("4. Mostrar edificios.");
			System.out.println("0. Salir de la aplicación.\n");
			opcion = teclado.nextByte();
			teclado.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.err.println("La opción no es válida.");
			}

		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static Edificio buscarEdificio(String nombre, ArrayList<Edificio> edificios) {
		Edificio edificio = null;
		int i = 0;

		while (edificio == null && i < edificios.size()) {
			if (nombre.equalsIgnoreCase(edificios.get(i).getNombre())) {
				edificio = edificios.get(i);
			}
			i++;
		}

		return edificio;
	}

	public static Edificio crearEdificio(ArrayList<Edificio> edificios) {
		int tipoEdificio;

		do {
			System.out.println("Dime que tipo de edificio quieres crear:\n1.Hotel\n2.Hospital\n3.Cine");
			tipoEdificio = teclado.nextInt();
			teclado.nextLine();

		} while (tipoEdificio < 1 && tipoEdificio > 3);

		System.out.println("Dime el nombre del edificio:");
		String nombre = teclado.nextLine();

		Edificio edificio = buscarEdificio(nombre, edificios);

		if (edificio == null) {

			System.out.println("Dime el número de plantas:");
			int numPlantas = teclado.nextInt();
			System.out.println("Dime la superficie:");
			int superficie = teclado.nextInt();

			switch (tipoEdificio) {
			case 1:
				System.out.println("Dime el número de enfermos que tiene el hospital:");
				int numEnfermos = teclado.nextInt();
				edificio = new Hospital(nombre, numPlantas, superficie, numEnfermos);
				break;
			case 2:
				System.out.println("Dime el número de habitaciones:");
				int numHabitaciones = teclado.nextInt();
				edificio = new Hotel(nombre, numPlantas, superficie, numHabitaciones);
				break;
			case 3:
				System.out.println("Dime el aforo:");
				int aforo = teclado.nextInt();
				edificio = new Cine(nombre, numPlantas, superficie, aforo);
				break;
			}
		} else {
			System.out.println("El edificio ya existe en nuestra base de datos.");
		}

		return edificio;
	}

	public static void verEdificio(ArrayList<Edificio> edificios) {

		System.out.println("Dime el nombre del edificio:");
		String nombre = teclado.nextLine();

		Edificio edificio = buscarEdificio(nombre, edificios);

		if (edificio != null) {

			System.out.println(edificio.toString());
			edificio.limpiarEdificio();
			edificio.calcularCostevigilancia();

			if (edificio instanceof Hotel) {
				Hotel hotel = (Hotel) edificio;
				hotel.servicioHabitaciones();

			} else if (edificio instanceof Hospital) {
				Hospital hospital = (Hospital) edificio;
				hospital.repartirComida();

			} else if (edificio instanceof Cine) {
				Cine cine = (Cine) edificio;
				System.out.println("Dime el número de asistentes a la sesión:");
				int asistentes = teclado.nextInt();
				System.out.println("Dime el precio de la entrada:");
				float precioEntrada = teclado.nextInt();
				cine.proyectarSesion(asistentes, precioEntrada);

			} else {
				System.out.println("El edificio ya existe en nuestra base de datos.");
			}
		}

	}

	public static void dardebajaEdificio(ArrayList<Edificio> edificios) {
		System.out.println("Dime el nombre del edificio:");
		String nombre = teclado.nextLine();

		Edificio edificio = buscarEdificio(nombre, edificios);

		if (edificio != null) {
			System.out.println("El edificio " + nombre + " ha sido eliminado.");
			edificios.remove(edificio);
		} else {
			System.err.println("El edificio ya existe en nuestra base de datos.");
		}

	}
	
	public static void mostrarEdificios (ArrayList<Edificio> edificios) {
		
		for (Edificio edificio : edificios) {
			System.out.println(edificio);
			edificio.limpiarEdificio();
			edificio.calcularCostevigilancia();
			
			if (edificio instanceof Hotel) {
				((Hotel) edificio).servicioHabitaciones();
				System.out.println("\n");
			} else if (edificio instanceof Hospital){
				((Hospital) edificio).repartirComida();
				System.out.println("\n");
			} else if (edificio instanceof Cine) {
				((Cine) edificio).proyectarSesion(0, 0);
				System.out.println("\n");
			}
			
			
		}
	}

}
