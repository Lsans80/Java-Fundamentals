package m5ejerextraN;

import java.util.Scanner;

public class M5ejerextraN {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aleatorio = (int) Math.ceil((Math.random() *500));
		int numero1;
		
		System.out.println(aleatorio);
		
		System.out.println("Introduce un n�mero del 1 al 500");
			numero1 = teclado.nextInt();
			teclado.nextLine();	
			
							
		do {
			
			int resultado = aleatorio - numero1;			
			
			if (resultado >= 0 && resultado < 15) {
				System.out.println("Caliente, caliente: t� n�mero es m�s peque�o");				
				numero1 = teclado.nextInt();
				teclado.nextLine();
				
			} else if (resultado < 0 && resultado > -15) {
				System.out.println("Caliente, caliente: t� n�mero es m�s grande");
				numero1 = teclado.nextInt();
				teclado.nextLine();
				
			} else if (resultado >= 0 && resultado < 49) {
				System.out.println("Tibio, tibio: t� n�mero es m�s peque�o");
				numero1 = teclado.nextInt();
				teclado.nextLine();

			} else if (resultado < 0 && resultado > -49) {
				System.out.println("Tibio, tibio: t� n�mero es m�s grande");
				numero1 = teclado.nextInt();
				teclado.nextLine();

			} else if (resultado >= 0 && resultado <= 50) {
				System.out.println("Fr�o, fr�o: t� n�mero es m�s peque�o");
				numero1 = teclado.nextInt();
				teclado.nextLine();
			
			} else if (resultado < 0 && resultado >= -50) {
				System.out.println("Fr�o, fr�o: t� n�mero es m�s grande");
				numero1 = teclado.nextInt();
				teclado.nextLine();
			
			}
			
		} while (aleatorio != numero1);
		
		System.out.println("Has acertado!! El n�mero elegido era el "+aleatorio);		
		
	}

}
