package Edificios;

public class Hospital extends Edificio {
	private int enfermos;
	private final int RACIONES = 3;	

	public Hospital(String nombre, int numPlantas, int superficie, int enfermos) {
		super(nombre, numPlantas, superficie);
		this.enfermos = enfermos;
	}

	public int getEnfermos() {
		return enfermos;
	}

	public void setEnfermos(int enfermos) {
		this.enfermos = enfermos;
	}

	public int getRACIONES() {
		return RACIONES;
	}
	
	public void repartirComida() {
		int totalRaciones = enfermos*RACIONES;
		
		System.out.println("Se están repartiendo " + totalRaciones + " raciones de comida.");
	}


	@Override
	public void calcularCostevigilancia() {
		int salarioVigilante = 1300;
		final int METROSXVIGILANTE = 1000;
		float empleados = (float) Math.ceil(superficie / METROSXVIGILANTE);

		System.out.println("El coste de vigilancia es de " + (int) (salarioVigilante * empleados) + " y necesitas "
				+ (int) empleados + " empleados.");

	}

	@Override
	public String toString() {
		return "Hospital [nombre=" + nombre + ", numPlantas=" + numPlantas + ", superficie="
				+ superficie + " , enfermos=" + enfermos + "]";
	}
	
	

	

}
