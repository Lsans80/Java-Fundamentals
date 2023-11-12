package m4_2varioscondicionales;

import java.util.Scanner;

public class M4_2varioscondicionales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime la edad que tienes:");
		byte edad = teclado.nextByte();

		if (edad <= 0) {
			System.out.println("La edad introducida no es correcta.");

		} else if (edad <= 5) {
			System.out.println("Vas a preescolar.");

		} else if (edad <= 11) {
			System.out.println("Vas a primaria.");

		} else if (edad <= 15) {
			System.out.println("Vas a ESO.");

		} else if (edad <= 17) {
			System.out.println("Vas a bachillerato.");

		} else {
			System.out.println("Vas a FP o Universidad.");

		}

	}

}
