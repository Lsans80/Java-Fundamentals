package Edificios;

public class Hotel extends Edificio {
	private int numHabitaciones;
	private final int PLUSPELIGROSIDAD = 500;

	public Hotel(String nombre, int numPlantas, int superficie, int numHabitaciones) {
		super(nombre, numPlantas, superficie);
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getPLUSPELIGROSIDAD() {
		return PLUSPELIGROSIDAD;
	}

	public void servicioHabitaciones() {
		int salarioxEmpleado = 1000;
		int totalEmpleados = numHabitaciones / 20;

		System.out.println("El coste del servicio de habitaciones mensual es de " + salarioxEmpleado * totalEmpleados
				+ " Euros y necesitas " + totalEmpleados + " empleados.");
	}

	@Override
	public void calcularCostevigilancia() {
		int salarioVigilante = 1300 + PLUSPELIGROSIDAD;
		final int METROSXVIGILANTE = 1000;
		float empleados = (float) Math.ceil(superficie / METROSXVIGILANTE);

		System.out.println("El coste de vigilancia es de " + (int) (salarioVigilante * empleados) + " y necesitas "
				+ (int) empleados + " empleados.");

	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", numPlantas=" + numPlantas + ", superficie=" + superficie
				+ ", numHabitaciones=" + numHabitaciones + "]";
	}

}
