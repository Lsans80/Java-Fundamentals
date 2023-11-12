package m8_6Escuderia;

public class Coche {
	private int potencia;
	private int velocidadMax;
	private String Color;
	private int precioMercado;

	public Coche(int potencia, int velocidadMax, String color, int precioMercado) {
		super();
		this.potencia = potencia;
		this.velocidadMax = velocidadMax;
		Color = color;
		this.precioMercado = precioMercado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getPrecioMercado() {
		return precioMercado;
	}

	public void setPrecioMercado(int precioMercado) {
		this.precioMercado = precioMercado;
	}

	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", velocidadMax=" + velocidadMax + ", Color=" + Color
				+ ", precioMercado=" + precioMercado + "]";
	}

}
