package m8_claseCoche;

public class Coche {
	private String marca;
	private String modelo;
	private String matricula;
	private int potencia;
	private int cilindrada;
	private String color;

	public Coche() {

	}

	public Coche(String marca, String modelo, String matricula, int potencia, int cilindrada, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void arrancar() {
		System.out.println("Estoy arrancando.");
	}

	public void acelerar() {
		System.out.println("Estoy acelerando.");
	}

	public void frenar() {
		System.out.println("Estoy frenando.");
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", potencia=" + potencia
				+ ", cilindrada=" + cilindrada + ", color=" + color + "]";
	}

}
