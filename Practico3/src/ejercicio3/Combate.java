package ejercicio3;

public class Combate {
	private Personaje luchador1, luchador2;
	
	public Combate(Personaje luchador1, Personaje luchador2) {
		this.luchador1 = luchador1;
		this.luchador2 = luchador2;
	}
	
	public void enfrentar(Personaje luchador1, Personaje luchador2) {
		System.out.println("El combate entre " + luchador1.getAlias() + " y " + luchador2.getAlias() + " ha comenzado!");
		/*	
		 Mi sistema de combate evalua primero si ambos personajes estan vivos
		luego en base a la velocidad de cada uno determinamos quien ataca primero
		*/
		while (luchador1.estaVivo() && luchador2.estaVivo()) {
			if (luchador1.getVelocidad() > luchador2.getVelocidad()) {
				luchador1.atacar(luchador2);
				if (luchador2.estaVivo()) {
					luchador2.atacar(luchador1);
				}
			}
			else {
				luchador2.atacar(luchador1);
				if (luchador1.estaVivo()) {
					luchador1.atacar(luchador2);
				}
			}
			System.out.println(luchador1.getAlias() + " hp: " + luchador1.getHpActual());
			System.out.println(luchador2.getAlias() + " hp: " + luchador2.getHpActual());
		}
		
		if (luchador1.estaVivo())
			System.out.println("El combate finalizo, ha ganado " + luchador1.getAlias());
		else
			System.out.println("El combate finalizo, ha ganado " + luchador2.getAlias());
	}
}
