package ejercicio1;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("43.855.104");
		persona1.setNombre("Mateo");
		persona1.setApellido("Alonso");
		persona1.setEdad(22);
		persona1.setFechaNacimiento(LocalDate.of(2002, 6, 6));
		persona1.setSexo("Masculino");
		persona1.setPeso(74.5f);
		persona1.setAltura(1.80f);
		
		System.out.println("El IMC es de: " + persona1.calcularIMC());
		
		if (persona1.estaEnForma()) 
			System.out.println("Esta en forma");
		else
			System.out.println("No está en forma");
		
		if (persona1.cumpleAniosHoy())
			System.out.println("Hoy es el cumpleaños");
		
		if (persona1.esMayorDeEdad())
			System.out.println("Es mayor de edad");
		
		if (persona1.puedeVotar())
			System.out.println("Puede votar");
		
		if (persona1.corroborarEdad())
			System.out.println("La edad ingresada es correcta");
	}
}
