package m7_3_7fideua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M7_3_7fideua {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int personas;
		final float FIDEOSPARA1 = 0.125f;
		final float CALAMARESPARA1 = 0.1f;
		final float GAMBASPARA1 = 0.05f;
				
		System.out.println("*Vamos a calcular lo que se necesita para nuestra fideuá!!*" + "\nCuántos sois?");
		personas = teclado.nextInt();

		System.out.println("Precio del kilo de fideos:");
		float precioKiloFideos = teclado.nextFloat();

		System.out.println("Precio del kilo de calamares:");
		float precioKiloCalamares = teclado.nextFloat();

		System.out.println("Precio del kilo de gambas:");
		float precioKiloGambas = teclado.nextFloat();
		
		DecimalFormat kg = new DecimalFormat("#0.000");
		DecimalFormat euro = new DecimalFormat("#0.00");

		float totalFideos = FIDEOSPARA1*precioKiloFideos;
		float totalCalamares = CALAMARESPARA1 * precioKiloCalamares;
		float totalGambas = GAMBASPARA1 * precioKiloGambas;
			
		System.out.println("Necesitamos:");	
		System.out.println(kg.format(personas * FIDEOSPARA1) + " Kg de fideos.");
		System.out.println(kg.format(personas * CALAMARESPARA1) + " Kg de calamares.");
		System.out.println(kg.format(personas * GAMBASPARA1) + " Kg de gambas.\n");		
		System.out.println("El precio por persona es de: " + euro.format(totalFideos+totalCalamares+totalGambas) + " Euros.");
		System.out.println("El coste total de la fideuá es de: " + euro.format((totalFideos+totalCalamares+totalGambas)*personas) + " Euros.");
	}

}
