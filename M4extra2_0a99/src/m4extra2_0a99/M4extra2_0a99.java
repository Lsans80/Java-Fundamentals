package m4extra2_0a99;

import java.util.Scanner;

public class M4extra2_0a99 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] edad = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once",
				"Doce", "Trece", "Catorce", "Quinze", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte",
				"Veinteuno", "Veintedos", "Veintetres", "Veintecuatro", "Veintecinco", "Veinteseis", "Veintesiete",
				"Veinteocho", "Veintenueve", "Treinta", "Treinta y uno", "Treinta y dos", "Treinta y tres",
				"Treinta y cuatro", "Treinta y cinco", "Treinta y seis", "Treinta y siete", "Treinta y ocho",
				"Treinta y nueve", "Cuarenta", "Cuarenta y uno", "Cuarenta y dos", "Cuarenta y tres",
				"Cuarenta y cuatro", "Cuarenta y cinco", "Cuarenta y seis", "Cuarenta y siete", "Cuarenta y ocho",
				"Cuarenta y nueve", "Cincuenta", "Cincuenta y uno", "Cincuenta y dos", "Cincuenta y tres",
				"Cincuenta y cuatro", "Cincuenta y cinco", "Cincuenta y seis", "Cincuenta y siete", "Cincuenta y ocho",
				"Cincuenta y nueve", "Sesenta", "Sesenta y uno", "Sesenta y dos", "Sesenta y tres", "Sesenta y cuatro",
				"Sesenta y cinco", "Sesenta y seis", "Sesenta y siete", "Sesenta y ocho", "Sesenta y nueve", "Setenta",
				"Setenta y uno", "Setenta y dos", "Stsenta y tres", "Setenta y cuatro", "Setenta y cinco",
				"Setenta y seis", "Setenta y siete", "Setenta y ocho", "Setenta y nueve", "Ochenta", "Ochenta y uno",
				"Ochenta y dos", "Ochenta y tres", "Ochenta y cuatro", "Ochenta y cinco", "Ochenta y seis",
				"Ochenta y siete", "Ochenta y ocho", "Ochenta y nueve", "Noventa", "Noventa y uno", "Noventa y dos",
				"Noventa y tres", "Noventa y cuatro", "Noventa y cinco", "Noventa y seis", "Noventa y siete",
				"Noventa y ocho", "Noventa y nueve" };

		System.out.println("Dime que edad tienes:");
		int numero = teclado.nextInt();

		System.out.println(edad[numero - 1]);

	}

}
