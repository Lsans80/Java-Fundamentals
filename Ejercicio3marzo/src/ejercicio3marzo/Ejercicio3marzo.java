package ejercicio3marzo;

import java.util.Scanner;

public class Ejercicio3marzo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1, numero2, numero3;//aqui tambien se puede poner tipo byte (1) ya que ocupa menos que int (4)
		float resultado;
		final int NOTAS = 3;// constantes siempre en mayusculas
		
		System.out.println("Introduzca numero 1");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduzca numero 2");
		numero2 = teclado.nextInt();
		
		System.out.println("Introduzca numero 3");
		numero3 = teclado.nextInt();
		
		resultado = (float)(numero1+numero2+numero3)/NOTAS;
		//aqui casteamos delante de los valores int para que los convierta en float	
		
		System.out.println("La media es: "+resultado);

	}

}
