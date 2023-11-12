package m7_1_8celsiustofahrenheit;

import java.util.Scanner;

public class M7_1_8celsiustofahrenheit {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		float celsius;
		float fahrenheit;
		
		System.out.println("Dime la temperatura en Celius:");
		celsius = teclado.nextFloat();
		
		fahrenheit = (celsius * (9 / 5)) + 32;
		
		System.out.println(celsius + "°C"+" son "+fahrenheit+"°F.");

	}



}
