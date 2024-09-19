package ejercicio4;

import java.time.LocalDateTime;

public class Club {
	private String nombre;
	/*
	 Tengo dos arreglos que contienene n cantidad de canchas segun el establecimiento
	 Dentro de cada cancha puedo tener variaciones como tamaños, cantidad jugadores, precios, etc.
	*/
	private Futbol[] canchasFutbol;
	private Padel[] canchasPadel;
	private Usuario[] usuarios;
	
	// el club lleva un registro de socios, son usuarios que almenos han reservado 4 turnos en los ultimos dos meses
	
	public Club(String nombre, int cantCanchasFutbol, int cantCanchasPadel, int cantUsuarios) {
		this.nombre = nombre;
		canchasFutbol = new Futbol[cantCanchasFutbol];
		canchasPadel = new Padel[cantCanchasPadel];
		usuarios = new Socio[cantUsuarios];
	}
	
	public String reservarCancha(Cancha cancha, LocalDateTime inicio, Usuario usuario, int duracion) {
		// codigo...
		if (cancha.estaReservada())
			return "La cancha ya esta reservada";
		
		Turno nuevoTurno = new Turno(cancha, inicio, duracion, usuario);
		cancha.setReservacion(true);
		return "La cancha de " + cancha.getTipo() + " fue reservada en el horario de " + inicio + " con un partido de " + duracion + " minutos por el usuario llamado " + usuario.getNombre() + " el cual es socio? " + usuario.esSocio();
	}
	
	public String estaDisponible(Cancha cancha) {
		if (!cancha.estaReservada())
			return "La cancha está disponible";
		return "La cancha está ocupada";
	}
	
	public static void main(String[] args) {
		Club clubNahuel = new Club("Club Nahuel", 4, 2, 50);
		
		/*Cuando maneje ArrayList voy a tener la oportunidad de delegar esta responsabilidad a un metodo que cree las canchas*/
		Futbol canchaFutbol1 = new Futbol(11);
		Futbol canchaFutbol2 = new Futbol(11);
		
		Padel canchaPadel1 = new Padel(5);
		Padel canchaPadel2 = new Padel(5);
		
		clubNahuel.reservarCancha(canchaFutbol1, LocalDateTime.now(), new Usuario("Mateo"), 0);
		
		System.out.println(clubNahuel.estaDisponible(canchaFutbol1));
	}
}
