package examen3;

import java.util.ArrayList;

public class Examen3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(5);
		numeros.add(2);
		numeros.add(3);
		numeros.add(8);
		numeros.add(1);
		numeros.add(6);
		numeros.add(5);

		int sumaMayor = sumaMayor(numeros);

		System.out.println("La suma mayor de 2 números correlativos de la lista es " + sumaMayor);

	}

	public static int sumaMayor(ArrayList<Integer> numeros) {
		int sumaMayor = 0;
		int suma = 0;
		// int i = 1;
		
		/* while (i<numeros.size()) { 
		  
		  	suma = numeros.get(i) + numeros.get(i-1);
		 
		 		if (suma > sumaMayor) { 
		 			sumaMayor = suma; 		 		
		 		} 
		 		
		 		i++; 
		 	}
		 */

		for (int i = 1; i < numeros.size(); i++) {

			suma = numeros.get(i) + numeros.get(i - 1);

			if (suma > sumaMayor) {
				sumaMayor = suma;
			}

		}

		return sumaMayor;

	}

}
