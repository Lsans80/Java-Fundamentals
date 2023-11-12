package m7_3_6arraysumaparimpa;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_3_6arraysumaparimpa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(8);
		numeros.add(3);
		numeros.add(2);
		numeros.add(10);
		numeros.add(13);
		
		int par = 0;
		int impar = 0;

		for (int i = 0; i < numeros.size(); i++) {
			
			if (numeros.get(i) % 2 == 0) {
				par = numeros.get(i) + par;
				
			} else if (numeros.get(i) % 2 != 0){
				impar = numeros.get(i) + impar;
			}
		}
		
		System.out.println("Los números del array son: " + numeros);

		System.out.println("La suma de todos los números pares es " + par + ".");
		System.out.println("La suma de todos los números impares es " + impar + ".");

	}
	
	//Pidiendo al usuario la lista de números:
	/*public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int numero;
		int cantidadNumeros = 0;
		int par = 0;
		int impar = 0;

		System.out.println("Dime cuantos números quieres introducir.");
		cantidadNumeros = teclado.nextInt();
		
		System.out.println("Dime la lista de números que quieras.");
		
		for (int j = 0; j < cantidadNumeros; j++) {
			
			numero = teclado.nextInt();
			numeros.add(numero);
		}		
			
		for (int i = 0; i < numeros.size(); i++) {
			
			if (numeros.get(i) % 2 == 0) {
				par = numeros.get(i) + par;
				
			} else if (numeros.get(i) % 2 != 0){
				impar = numeros.get(i) + impar;
			}
		}

		System.out.println("La suma de todos los números pares es " + par + ".");
		System.out.println("La suma de todos los números impares es " + impar + ".");

	}*/


}
