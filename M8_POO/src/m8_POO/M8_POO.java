package m8_POO;

import java.util.Scanner;

public class M8_POO {

	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Dime tu apellido:");
		String apellido = teclado.nextLine();
		System.out.println("Dime tu DNI:");
		String dni = teclado.nextLine();
		System.out.println("Dime edad:");
		int edad = teclado.nextInt();
		
		Alumno Alumnos = new Alumno(nombre, apellido, dni, edad);
		
		System.out.println(Alumnos.toString());
		
		Alumnos.birthday();
		
		System.out.println(Alumnos);	
		
	}

}
