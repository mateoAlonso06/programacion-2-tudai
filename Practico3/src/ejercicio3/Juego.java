package ejercicio3;
/* Juego el cual contiene heroes y villanos, cada uno de ellos posee ciertas cualidades
 * - Las cualidades tienen un nivel asociado
 * 
 * --- Mecanismo del juego --
 * 1.Enfrentar un personaje con otro (PvP) y decidir cual es el ganador
 * 2.Para decidir el ganador se utiliza el valor de una caracteristica, ej fuerza, velocidad. 
 * 3.En caso de empate se decidide por el valor de otra caracteristica
 */
public class Juego {
	private String nombreJuego;
	private Heroe[] heroes;
	private Villano[] villanos;
	// mi clase combate gestiona la logica del combate entre los personajes
	private Combate combate;
	
	private int contadorHeroes;
	private int contadorVillanos;
	
	public Juego(String nombreJuego, int cantHeroes, int cantVillanos) {
		this.nombreJuego = nombreJuego;
		this.heroes = new Heroe[cantHeroes];
		this.villanos = new Villano[cantVillanos];
		
		this.contadorHeroes = 0;
		this.contadorVillanos = 0;
	}
	
	public void agregarHeroe(Heroe heroe) {
		if (contadorHeroes >= heroes.length) {
			System.out.println("Ya no hay lugar para más heroes");
			return;
		}
		
		if (!personajeYaExiste(heroes, heroe, contadorHeroes)) {
			heroes[contadorHeroes++] = heroe;
			System.out.println("El heroe " + heroe.getAlias() +" fue agregado al juego con exito");
		} else {
			System.out.println("El heroe ya fue agregado con anterioridad al programa");
		}
	}
	
	public void agregarVillano(Villano villano) {
		if (contadorVillanos >= villanos.length) {
			System.out.println("Ya no hay lugar para más villanos");
			return;
		}
		
		if (!personajeYaExiste(villanos, villano, contadorVillanos)) {
			villanos[contadorVillanos++] = villano;
			System.out.println("El villano " + villano.getAlias() +" fue agregado al juego con exito");
		} else {
			System.out.println("El villano ya fue agregado con anterioridad al programa");
		}
	}
	
	// Este metodo me permite verificar si existe un personaje o no dentro del arreglo especificado
	private boolean personajeYaExiste(Personaje[] personajes, Personaje personaje, int contador) {
		int i = 0;
		boolean encontrado = false;
		while (i < contador && !encontrado) {
			if (personajes[i].getAlias().equalsIgnoreCase(personaje.getAlias()));
				encontrado = true;
			i++;
		}
		return encontrado;
	}
	
	public void comenzarCombate(Personaje luchador1, Personaje luchador2) {
		Combate combate = new Combate(luchador1, luchador2);
		combate.enfrentar(luchador1, luchador2);
	}
	
	public static void main(String[] args) {
		Juego juego = new Juego("Avengers", 2, 2);
		// String nombreReal, float peso, float altura, int edad, String alias, boolean visionNoctura, float velocidad, float fuerza
		Heroe spiderman = new Heroe("Peter Parker", 75.0f, 1.78f, 18, "Spiderman", true, 90.0f, 55.0f);
		Heroe ironman = new Heroe("Tony Stark", 82.0f, 1.85f, 40, "Iron man", true, 75.0f, 80.0f);
		
		Villano thanos = new Villano("Thanos", 447.5f, 2.44f, 1000, "Thanos", false, 75.0f, 100.0f);
		Villano venom = new Villano("Eddie Brock", 104.3f, 1.91f, 35, "Venom", true, 80.0f, 85.0f);
		
		juego.comenzarCombate(spiderman, venom);
		juego.comenzarCombate(thanos, ironman);
	}
}
