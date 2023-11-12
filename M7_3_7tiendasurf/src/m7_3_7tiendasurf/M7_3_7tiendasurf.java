package m7_3_7tiendasurf;

import java.util.Scanner;

public class M7_3_7tiendasurf {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				boolean experiencia = calcularExperiencia();
				String tabla = calcularTabla(experiencia);
				System.out.println(tabla);
				break;
			case 2:
				float metros = metrosOlas();
				olas(metros);
				break;
			case 3:
				int tablaReservada = pedirTipotabla();
				int minutos = pedirMinutos();
				float precioReserva = costeReserva(tablaReservada, minutos);
				System.out.println("El coste de tu reserva son " + precioReserva + " Euros.");
				break;
			case 4:
				System.out.println("Hasta pronto!!");
				salir = true;
				break;
			}
		} while (!salir);
	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 1;
		final byte MAXIMO = 4;

		do {
			System.out.println("*****SURFÉALO*****\n");
			System.out.println("1. Calcular material tabla.");
			System.out.println("2. Imprimir forecast.");
			System.out.println("3. Calcula el coste de la reserva.");
			System.out.println("4. Salir de la aplicación.\n");
			opcion = teclado.nextByte();
			teclado.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoge un opción válida por favor.");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);

		return opcion;
	}

	public static boolean calcularExperiencia() {
		boolean experiencia = false;
		String respuesta;

		System.out.println("Tienes experiencia?");
		respuesta = teclado.nextLine().toLowerCase();
		if (respuesta.charAt(0) == 's') {
			experiencia = true;
		}

		return experiencia;

	}

	public static String calcularTabla(boolean experiencia) {
		String tabla = "";

		if (experiencia) {
			tabla = "Tabla de fibra.\n";
		} else {
			tabla = "Tabla de espuma.\n";
		}

		return tabla;
	}

	public static float metrosOlas() {
		float metros;

		System.out.println("Cuántos metros tienen las olas?");
		metros = teclado.nextFloat();

		return metros;
	}

	public static void olas(float metros) {

		if (metros > 2) {
			System.out.println("Olas grandes.\n");
		} else {
			System.out.println("Olas pequeñas.\n");
		}

	}

	public static int pedirTipotabla() {
		int tablaReservada = 0;

		do {
			System.out.println("Dime el tipo de tabla que tienes reservada:");
			System.out.println("1. Tabla de fibra.");
			System.out.println("2. Tabla de espuma.");
			tablaReservada = teclado.nextInt();

		} while (tablaReservada < 1 || tablaReservada > 2);

		return tablaReservada;
	}

	public static int pedirMinutos() {
		int minutos = 0;

		System.out.println("Dime por cuántos minutos tienes tu reserva:");
		minutos = teclado.nextInt();

		return minutos;
	}

	public static float costeReserva(int tablaReservada, int minutos) {
		float precioReserva = 0;
		float reserva = minutos / 60f;
		final int PRECIOINICIACION = 20;// tabla espuma, constante por si cambia el precio por hora.
		final int PRECIOINTERMEDIO = 35;// tabla fibra

		if (tablaReservada == 1) {
			precioReserva = reserva * PRECIOINTERMEDIO;
		} else {
			precioReserva = reserva * PRECIOINICIACION;
		}
		return precioReserva;
	}

}
