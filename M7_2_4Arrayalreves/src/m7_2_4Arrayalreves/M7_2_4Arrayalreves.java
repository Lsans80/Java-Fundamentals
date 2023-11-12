package m7_2_4Arrayalreves;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_2_4Arrayalreves {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numalreves = new ArrayList<Integer>();

		numeros.add(3);
		numeros.add(6);
		numeros.add(9);
		numeros.add(2);
		numeros.add(1);
		numeros.add(0);

		int size = numeros.size() - 1;

		for (int i = size; i >= 0; i--) {

			numalreves.add(numeros.get(i));
		}
		
		System.out.println(numeros);
		System.out.println(numalreves);

	}

}
