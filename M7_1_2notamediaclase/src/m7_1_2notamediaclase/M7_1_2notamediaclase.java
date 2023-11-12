package m7_1_2notamediaclase;

import java.util.Scanner;

public class M7_1_2notamediaclase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Dime cuantas notas quieres introducir:");
		int numNotas = teclado.nextInt();

		float sumaNotas = pedirNotas(numNotas);

		mediaNotas(numNotas, sumaNotas);		

	}

	public static float pedirNotas(int numNotas) {
		int i = 1;
		float sumaNotas = 0;

		while (i <= numNotas) {
			System.out.print("Dime la nota " + i + ":");
			float nota = teclado.nextFloat();

			if (nota < 0 || nota > 10) {
				System.err.println("La nota debe estar entre el 1 y el 10.");
			} else {
				sumaNotas = sumaNotas + nota;
				i++;
			}

		}

		return sumaNotas;

	}

	public static void mediaNotas(int numNotas, float sumaNotas) {

		float mediaNotas = sumaNotas / numNotas;
		
		System.out.println("La nota media de la clase es: " + mediaNotas);
		
		if (mediaNotas < 5) {
			System.out.println("La nota media de la clase está suspendida. Los alumnos deberían preguntar sobre las dudas y trabajar más.");
		} else if (mediaNotas < 7) {
			System.out.println("La nota media de la es buena, pero los alumnos deberían mejorar el trabajo personal.");
		} else {
			System.out.println("Enhorabuena!! La nota media de la clase es igual al esfuerzo realizado.");
		}

	}

}
