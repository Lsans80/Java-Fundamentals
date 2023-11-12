package m7_1_5menutareas;

import java.util.ArrayList;
import java.util.Scanner;

public class M7_1_5menutareas {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> tareas = new ArrayList<String>();
		int opcion;

		do {

			opcion = menu();

			switch (opcion) {

			case 1:
				añadirTarea(tareas);
				break;
			case 2:
				mostrarTarea(tareas);
				break;
			case 3:
				eliminarTarea(tareas);
				break;
			case 4:
				System.out.println("Nos vemos pronto!.");
				break;
			default:
				System.err.println("Elige una opción válida por favor.");
			}

		} while (opcion != 4);
	}

	public static int menu() {

		System.out.println("*****TAREAS*****");
		System.out.println("1. Añadir tarea.");
		System.out.println("2. Mostrar tarea.");
		System.out.println("3. Eliminar tarea.");
		System.out.println("0. Salir de la aplicación.\n");

		System.out.println("Dime la opción que quieres:");
		int opcion = teclado.nextInt();
		teclado.nextLine();

		return opcion;
	}

	public static void añadirTarea(ArrayList<String> tareas) {

		System.out.println("Dime la tarea que quieres añadir:");
		String nuevaTarea = teclado.nextLine();
		tareas.add(nuevaTarea);
		System.out.println("Tu tarea " + nuevaTarea + " ha sido añadida.");

	}

	public static void mostrarTarea(ArrayList<String> tareas) {

		for (int i = 0; i < tareas.size(); i++) {
			System.out.println((i + 1) + "." + tareas.get(i));
		}

	}

	public static void eliminarTarea(ArrayList<String> tareas) {

		mostrarTarea(tareas);
		System.out.println("Dime el índice de la tarea que quieres eliminar:");
		int numTarea = teclado.nextInt();
		
		if (numTarea >0 && numTarea <= tareas.size()) {
			tareas.remove(numTarea-1);
			System.out.println("Tu tarea " + numTarea + " ha sido eliminada.");
		} else {
			System.out.println("La tarea no se encuentra en la lista.");
		}
		
		//Comparando String para eliminar:
		
		/*mostrarTarea(tareas);
		System.out.println("Dime el índice de la tarea que quieres eliminar:");
		Sring tarea = teclado.nextLine();
		boolean encontrado = false;
		int i = 0;

		while (!encontrado && i < tareas.size()) {

			if (tarea.equalsIgnoreCase(tareas.get(i))) {
				System.out.println("Tu tarea " + tareas.get(i) + " ha sido eliminada.");
				tareas.remove(i);
				encontrado = true;
			} else {
				System.err.println("Tu tarea " + tarea + " no está en la lista.");
				i++;
			}

		}*/

	}

}
