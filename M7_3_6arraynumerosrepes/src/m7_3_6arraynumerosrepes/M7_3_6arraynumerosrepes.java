package m7_3_6arraynumerosrepes;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_3_6arraynumerosrepes {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		
		int borrados = 0;
		
		numeros.add(9);
		numeros.add(2);
		numeros.add(10);
		numeros.add(4);
		numeros.add(8);
		numeros.add(9);		
		numeros.add(4);	
		numeros.add(10);
		
		for (int i = 0; i < numeros.size(); i++) {
			for (int j = i + 1; j < numeros.size(); j++) {
				if (numeros.get(i)==(numeros.get(j))) {
					borrados++;
					numeros.remove(j);
				}
			}
			
		}
		
		System.out.println(numeros);
		
		System.out.println("Se han borrado " + borrados + " números duplicados.");

	}

}
