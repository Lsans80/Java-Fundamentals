package m4_extrapdfdiasemana;

import java.util.Scanner;

public class M4_extrapdfdiasemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el día de la semana en el que estás:");
		System.out.println("1. Lunes");
		System.out.println("2. Martes");
		System.out.println("3. Miércoles");
		System.out.println("4. Jueves");
		System.out.println("5. Viernes");
		System.out.println("6. Sábado");
		System.out.println("7. Domingo");
		
		int opcion = teclado.nextInt();
		
		switch (opcion) {
		
		case 1:
			System.out.println("Faltan 5 días para el fin de semana: Lunes, Martes, Miércoles, Jueves y Viernes.");
			break;
		case 2:
			System.out.println("Faltan 4 días para el fin de semana: Martes, Miércoles, Jueves y Viernes.");
			break;
		case 3:
			System.out.println("Faltan 3 días para el fin de semana: Miércoles, Jueves y Viernes.");
			break;
		case 4:
			System.out.println("Faltan 2 días para el fin de semana: Jueves y Viernes.");
			break;	
		case 5:
			System.out.println("Falta 1 día para el fin de semana: Viernes.");
			break;
		case 6:
		case 7:
			System.out.println("Ya es fin de semana!!! Relaaaajaaaateeee.");
		default:
			System.err.println("Introduce un número del 1 al 7.");
		}

	}

}
