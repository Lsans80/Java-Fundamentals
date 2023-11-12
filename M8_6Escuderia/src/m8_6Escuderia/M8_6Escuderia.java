package m8_6Escuderia;

import java.util.ArrayList;
import java.util.Scanner;

import empleados.Empleado;

public class M8_6Escuderia {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Escuderia> escuderias = new ArrayList<Escuderia>();
		ArrayList<Coche> coches = new ArrayList<Coche>();
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		Escuderia ferrari = new Escuderia("ferrari", 3000000, "italia");
		Escuderia mercedes = new Escuderia("mercedes", 2000000, "alemania");
		Escuderia alpine = new Escuderia("alpine", 1000000, "francia");

		escuderias.add(ferrari);
		escuderias.add(mercedes);
		escuderias.add(alpine);

		Coche coche1 = new Coche(300, 300, "rojo", 80000);
		Coche coche2 = new Coche(300, 300, "amarillo", 80000);
		Coche coche3 = new Coche(300, 300, "blanco", 80000);
		

	}

}
