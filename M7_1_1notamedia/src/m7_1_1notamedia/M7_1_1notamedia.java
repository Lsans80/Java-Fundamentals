package m7_1_1notamedia;

import java.util.Scanner;

public class M7_1_1notamedia {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		final int MAXNOTAS = 3;

		float totalNotas = pedirNotas(MAXNOTAS);

		notaMedia(MAXNOTAS, totalNotas);

	}

	public static float pedirNotas(int MAXNOTAS) {
		int i = 1;
		float totalNotas = 0;

		while (i <= MAXNOTAS) {
			System.out.print("Dime la nota " + i + ":");
			float nota = teclado.nextFloat();

			if (nota < 0 || nota > 10) {
				System.err.println("La nota introducida no es correcta.");
			} else {
				totalNotas = totalNotas + nota;
				i++;
			}

		}

		return totalNotas;

	}

	public static void notaMedia(int MAXNOTAS, float totalNotas) {

		float notaMedia = totalNotas / MAXNOTAS;

		System.out.println("La nota media es : " + notaMedia);

		if (notaMedia < 5) {
			System.out.println("No has superado el curso tienes que recuperar.");
		} else if (notaMedia < 7) {
			System.out.println("Enhorabuena!! Has aprobado pero deberías seguir practicando.");
		} else {
			System.out.println("Enhorabuena!! Has superado el curso! Pasas al siguiente nivel.");
		}

	}

}
