package m3_extra3;

import java.util.Scanner;

public class M3_extra3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int COBERTURALITRO = 12;
		
		System.out.println("*****PINTURAS SANS*****\n");
		System.out.println("Dime el alto de la pared que quieres pintar:");
		float altoPared =  teclado.nextFloat();
		
		System.out.println("Dime el ancho de la pared que quieres pintar:");
		float anchoPared =  teclado.nextFloat();
		
		System.out.println("Dime cuantas manos vas a dar:");
		int manosPintura =  teclado.nextInt();
		
		float totalLitros = (float) Math.ceil((altoPared * anchoPared * manosPintura)/COBERTURALITRO);
		
		System.out.println("Necesitas " + totalLitros + " litros para pintar " + Math.ceil(altoPared * anchoPared) + " m².");

	}

}
