package m8_1Ordenador;

import java.util.Objects;

public class Ordenador {
	private String marca;
	private String modelo;
	private String procesador;
	private int ram;
	private int hdd;

	public Ordenador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Ordenador(String marca, String modelo, String procesador, int ram, int hdd) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.ram = ram;
		this.hdd = hdd;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String ejecutando(String programa) {
		String mensaje;

		mensaje = "En ordenador está ejecutando: " + programa + ".";

		return mensaje;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordenador other = (Ordenador) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram
				+ ", hdd=" + hdd + "]";
	}

}
