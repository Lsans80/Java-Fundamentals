package m8_clasePersona;

public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;

	public Persona(String nombre, String apellido1, String apellido2, int edad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
	}

	public Persona(String nombre, String apellido1, String apellido2) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void comer() {
		System.out.println("Estoy comiendo.");
	}

	public void trabajar() {
		System.out.println("Estoy trabajando.");
	}

	public void dormir() {
		System.out.println("Estoy durmiendo.");
	}

	public void jugar() {
		System.out.println("Estoy jugando.");
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ "]";
	}

}
