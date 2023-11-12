package m4_extrapdfdiasemana;

import java.util.Scanner;

public class M4_extrapdfdiasemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el d�a de la semana en el que est�s:");
		System.out.println("1. Lunes");
		System.out.println("2. Martes");
		System.out.println("3. Mi�rcoles");
		System.out.println("4. Jueves");
		System.out.println("5. Viernes");
		System.out.println("6. S�bado");
		System.out.println("7. Domingo");
		
		int opcion = teclado.nextInt();
		
		switch (opcion) {
		
		case 1:
			System.out.println("Faltan 5 d�as para el fin de semana: Lunes, Martes, Mi�rcoles, Jueves y Viernes.");
			break;
		case 2:
			System.out.println("Faltan 4 d�as para el fin de semana: Martes, Mi�rcoles, Jueves y Viernes.");
			break;
		case 3:
			System.out.println("Faltan 3 d�as para el fin de semana: Mi�rcoles, Jueves y Viernes.");
			break;
		case 4:
			System.out.println("Faltan 2 d�as para el fin de semana: Jueves y Viernes.");
			break;	
		case 5:
			System.out.println("Falta 1 d�a para el fin de semana: Viernes.");
			break;
		case 6:
		case 7:
			System.out.println("Ya es fin de semana!!! Relaaaajaaaateeee.");
		default:
			System.err.println("Introduce un n�mero del 1 al 7.");
		}

	}

}
