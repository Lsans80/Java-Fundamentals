package m3ejercicio2extracondicional;

import java.util.Scanner;

public class M3ejercicio2extracondicional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int varInt;
		int numero;	
		
		System.out.println("Dime un numero");
		numero = teclado.nextInt();
		
		varInt = (numero <=10)? numero : (varInt=1); //ejemplo: (condition) ? x : y	/ let text = (age < 18) ? "Too young":"Old enough";
		
		/*if (varInt <=10) {
			} else {
				varInt = 1;
			}*/
		
		System.out.println("La tabla de multiplicar de "+ varInt + " es:");
		System.out.println(varInt + " *" + " 1 " + " = "+(varInt*1));
		System.out.println(varInt + " *" + " 2 " + " = "+(varInt*2));
		System.out.println(varInt + " *" + " 3 " + " = "+(varInt*3));
		System.out.println(varInt + " *" + " 4 " + " = "+(varInt*4));
		System.out.println(varInt + " *" + " 5 " + " = "+(varInt*5));
		System.out.println(varInt + " *" + " 6 " + " = "+(varInt*6));
		System.out.println(varInt + " *" + " 7 " + " = "+(varInt*7));
		System.out.println(varInt + " *" + " 8 " + " = "+(varInt*8));
		System.out.println(varInt + " *" + " 9 " + " = "+(varInt*9));
		
		}

	}


