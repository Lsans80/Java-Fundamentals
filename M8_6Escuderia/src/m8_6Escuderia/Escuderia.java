package m8_6Escuderia;

import java.util.ArrayList;

import empleados.Empleado;

public class Escuderia {
	private String nombre;
	private int presupuesto;
	private String pais;
	private ArrayList<Coche> coches;
	private ArrayList<Empleado> empleados;

	public Escuderia(String nombre, int presupuesto, String pais) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.pais = pais;
		this.coches = new ArrayList<Coche>();
		this.empleados = new ArrayList<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getPais() {
		return pais;
	}

	public ArrayList<Coche> getCoches() {
		return coches;
	}

	public void agregarCoches(Coche coche) {
		coches.add(coche);
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void agregarEmpleados(Empleado empleado) {
		this.empleados.add(empleado);
	}

	@Override
	public String toString() {
		return "Escuderia [nombre=" + nombre + ", presupuesto=" + presupuesto + ", pais=" + pais + ", coches=" + coches
				+ ", empleado=" + empleados + "]";
	}

}
