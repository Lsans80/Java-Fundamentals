package m3_1Introducciondatos;

import java.util.Scanner;

public class M3_1Introducciondatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca su apellido");
		String apellido = teclado.nextLine();
		
		System.out.println("Introduzca su edad");
		byte edad = teclado.nextByte();
		
		System.out.println("Su nombre es "+nombre+", su apellido es "+apellido+", y tiene "+edad+" años.");
		
		System.out.print("Su nombre al revés es ");//concatenación.
		
		//no es necesario para el ejercicio.
		int j = 1;
		for (int i = 0; i < nombre.length(); i++) {
			System.out.print(nombre.charAt(nombre.length()-j));
			j++;
		}

	}

}
