package Edificios;

import java.text.DecimalFormat;

public abstract class Edificio {
	protected String nombre;
	protected int numPlantas;
	protected int superficie;

	public Edificio(String nombre, int numPlantas, int superficie) {
		this.nombre = nombre;
		this.numPlantas = numPlantas;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumPlantas() {
		return numPlantas;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void limpiarEdificio() {
		float Limpiezaxminuto = superficie / 5;
		float Limpiezaxplanta = (numPlantas-1) * 0.5f;
		float tiempoLimpieza = (Limpiezaxminuto + Limpiezaxplanta) / 60;
		float salarioLimpiezaDiario = tiempoLimpieza;
		float salarioLimpiezaMensual = tiempoLimpieza * 30;
		
		DecimalFormat df = new DecimalFormat("#0.00");
	
		System.out.println("El tiempo de limpieza diario es de " + (df.format(tiempoLimpieza))+ " horas.");
		System.out.println("El coste de la limpieza mensual es de " + salarioLimpiezaMensual + " Euros.");
	}

	public abstract void calcularCostevigilancia();

	@Override
	public String toString() {
		return "Edificio [nombre=" + nombre + ", numPlantas=" + numPlantas + ", superficie=" + superficie + "]";
	}
	
	

}
