package ejercicio4;

import java.time.LocalDate;

public class Celular {
	private String modelo;
	private Contacto[] contactos;
	
	private int contadorContactos;
	public Celular(String modelo, int cantidadContactos) {
		this.modelo = modelo;
		contactos = new Contacto[cantidadContactos];
		this.contadorContactos = 0;
	}
	
	public boolean agregarContacto(Contacto contacto) {
		if (contadorContactos >= contactos.length) {
			System.out.println("Ya no hay lugar para más contactos");
			return false;
		}
		
		contactos[contadorContactos++] = contacto;
		System.out.println("Contacto agregado con exito");
		return true;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void verPromedioEdad() {
		int acumuladorEdad = 0;
		for (int i = 0; i < contadorContactos; i++) 
			acumuladorEdad+= contactos[i].getEdad();
		
		float promedioEdad = acumuladorEdad / (float)contadorContactos;
		System.out.println("El promedio de edad de los contactos es de: " + promedioEdad + " anios");
	}
	
	public void verContactos() {
		if (contadorContactos != 0)
			for (int i = 0; i < contadorContactos; i++) 
				System.out.println(contactos[i].toString());
		else
			System.out.println("No hay contactos cargados en el dispositivo");
	}
	
	public void verContactosRepetidos() {
		for (int i = 0; i < contadorContactos; i++) {
			Contacto contactoActual = contactos[i];
			for (int j = i + 1; j < contadorContactos; j++)
				if (contactoActual.equals(contactos[j]))
					System.out.println(contactoActual.toString());
		}
	}
	
	public void contactosConNumeroCompartido() {
		for (int i = 0; i < contadorContactos; i++) {
			Contacto contactoActual = contactos[i];
			for (int j = i + 1; j < contadorContactos; j++)
				if (contactoActual.getNroTelefono() == contactos[j].getNroTelefono())
					System.out.println(contactoActual.toString());
		}
	}
	
	public static void main(String[] args) {
		Celular celu1 = new Celular("Samsung J7", 4);
		
		Contacto contacto1 = new Contacto("Mateo", "Alonso", LocalDate.of(2002, 6, 6), "2266525267", "Tandil", "mateo@gmail.com", 22);
		Contacto contacto2 = new Contacto("Graciela", "Calfumil", LocalDate.of(1963, 6, 29), "2266480734", "Balcarce", "graciela@gmail.com", 60);
		
		celu1.agregarContacto(contacto1);
		celu1.agregarContacto(contacto2);
		
		celu1.verContactos();
	}
}
