package ejercicio1marzo;

import java.util.Scanner;

public class Ejercicio1marzo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellido;
		byte edad;
		
		System.out.println("Introduzca su nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Introduzca su apellido");
		apellido = teclado.nextLine();
		
		System.out.println("Introduzca su edad");
		edad = teclado.nextByte();
		//concatenacion
		System.out.println("Su nombre es: "+nombre+", su apellido es: "+apellido+", y tiene: "+edad);

	}

}
