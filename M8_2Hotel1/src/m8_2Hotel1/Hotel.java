package m8_2Hotel1;

public class Hotel {
	private String nombre;
	private int habitaciones;
	private int plantas;
	private int superficie;

	public Hotel(String nombre, int habitaciones, int plantas, int superficie) {
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.plantas = plantas;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getPlantas() {
		return plantas;
	}

	public void setPlantas(int plantas) {
		this.plantas = plantas;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public void calcularMantenimiento() {
		int habxEmpleado = 20;
		final int SALARIOEMPLEADO = 1500;
		float empleados;

		empleados = (float) habitaciones / habxEmpleado;
		empleados = (float) (Math.ceil(empleados));
		int totalSalario = (int) (empleados * SALARIOEMPLEADO);

		System.out.println("El coste de limpieza es de " + totalSalario + " y necesitas " + (int)empleados + " empleados.");

	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", habitaciones=" + habitaciones + ", plantas=" + plantas + ", superficie="
				+ superficie + "]";
	}

}
