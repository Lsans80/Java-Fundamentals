package m4_extrapdfdiastranscurridos;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class M4_extrapdfdiastranscurridos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		LocalDate fechaInicio = LocalDate.of(2023, Month.JANUARY, 01);
		LocalDate fechaActual = null;

		System.out.println("Dime la fecha en la que estás:");
		System.out.println("Día:");
		int dia = teclado.nextInt();
		System.out.println("Mes:");
		int mes = teclado.nextInt();
		System.out.println("Año:");
		int año = teclado.nextInt();

		switch (mes) {

		case 1:
			fechaActual = LocalDate.of(año, Month.JANUARY, dia);
			break;
		case 2:
			fechaActual = LocalDate.of(año, Month.FEBRUARY, dia);
			break;
		case 3:
			fechaActual = LocalDate.of(año, Month.MARCH, dia);
			break;
		case 4:
			fechaActual = LocalDate.of(año, Month.APRIL, dia);
			break;
		case 5:
			fechaActual = LocalDate.of(año, Month.MAY, dia);
			break;
		case 6:
			fechaActual = LocalDate.of(año, Month.JUNE, dia);
			break;
		case 7:
			fechaActual = LocalDate.of(año, Month.JULY, dia);
			break;
		case 8:
			fechaActual = LocalDate.of(año, Month.AUGUST, dia);
			break;
		case 9:
			fechaActual = LocalDate.of(año, Month.SEPTEMBER, dia);
			break;
		case 10:
			fechaActual = LocalDate.of(año, Month.OCTOBER, dia);
			break;
		case 11:
			fechaActual = LocalDate.of(año, Month.NOVEMBER, dia);
			break;
		case 12:
			fechaActual = LocalDate.of(año, Month.DECEMBER, dia);
			break;
		default:
			System.err.println("El mes introducido no es correcto.");
		}

		long noOfDaysBetween = ChronoUnit.DAYS.between(fechaInicio, fechaActual);
		System.out.println("Entre el 01/01/2023 y el "+dia+"/"+mes+"/"+año+ " han transcurrido "+noOfDaysBetween+" días.");

	}

}
