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
				System.err.println("Introduce un n�mero correcto por favor.");
			}
		} while (!salir);
	}

	public static byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			
			System.out.println("\n*****POL�GONOS*****\n");
			System.out.println("1. Cuadrado.");
			System.out.println("2. Tri�ngulo.");
			System.out.println("3. Rect�ngulo.");
			System.out.println("4. C�rculo.");
			System.out.println("0. Salir de la aplicaci�n.\n");
			opcion = teclado.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escull una opci� v�lida");
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
		
		System.out.println("El �rea de tu cuadrado es " + base*altura + " m�.");
	}

	public static void triangulo() {
		float base, altura;
		
		System.out.println("Dime la base de tu tri�ngulo:");
		base = teclado.nextFloat();
		System.out.println("Dime la altura de tu tri�ngulo:");
		altura = teclado.nextFloat();
		
		System.out.println("El �rea de tu tri�ngulo es " + (base*altura/2) + " m�.");
	}

	public static void rectangulo() {
		float base, altura;
		
		System.out.println("Dime la base de tu rect�ngulo:");
		base = teclado.nextFloat();
		System.out.println("Dime la altura de tu rect�ngulo:");
		altura = teclado.nextFloat();
		
		System.out.println("El �rea de tu rect�ngulo es " + base*altura + " m�.");
	}
	
	public static void circulo() {
		float diametro;
		
		System.out.println("Dime el di�metro de tu c�rculo:");
		diametro = teclado.nextFloat();		
		
		System.out.println("El �rea de tu c�rculo es " + (diametro/2*Math.PI) + " mts.");
	}

}
