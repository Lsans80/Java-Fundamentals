package empleados;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int antiguedad;
	protected static int sueldoBase = 50000;
	protected static int plusAntiguedad = 10000;
	protected int sueldo;

	public Empleado(String nombre, String apellido, int edad, int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.antiguedad = antiguedad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getPlusAntiguedad() {
		return plusAntiguedad;
	}

	public void setPlusAntiguedad(int plusAntiguedad) {
		this.plusAntiguedad = plusAntiguedad;
	}

	public abstract void calcularSueldo();

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
