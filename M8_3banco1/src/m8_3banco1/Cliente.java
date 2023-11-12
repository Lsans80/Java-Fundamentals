package m8_3banco1;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> cuentas;

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = new ArrayList<Cuenta>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	public void mostrarCuentas () {
		
		for (Cuenta cuenta : cuentas) {
			cuenta.toString();
		}
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", cuentas=" + cuentas + "]";
	}

}
