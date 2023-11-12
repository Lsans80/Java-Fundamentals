package empleados;

public class Piloto extends Empleado {
	private float altura;
	private float peso;
	private static int plusPeligrosidad = 50000;

	public Piloto(String nombre, String apellido, int edad, int antiguedad, float altura, float peso) {
		super(nombre, apellido, edad, antiguedad);
		this.altura = altura;
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public static int getPlusPeligrosidad() {
		return plusPeligrosidad;
	}

	public static void setPlusPeligrosidad(int plusPeligrosidad) {
		Piloto.plusPeligrosidad = plusPeligrosidad;
	}

	@Override
	public void calcularSueldo() {

		sueldo = sueldoBase + (plusAntiguedad * antiguedad) + plusPeligrosidad;

		System.out.println("El sueldo es de " + sueldo + " anual.");

	}

	@Override
	public String toString() {
		return "Piloto [altura=" + altura + ", peso=" + peso + "]";
	}

}
