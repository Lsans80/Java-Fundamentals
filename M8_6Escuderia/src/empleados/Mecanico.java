package empleados;

public class Mecanico extends Empleado {
	private boolean estudios;

	public Mecanico(String nombre, String apellido, int edad, int antiguedad, boolean estudios) {
		super(nombre, apellido, edad, antiguedad);
		this.estudios = estudios;
	}

	public boolean isEstudios() {
		return estudios;
	}

	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}

	@Override
	public void calcularSueldo() {
		sueldo = sueldoBase + (plusAntiguedad * antiguedad);

		System.out.println("El sueldo es de " + sueldo + " anual.");

	}

	@Override
	public String toString() {
		return "Mecanico [estudios=" + estudios + "]";
	}

}
