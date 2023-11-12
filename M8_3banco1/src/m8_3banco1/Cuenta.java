package m8_3banco1;

public class Cuenta {
	private int numCuenta;
	private int saldo;

	public Cuenta(int numCuenta, int saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public int ingresar(int cantidad) {
		saldo = saldo + cantidad;

		return saldo;
	}

	public int retirar(int cantidad) {

		if (cantidad > saldo) {
			System.err.println("No hay suficiente saldo.");
		} else {
			saldo = saldo - cantidad;
		}

		return saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}

}
