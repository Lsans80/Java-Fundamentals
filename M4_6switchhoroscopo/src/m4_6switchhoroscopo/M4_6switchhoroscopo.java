package m4_6switchhoroscopo;

import java.util.Scanner;

public class M4_6switchhoroscopo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int dia;
		int mes;
		
		System.out.println("*****HORÓSCOPO*****\n");
		
		do {
			System.out.println("Dime el día que nacistes:");
			dia = teclado.nextInt();
			
		} while (dia < 1 || dia > 31);
				
		System.out.println("Dime el mes en el que nacistes:");
		mes = teclado.nextInt();
		
		switch (mes) {
		
		case 1:
			if (dia >= 1 && dia <= 19) {
				System.out.println("Eres Capricornio!");
			} else if (dia >= 20 && dia <=31) {
				System.out.println("Eres Acuario!");
			} // si no tenemos el do/while: else {System.out.println("El día no es correcto");}				
			break;
		case 2:
			if (dia >= 1 && dia <= 18) {
				System.out.println("Eres Acuario!");
			} else if (dia >= 19 && dia <=29) {
				System.out.println("Eres Piscis!");
			} else {
				System.err.println("Febrero nunca es tan largo.");
			}
			break;
		case 3:
			if (dia >= 1 && dia <= 20) {
				System.out.println("Eres Piscis!");
			} else if (dia >= 21 && dia <=31) {
				System.out.println("Eres Aries!");
			}
			break;
		case 4:
			if (dia >= 1 && dia <= 19) {
				System.out.println("Eres Aries!");
			} else if (dia >= 20 && dia <=30) {
				System.out.println("Eres Tauro!");
			}
			break;
		case 5:
			if (dia >= 1 && dia <= 20) {
				System.out.println("Eres Tauro!");
			} else if (dia >= 21 && dia <=31) {
				System.out.println("Eres Géminis!");
			}
			break;
		case 6:
			if (dia >= 1 && dia <= 20) {
				System.out.println("Eres Géminis!");
			} else if (dia >= 21 && dia <=30) {
				System.out.println("Eres Cancer!");
			}
			break;
		case 7:
			if (dia >= 1 && dia <= 22) {
				System.out.println("Eres Cancer!");
			} else if (dia >= 23 && dia <=31) {
				System.out.println("Eres Leo!");
			}
			break;
		case 8:
			if (dia >= 1 && dia <= 22) {
				System.out.println("Eres Leo!");
			} else if (dia >= 23 && dia <=31) {
				System.out.println("Eres Virgo!");
			}
			break;
		case 9:
			if (dia >= 1 && dia <= 22) {
				System.out.println("Eres Virgo!");
			} else if (dia >= 23 && dia <=30) {
				System.out.println("Eres Libra!");
			}
			break;
		case 10:
			if (dia >= 1 && dia <= 22) {
				System.out.println("Eres Libra!");
			} else if (dia >= 23 && dia <=31) {
				System.out.println("Eres Escorpio!");
			}
			break;
		case 11:
			if (dia >= 1 && dia <= 21) {
				System.out.println("Eres Escorpio!");
			} else if (dia >= 22 && dia <=30) {
				System.out.println("Eres Sagitario!");
			}
			break;
		case 12:
			if (dia >= 1 && dia <= 21) {
				System.out.println("Eres Sagitario!");
			} else if (dia >= 22 && dia <=31) {
				System.out.println("Eres Capricornio!");
			}
			break;
		default:
			System.err.println("El mes introducido no es correcto.");	
		
		}	
		
	}

}
