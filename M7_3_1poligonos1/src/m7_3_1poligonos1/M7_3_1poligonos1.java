package m7_3_1poligonos1;

import java.util.Scanner;

public class M7_3_1poligonos1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				cuadrado();
				break;
			case 2:
				triangulo();
				break;
			case 3:
				rectangulo();
				break;
			case 4:
				circulo();
				break;
			case 0:
				System.out.println("Hasta pronto!!.");
				salir = true;
				break;
			default:
				System.err.println("Introduce un número correcto por favor.");
			}
		} while (!salir);
	}

	public static byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			
			System.out.println("\n*****POLÍGONOS*****\n");
			System.out.println("1. Cuadrado.");
			System.out.println("2. Triángulo.");
			System.out.println("3. Rectángulo.");
			System.out.println("4. Círculo.");
			System.out.println("0. Salir de la aplicación.\n");
			opcion = teclado.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escull una opció vàlida");
			}
			
		} while (opcion < MINIMO || opcion > MAXIMO);
		
		return opcion;
	}

	public static void cuadrado() {
		float base, altura;
			
		System.out.println("Dime la base de tu cuadrado:");
		base = teclado.nextFloat();
		System.out.println("Dime la altura de tu cuadrado:");
		altura = teclado.nextFloat();
		
		System.out.println("El área de tu cuadrado es " + base*altura + " m².");
	}

	public static void triangulo() {
		float base, altura;
		
		System.out.println("Dime la base de tu triángulo:");
		base = teclado.nextFloat();
		System.out.println("Dime la altura de tu triángulo:");
		altura = teclado.nextFloat();
		
		System.out.println("El área de tu triángulo es " + (base*altura/2) + " m².");
	}

	public static void rectangulo() {
		float base, altura;
		
		System.out.println("Dime la base de tu rectángulo:");
		base = teclado.nextFloat();
		System.out.println("Dime la altura de tu rectángulo:");
		altura = teclado.nextFloat();
		
		System.out.println("El área de tu rectángulo es " + base*altura + " m².");
	}
	
	public static void circulo() {
		float diametro;
		
		System.out.println("Dime el diámetro de tu círculo:");
		diametro = teclado.nextFloat();		
		
		System.out.println("El área de tu círculo es " + (diametro/2*Math.PI) + " mts.");
	}

}
