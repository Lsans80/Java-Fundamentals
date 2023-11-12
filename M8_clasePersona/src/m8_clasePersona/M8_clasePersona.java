package m8_clasePersona;

public class M8_clasePersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona ("Luisa", "Blue", "Serrano",42);
		Persona persona2 = new Persona ("Natasha", "Red", "Brain");
		
		System.out.println(persona1);
		persona1.comer();
		persona1.dormir();
		persona1.trabajar();
		persona1.setApellido1("Black");
		persona1.setApellido2("Gonzalez");
		persona1.setEdad(35);
		System.out.println(persona1);
		
		System.out.println(persona2);
		persona2.comer();
		persona2.dormir();
		persona2.trabajar();
		persona2.setEdad(40);
		System.out.println(persona2);
			
	}

}
