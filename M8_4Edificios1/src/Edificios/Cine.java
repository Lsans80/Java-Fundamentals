package Edificios;

public class Cine extends Edificio {
	private int aforo;

	public Cine(String nombre, int numPlantas, int superficie, int aforo) {
		super(nombre, numPlantas, superficie);
		this.aforo = aforo;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public void proyectarSesion(int asistentes, float precioEntrada) {
		float recaudacion = 0;

		if (asistentes > aforo) {
			System.out.println("Los asistentes superan el aforo.");
			recaudacion = asistentes * precioEntrada;

		} else {
			System.out.println("Se han recaudado " + recaudacion + " Euros.");
			recaudacion = asistentes * precioEntrada;
		}

	}

	@Override
	public void calcularCostevigilancia() {
		int salarioVigilante = 1300;
		final int METROSXVIGILANTE = 3000;
		double empleados = (float)Math.ceil(superficie / METROSXVIGILANTE);

		System.out.println("El coste de vigilancia es de " + (int) (salarioVigilante * empleados) + " y necesitas "
				+ (int) empleados + " empleados.");

	}

	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", numPlantas=" + numPlantas + ", superficie=" + superficie + ", aforo="
				+ aforo + "]";
	}

}
