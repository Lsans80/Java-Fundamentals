package examen2;

import java.util.ArrayList;

public class Examen2 {

	public static void main(String[] args) {
		ArrayList<String> prodDisponibles = new ArrayList<String> ();
		ArrayList<String> prodAcomprar = new ArrayList<String> ();
		ArrayList<String> prodComprados = new ArrayList<String> ();
		
			prodDisponibles.add("champu");
			prodDisponibles.add("jabon");
			prodDisponibles.add("patatas");
			prodDisponibles.add("acelgas");
			prodDisponibles.add("lechuga");
			prodDisponibles.add("limones");
			prodDisponibles.add("kiwis");
			prodDisponibles.add("aguacates");
			prodDisponibles.add("fideos");
			prodDisponibles.add("arroz");
			prodDisponibles.add("cafe");
			prodDisponibles.add("chocolate");
			
			prodAcomprar.add("champu");
			prodAcomprar.add("chocolate");
			prodAcomprar.add("aguacates");
			prodAcomprar.add("acelgas");
			prodAcomprar.add("limones");
			prodAcomprar.add("limonada");
			
			for (int i = 0; i < prodDisponibles.size(); i++) {
				
				for (int j = 0; j < prodAcomprar.size(); j++) {
					if (prodDisponibles.get(i).equalsIgnoreCase(prodAcomprar.get(j))) {
						prodComprados.add(prodAcomprar.get(j));
					}
				}
			}
			
			System.out.println("Los productos comprados son " + prodComprados);
	}

}
