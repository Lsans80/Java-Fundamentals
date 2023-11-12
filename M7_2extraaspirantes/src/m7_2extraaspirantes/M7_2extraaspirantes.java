package m7_2extraaspirantes;

import java.util.Scanner;

public class M7_2extraaspirantes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String cand1, cand2;
		String nombre;
		float numAlumnos;
		byte votos1 = 0, votos2 = 0, nulo = 0;

		System.out.println("Dime el número total de alumnos:");
		numAlumnos = teclado.nextFloat();
		teclado.nextLine();

		System.out.println("Dime el nombre del aspirante 1:");
		cand1 = teclado.nextLine();

		System.out.println("Dime el nombre del aspirante 2:");
		cand2 = teclado.nextLine();

		for (int i = 1; i <= numAlumnos; i++) {

			System.out.println("Para quién es tu voto?.\nSi es nulo escribe cero.");
			nombre = teclado.nextLine();

			if (cand1.equals(nombre)) {
				votos1++;

			} else if (cand2.equals(nombre)) {
				votos2++;

			} else {
				nulo++;
			}

		}

		if (votos1 > votos2) {
			System.out.println("El ganadxr es " + cand1);

		} else if (votos2 > votos1) {
			System.out.println("El ganadxr es " + cand2);

		} else if (votos1 == votos2 && votos1 + votos2 > 0) {
			System.out.println("Hay un empate entre " + cand1 + " y " + cand2);

		} else {
			System.out.println("No hay suficientes votos para los candidatos.\nHay " + nulo + " votos nulos.");
		}

	}

}
