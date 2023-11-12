package m8_3banco1;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_3banco1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		boolean salir = false;		

		Cliente cliente1 = new Cliente("luisa", "blue");
		clientes.add(cliente1);
		Cuenta cuenta1 = new Cuenta(1, 0);
		cliente1.agregarCuenta(cuenta1);

		System.out.println(cliente1);

		do {
			switch (menu()) {
			case 0:
				System.out.println("Hasta pronto!.");
				salir = true;
				break;
			case 1:
				Cliente cliente = pedirDatos();
				Cliente clienteBuscado = buscarCliente(cliente, clientes);
				crearCliente(clientes, cliente, clienteBuscado);
				break;
			case 2:
				cliente = pedirDatos();
				clienteBuscado = buscarCliente(cliente, clientes);
				eliminarCliente(clientes, clienteBuscado);
				break;
			case 3:
				cliente = pedirDatos();
				clienteBuscado = buscarCliente(cliente, clientes);
				crearCuentaCliente(clientes, clienteBuscado);
				break;
			case 4:
				cliente = pedirDatos();
				clienteBuscado = buscarCliente(cliente, clientes);
				ingresar(clientes, clienteBuscado);
				break;
			case 5:
				cliente = pedirDatos();
				clienteBuscado = buscarCliente(cliente, clientes);
				retirar(clientes, clienteBuscado);
				;
				break;
			case 6:
				cliente = pedirDatos();
				clienteBuscado = buscarCliente(cliente, clientes);
				verCliente(clientes, clienteBuscado);
				break;
			case 7:
				vertodosClientes(clientes);
				break;

			}

		} while (!salir);
	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 7;

		do {
			System.out.println("\n*****YOUBANK*****\n");
			System.out.println("0. Salir.");
			System.out.println("1. Crear clientx.");
			System.out.println("2. Eliminar clientx.");
			System.out.println("3. Crear cuenta clientx.");
			System.out.println("4. Ingresar en cuenta clientx.");
			System.out.println("5. Retirar de cuenta clientx.");
			System.out.println("6. Ver Clientx.");
			System.out.println("7. Ver todos lxs Clientes.");

			opcion = teclado.nextByte();
			teclado.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoge una opción válida.");
			}

		} while (opcion < MINIMO || opcion > MAXIMO);

		return opcion;
	}

	public static Cliente pedirDatos() {
		Cliente cliente = null;

		System.out.println("Dime el nombre del clientx:");
		String nombre = teclado.nextLine().toLowerCase();
		System.out.println("Dime el apellido del clientx:");
		String apellido = teclado.nextLine().toLowerCase();

		cliente = new Cliente(nombre, apellido);

		return cliente;
	}

	public static Cliente buscarCliente(Cliente cliente, ArrayList<Cliente> clientes) {
		boolean encontrado = false;
		Cliente clienteBuscado = null;
		int i = 0;

		while (!encontrado && i < clientes.size()) {
			if ((clientes.get(i).getNombre().equalsIgnoreCase(cliente.getNombre())
					&& (clientes.get(i).getApellido().equalsIgnoreCase(cliente.getApellido())))) {
				clienteBuscado = clientes.get(i);
				encontrado = true;
			}
			i++;
		}

		return clienteBuscado;
	}

	public static int buscarCuenta(int numCuenta, Cliente clienteBuscado) {
		boolean encontrado = false;
		int posicionCuenta = -1;
		int i = 0;

		while (!encontrado && i < clienteBuscado.getCuentas().size()) {
			if (clienteBuscado.getCuentas().get(i).getNumCuenta() == numCuenta) {
				posicionCuenta = i;
				encontrado = true;
			}
			i++;
		}

		return posicionCuenta;
	}

	public static void crearCliente(ArrayList<Cliente> clientes, Cliente cliente, Cliente clienteBuscado) {

		if (clienteBuscado != null) {
			System.out.println("El cliente ya existe en nuestra base de datos.");

		} else {
			cliente = new Cliente(cliente.getNombre(), cliente.getApellido());
			clientes.add(cliente);
			System.out.println("El cliente ha sido creado.");
		}

	}

	public static void crearCuentaCliente(ArrayList<Cliente> clientes, Cliente clienteBuscado) {

		if (clienteBuscado != null) {

			System.out.println("Dime el número de cuenta que quieres crear:");
			int numCuenta = teclado.nextInt();

			int posicionCuenta = buscarCuenta(numCuenta, clienteBuscado);

			if (posicionCuenta == -1) {
				Cuenta cuenta = new Cuenta(numCuenta, 0);
				clienteBuscado.agregarCuenta(cuenta);
				System.out.println("La Cuenta " + numCuenta + " ha sido creada.");
			} else {
				System.err.println(clienteBuscado + " ya tiene esta cuenta.");
			}

		} else {
			System.err.println("El cliente no existe en nuestra base de datos.");
		}

	}

	public static void eliminarCliente(ArrayList<Cliente> clientes, Cliente clienteBuscado) {

		if (clienteBuscado != null) {
			clientes.remove(clienteBuscado);
			System.out.println("El cliente " + clienteBuscado + " ha sido eliminado.");
		} else {
			System.err.println("El cliente no existe en nuestra base de datos.");
		}
	}

	public static void ingresar(ArrayList<Cliente> clientes, Cliente clienteBuscado) {

		System.out.println("Dime en que cuenta quieres ingresar.");
		int numCuenta = teclado.nextInt();

		int posicionCuenta = buscarCuenta(numCuenta, clienteBuscado);

		if (posicionCuenta != -1) {
			System.out.println("Cuánto dinero quieres ingresar en tu cuenta?");
			int ingreso = teclado.nextInt();
			clienteBuscado.getCuentas().get(posicionCuenta).ingresar(ingreso);
			System.out.println(clienteBuscado.getCuentas().get(posicionCuenta));

		} else {
			System.err.println("La cuenta no existe.");
		}

	}
	
	public static void retirar(ArrayList<Cliente> clientes, Cliente clienteBuscado) {

		System.out.println("Dime de que cuenta quieres retirar.");
		int numCuenta = teclado.nextInt();

		int posicionCuenta = buscarCuenta(numCuenta, clienteBuscado);

		if (posicionCuenta != -1) {
			System.out.println("Cuánto dinero quieres retirar de tu cuenta?");
			int retiro = teclado.nextInt();
			clienteBuscado.getCuentas().get(posicionCuenta).retirar(retiro);
			System.out.println(clienteBuscado.getCuentas().get(posicionCuenta));

		} else {
			System.err.println("La cuenta no existe.");
		}

	}

	public static void verCliente(ArrayList<Cliente> clientes, Cliente clienteBuscado) {

		if (clienteBuscado != null) {
			System.out.println(clienteBuscado);
		} else {
			System.err.println("El cliente no existe en nuestra base de datos.");
		}
	}

	public static void vertodosClientes(ArrayList<Cliente> clientes) {

		for (Cliente cliente : clientes) {
			System.out.println("\n" + cliente);

		}
	}

}
